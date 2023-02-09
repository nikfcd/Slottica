package com.slottica.casino.slotica.slots.sesesese.fragments.model

import android.util.Log
import com.slottica.casino.slotica.slots.sesesese.R


fun loadCardsModel(category:String):ArrayList<CardsModel>{
    val model=ArrayList<CardsModel>()
     if(category=="new") {
        model.add(CardsModel("Book of Ra Deluxe","Travel back in time to ancient Egypt to spin the reels of the Book of Ra Deluxe slot machine by Novomatic. Explore the corners of the pyramid as you complete combinations over the 10 paylines found in this 5x3 slot game. Collect scatter symbols to receive ten free spins, where the Book of Ra will select a random symbol. Watch it expand over the reels, giving you extra wins. Not only that, but you’ll have the chance to double those wins with the gamble feature.", R.drawable.bookdeluxe,"new"))
        model.add(CardsModel("Celestial Sun Riches","If you love great-looking slots with a few unique features up their sleeves, you should definitely take a look at the Celestial Sun Riches slots game. From the unique reels to the amazing symbols, Konami has really outdone themselves with this game. This slot has a whopping 576 paylines for you to play across. There is also a bonus wheel game which could unlock several different special features for you to enjoy. Add in some win multipliers and our review team are certain that this is a game many players will come back to.", R.drawable.celestiariches,"new"))

        model.add(CardsModel("Raging Bull","Play Raging Bull slot online and discover the treasures of the Orient. Hit high-paying combos with ranging bull wilds. Play seven free spin features with wild multipliers and win up to three jackpots. Try this hit slot for free or play Raging Bull for real money at the best online casinos. ", R.drawable.ragingbull,"popular"))

        return model
    }
    if(category=="popular") {
        model.add(CardsModel("Gonzo's Quest","Based on the historical character Gonzalo Pizzaro, the Gonzo's Quest slot features a funny, 3D animated version of the explorer setting off to find Eldorado, the fictional lost city of gold.\n" +
                "\n" +
                "The game begins with a brief, yet entertaining, animated film introducing you to Gonzo's story, where he jumps ship to go off in search of gold on his own. After the video, you're launched directly into the 5-reel, 20-payline game, and Gonzo takes his place to the left of the screen, where he watches and waits to see how much gold you win for him.", R.drawable.gonzosquest,"popular"))
        model.add(CardsModel("Wizard of Oz","Wizard of Oz is a slot game that was developed by WMS and is based on the classic and all time favorite movie The Wizard of Oz. The game contains 5 reels and 30 bet lines with the highest payout being \$50,000. This is a fun game that has some elaborate features. There are free spins, a bonus round, wild symbols, scatters, and great jackpots. The game is mobile friendly as long as you have Adobe flash player installed on your phone.", R.drawable.woz,"popular"))

        return model
    }else{
        model.add(CardsModel("Gonzo's Quest","Based on the historical character Gonzalo Pizzaro, the Gonzo's Quest slot features a funny, 3D animated version of the explorer setting off to find Eldorado, the fictional lost city of gold.\n" +
                "\n" +
                "The game begins with a brief, yet entertaining, animated film introducing you to Gonzo's story, where he jumps ship to go off in search of gold on his own. After the video, you're launched directly into the 5-reel, 20-payline game, and Gonzo takes his place to the left of the screen, where he watches and waits to see how much gold you win for him.", R.drawable.gonzosquest,"popular"))
        model.add(CardsModel("Wizard of Oz","Wizard of Oz is a slot game that was developed by WMS and is based on the classic and all time favorite movie The Wizard of Oz. The game contains 5 reels and 30 bet lines with the highest payout being \$50,000. This is a fun game that has some elaborate features. There are free spins, a bonus round, wild symbols, scatters, and great jackpots. The game is mobile friendly as long as you have Adobe flash player installed on your phone.", R.drawable.woz,"popular"))
        model.add(CardsModel("Golden Goddess","International Gaming Technology (IGT) has one of the most impressive lineups of slot games among developers around the world. Golden Goddess is an exciting slots game based on a fantasy theme. IGT has been constantly innovating so as to make games more player-friendly. With Golden Goddess, IGT has captured the main theme of slot games – entertainment and high payouts – which is evident from players flocking to this game in every IGT casino.\n" +
                "\n" +
                "IGT has been developing games for over four decades now, and has been successful in maintaining a spotless reputation of creating quality games throughout its career. IGT games are a general favorite among all slot enthusiasts, and there is always someone playing at one of the IGT machines in any casino. With the acquisition of WagerWorks, IGT has successfully entered the online gambling industry, and currently provides software and platform for many online casino sites.", R.drawable.ggoddess,"popular"))
        model.add(CardsModel("Book of Ra Deluxe","Travel back in time to ancient Egypt to spin the reels of the Book of Ra Deluxe slot machine by Novomatic. Explore the corners of the pyramid as you complete combinations over the 10 paylines found in this 5x3 slot game. Collect scatter symbols to receive ten free spins, where the Book of Ra will select a random symbol. Watch it expand over the reels, giving you extra wins. Not only that, but you’ll have the chance to double those wins with the gamble feature.", R.drawable.bookdeluxe,"new"))
        model.add(CardsModel("Celestial Sun Riches","If you love great-looking slots with a few unique features up their sleeves, you should definitely take a look at the Celestial Sun Riches slots game. From the unique reels to the amazing symbols, Konami has really outdone themselves with this game. This slot has a whopping 576 paylines for you to play across. There is also a bonus wheel game which could unlock several different special features for you to enjoy. Add in some win multipliers and our review team are certain that this is a game many players will come back to.", R.drawable.celestiariches,"new"))

        model.add(CardsModel("Raging Bull","Play Raging Bull slot online and discover the treasures of the Orient. Hit high-paying combos with ranging bull wilds. Play seven free spin features with wild multipliers and win up to three jackpots. Try this hit slot for free or play Raging Bull for real money at the best online casinos. ", R.drawable.ragingbull,"popular"))

        return model
    }
}
fun loadNewsModel():ArrayList<NewsModel>{
    val model=ArrayList<NewsModel>()
    model.add(NewsModel("Genius Sports Launches Genius Marketing Suite","Last Updated 07/02/2023 10:32am • Stephen Ross"))
    model.add(NewsModel("FunFair Games Rebrands","Last Updated 07/02/2023 10:03am • Abigail Moses"))
    model.add(NewsModel("Pariplay Launches Game-changing New Client Area for Fusion Partners","Last Updated 07/02/2023 9:57am • Abigail Moses"))
    model.add(NewsModel("Evolution Unveils Latest iGaming Products at ICE.","Last Updated 07/02/2023 9:50am • Andrew Jones"))
    model.add(NewsModel("Huddle Announces Genius Sports as Official Data Partner","Last Updated 07/02/2023 6:04am • Abigail Moses"))
    model.add(NewsModel("Salsa Technology Enhances Salsa Gator Offering with PopOK Gaming Tie-up","Last Updated 06/02/2023 1:29pm • Beth Woods"))
    model.add(NewsModel("GAMOMAT Wins Charitable Community Award at International Gaming Awards","Last Updated 08/02/2023 1:17pm • Abigail Moses"))
    model.add(NewsModel("FinteqHub Enters iGaming Market as a Standalone Payment Gateway Built by SOFTSWISS","Last Updated 03/02/2023 9:02am • Andrew Jones"))
    model.add(NewsModel("Online Operator In Touch Games Fined £6.1m ","Last Updated 01/02/2023 2:04pm • Beth Woods"))
    model.add(NewsModel("888 Shares Decline as CEO is Fired","Last Updated 01/02/2023 12:52pm • Beth Woods"))
    return model
}