package com.slottica.casino.slotica.slots.sesesese

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.slottica.casino.slotica.slots.sesesese.Const.PREF
import com.slottica.casino.slotica.slots.sesesese.Prefs.link
import com.slottica.casino.slotica.slots.sesesese.databinding.ActivityScotBinding


class ScotActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScotBinding
    private lateinit var rtfgfbvgftr: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        binding = ActivityScotBinding.inflate(layoutInflater)
        val prefs = Prefs.getPref(this, PREF)
        rtfgfbvgftr = binding.webView
        rtfgfbvgftr.webViewClient = MyWebViewClient()
        with(rtfgfbvgftr.settings) {
            javaScriptEnabled = true
            domStorageEnabled = true
            setSupportZoom(false)
        }
        rtfgfbvgftr.loadUrl(prefs.link!!)

        binding.root.setOnRefreshListener {
            if (rtfgfbvgftr.url == null) {
                rtfgfbvgftr.loadUrl(prefs.link!!)
            } else {
                rtfgfbvgftr.reload()
            }
        }

        rtfgfbvgftr.viewTreeObserver.addOnScrollChangedListener {
            binding.root.isEnabled = rtfgfbvgftr.scrollY == 0
        }


        val mCallback = onBackPressedDispatcher.addCallback(this) {
            if (rtfgfbvgftr.canGoBack()) {
                rtfgfbvgftr.goBack()
            } else {
                finish()
            }
        }
        mCallback.isEnabled = true

        setContentView(binding.root)
    }

    private inner class MyWebViewClient : WebViewClient() {


        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            super.onPageStarted(view, url, favicon)
            binding.webView.visibility = View.VISIBLE
            binding.csError.visibility=View.INVISIBLE
            binding.progressIndicator.visibility = View.VISIBLE
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            Log.e("weburl",url!!)
            binding.root.isRefreshing = false
            binding.progressIndicator.visibility = View.INVISIBLE
        }

        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            super.onReceivedError(view, errorCode, description, failingUrl)
            binding.webView.visibility = View.GONE
            binding.csError.visibility=View.VISIBLE

        }


    }

    override fun onBackPressed() {


    }




}