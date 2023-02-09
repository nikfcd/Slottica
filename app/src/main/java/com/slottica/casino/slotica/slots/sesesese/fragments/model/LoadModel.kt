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
    model.add(NewsModel("Genius Sports Launches Genius Marketing Suite","Last Updated 07/02/2023 10:32am • Stephen Ross",R.drawable.enius_arketing_u1 ,"Genius Sports, the official data, technology and broadcast partner that powers the global ecosystem connecting sports, betting and media, has announced the launch of Genius Marketing Suite, an all-in-one fan engagement engine specifically developed to transform how a range of partners identify, engage and retain sports fans.\n" +
            "\n" +
            "Today’s sports fans expect personalised and authentic experiences. Genius Marketing Suite enables brands, sponsors, sportsbooks, leagues and teams, to meet those needs and power every stage of their fan marketing journey.\n" +
            "\n" +
            "The suite of products combines a sports-centric media buying service, that provides marketing teams access to millions of fans worldwide, with a dynamic creative solution that makes it easy to design, automate and distribute personalised video and display adverts at scale. In addition, the platform features a full set of interactive digital engagement tools, that help brands establish long-term relationships with fans."))
    model.add(NewsModel("FunFair Games Rebrands","Last Updated 07/02/2023 10:03am • Abigail Moses",R.drawable.chaha ,"Pioneering studio FunFair Games has unveiled its new branding and logo, designed to modernise the company’s brand vision, personality and identity, and reinforcing its goal to be a leading premium supplier of next generation content.\n" +
            "\n" +
            "The rebrand underlines FunFair Games' investment in creating a strong brand and identity as part of the company’s ambitious growth plans for 2023.\n" +
            "\n" +
            "The new logo and design have been revealed as the studio prepares to deliver a host of new games in 2023, which will offer a more diverse portfolio consisting of a wider range of mechanics and features. All designed to appeal to operators and players who are looking for something new outside of the current traditional offering."))
    model.add(NewsModel("Pariplay Launches Game-changing New Client Area for Fusion Partners","Last Updated 07/02/2023 9:57am • Abigail Moses",R.drawable.evolut ,"NeoGames S.A (Nasdaq: NGMS) subsidiary Pariplay®, has launched its new, comprehensive Client Area, providing a simple and unique point of service for the marketing and compliance assets within its vast Fusion® portfolio.\n" +
            "\n" +
            "Designed to further consolidate Pariplay’s status as the aggregation partner of choice in regulated markets worldwide, this unique and extensive new Client Area helps to make life easier for operators by delivering a massive number of games assets within a single, easy-to-use site.\n" +
            "\n" +
            "In a first for the industry, operators utilising the Fusion® platform will now be able to quickly search, cross-filter and download marketing assets, game info sheets, game rules and certification files of games within Pariplay’s broad portfolio of high-value, tier-one and localised games."))
    model.add(NewsModel("Evolution Unveils Latest iGaming Products at ICE.","Last Updated 07/02/2023 9:50am • Andrew Jones",R.drawable.huddle ,"At ICE London 2023, which will take place at ExCeL London from February 7–9, the online casino solutions provider Evolution will showcase a selection of its new online games for 2023. This will include innovations from its group brands, including Evolution, NetEnt, Red Tiger, Ezugi, Big Time Gaming, Nolimit City, and DigiWheel. The business will be at booth N1-100. Evolution Group will release more than one hundred new games over the course of 2023.\n" +
            "\n" +
            "Funky Time is one of the new games that will be unveiled by Evolution. This has been described as \"a ’70s disco-themed, bonus and multiplier-laden extravaganza and Evolution’s biggest new game show since Crazy Time.\" \n" +
            "\n" +
            "Another new live game show from Evolution is Extra Chilli Epic Spins, which combines qualities off live casino and slots. \"With several interactive, unique features and bonus rounds, this social experience is perhaps best described as “real-time slots with friends,\" points out the brand."))
    model.add(NewsModel("Huddle Announces Genius Sports as Official Data Partner","Last Updated 07/02/2023 6:04am • Abigail Moses",R.drawable.image00149 ,"Huddle, the next generation iGaming technology provider, has signed a deal with Genius Sports that will see it become the company’s data partner.\n" +
            "\n" +
            "The partnership will give Huddle access to Genius Sports’ official data-driven PreMatch, LiveData and Next Gen Stats (NGS) to deliver real-time feeds and pin-point pricing.\n" +
            "\n" +
            "Genius Sports’ feeds will enable Huddle to better leverage its industry-leading pricing algorithm for US sports. By powering Huddle’s machine-learning based models with its ultra-low latency data Huddle will offer comprehensive pricing solutions for a range of US sports, laying the foundations for industry-wide innovation."))
    model.add(NewsModel("Salsa Technology Enhances Salsa Gator Offering with PopOK Gaming Tie-up","Last Updated 06/02/2023 1:29pm • Beth Woods",R.drawable.image00150 ,"Salsa Technology has further enhanced its Salsa Gator offering with the integration of PopOK Gaming’s diverse portfolio of slots, live casino and instant games onto its platform.\n" +
            "\n" +
            "PopOK Gaming specialises in developing games that each feature eye-popping designs and  dynamic animations. Among the most recognisable titles to join Salsa Gator from PopOK Gaming’s in-house studio are Yummy, Richy Panda, Diamond Flash and 20 Hot Bar.\n" +
            "\n" +
            "Salsa’s market-leading Salsa Gator continues to be a rich source for games that cover a wide spectrum of engaging themes. Every one of the games can be seamlessly accessed through a single integration and are proven to drive positive results for operators across Latin America."))
    model.add(NewsModel("GAMOMAT Wins Charitable Community Award at International Gaming Awards","Last Updated 08/02/2023 1:17pm • Abigail Moses",R.drawable.intoucjaming ,"GAMOMAT, one of the leading independent software developers for slot games, is proud to announce that it has won the Charitable Community Award at the 2023 International Gaming Awards. The awards ceremony was held at the prestigious Savoy Hotel in London on Monday, and it was a night of celebration and recognition for the gaming industry's most impactful and innovative players.\n" +
            "\n" +
            "GAMOMAT's philosophy is built on strong values that prioritise people and their living environment. Social and ecological sustainability are deeply ingrained in the company's corporate culture."))
    model.add(NewsModel("FinteqHub Enters iGaming Market as a Standalone Payment Gateway Built by SOFTSWISS","Last Updated 03/02/2023 9:02am • Andrew Jones",R.drawable.pr ,"A new name in the iGaming market – FinteqHub – will present its PCI DSS certified payment gateway at the ICE London exhibition next week. The novelty, developed by the SOFTSWISS PSP Team, provides access to integrations with various payment systems via a single platform. The application allows businesses to manage financial transactions, set up processing rules, and generate cash flow analytics. \n" +
            "\n" +
            "The product enables connection of all in-demand payment methods, including card payments, open banking, e-wallets and vouchers from Canada, Brazil, Australia, New Zealand, India and various European countries.\n" +
            "\n" +
            "Apart from that, FinteqHub equips operators with a flexible payment infrastructure accommodating a large number of sites and dependencies. The customisable and highly intuitive application allows using FinteqHub as full-fledged back office with real-time monitoring and 24/7 operational support. "))
    model.add(NewsModel("Online Operator In Touch Games Fined £6.1m","Last Updated 01/02/2023 2:04pm • Beth Woods",R.drawable.evolut ,"A compliance evaluation conducted by In Touch Games, which manages 11 websites, including bonusboss.co.uk, cashmo.co.uk, drslot.co.uk, jammymonkey.com, and slotfactory.com, was unsuccessful in March.\n" +
            "\n" +
            "Failures in social responsibility include:\n" +
            "\n" +
            "Waiting seven weeks to interact with a consumer who had been identified for interaction due to unpredictable play patterns and prolonged play times. \n" +
            "\n" +
            "Accepting a customer's claim that they make £6,000 per month without checking it out after the customer account was flagged for excessive spending and late-night gambling."))
    model.add(NewsModel("888 Shares Decline as CEO is Fired","Last Updated 01/02/2023 12:52pm • Beth Woods",R.drawable.intoucjaming ,"Following an internal inquiry into a failure to follow anti-money laundering procedures, online betting giant 888 has fired its chief executive and blocked VIP customer accounts in the Middle East.\n" +
            "\n" +
            "Shares in the Gibraltar-based company, which in 2017 paid £2.2 billion to purchase William Hill's international assets, fell by more than a quarter as investors fueled 888's largest share price decline since 2006. Over the past year, its market value has decreased by more than 70%. "))
    return model
}