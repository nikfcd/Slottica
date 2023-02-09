package com.slottica.casino.slotica.slots.sesesese

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AFLogger
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings
import com.slottica.casino.slotica.slots.sesesese.Const.PREF
import com.slottica.casino.slotica.slots.sesesese.Const.link
import com.slottica.casino.slotica.slots.sesesese.Const.turn
import com.slottica.casino.slotica.slots.sesesese.Prefs.link
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    val apssflyerLib = AppsFlyerLib.getInstance()
    var advertid=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val prefs = Prefs.getPref(this, PREF)
        val remoteConfig: FirebaseRemoteConfig = Firebase.remoteConfig
        val configSettings = remoteConfigSettings {
            minimumFetchIntervalInSeconds = 3600
        }
        GlobalScope.launch {
            val adInfo = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext())
            advertid= adInfo?.id!!
        }
        remoteConfig.setConfigSettingsAsync(configSettings)
        remoteConfig.fetchAndActivate()
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val updated = task.result
                    Log.e("TAG", "Config params updated: $updated")
                    Log.e("TAG", "Config params updated: ${remoteConfig.getBoolean("Off_On")}")
                    Log.e("TAG", "Config params updated: ${remoteConfig.getString("link")}")
                    if (updated){
                        turn=remoteConfig.getBoolean("Off_On")
                        link=remoteConfig.getString("link")
                        if (turn){
                            //On_Off true
                            if (link!=""){
                                //link have
                                apssflyerLib.setHost("","appsflyersdk.com")
                                apssflyerLib.setLogLevel(AFLogger.LogLevel.DEBUG)
                                apssflyerLib.init("fawYwYHxXyxyxXT8WJWVsB",object :
                                    AppsFlyerConversionListener {
                                    override fun onConversionDataSuccess(conversionDataMap: MutableMap<String, Any?>) {
                                    }
                                    override fun onConversionDataFail(error: String?) {
                                    }
                                    override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
                                    }
                                    override fun onAttributionFailure(error: String?) {
                                    }

                                },this)
                                apssflyerLib.start(this)
                                val id=apssflyerLib.getAppsFlyerUID(this@SplashActivity)
                                link= link+"&client_id=${id}&white=${advertid}"
                                prefs.link= link
                                goNext()
                            }else{
                                //link empty
                                goHome()
                            }
                        }else{
                            //On_Off false
                            goHome()
                        }
                    }else{
                        //Изменений в конфиге не было, поэтому проверяем создана ли была ссылка или нет
                        if(prefs.link==""){
                            //cсылка не была создана, открываем заглушку
                            goHome()
                        }else{
                            //ссылка была создана, открываем сайт
                            goNext()
                        }
                    }
                }else {
                    //FirebaseFail
                    goHome()
                }
            }
    }
    fun goHome(){
        startActivity(Intent(this, MainActivity::class.java))
    }
    fun goNext(){
        startActivity(Intent(this,ScotActivity::class.java))
    }
}