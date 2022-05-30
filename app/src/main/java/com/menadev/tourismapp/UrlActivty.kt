package com.menadev.tourismapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_url_activty.*


class UrlActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_url_activty)
        title="حجز الفنادق"
            UrlGoogle.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://steigenbergeraldauresort.com/EN/steigenberger-aldau-beach"))
            startActivity(intent)
        }

        titanicRoyal.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://hwaidak-hotels.com/"))
            startActivity(intent)

        }

        Mamlouk.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.trip.com/hotels/detail?hotelid=2205303&Allianceid=3242848&SID=8120429&ouid=bb7dacbf-e0b5-4dca-a9aa-5ef8ceda712f&checkin=2022-06-06&checkout=2022-06-07&adult=2&children=0&crn=1&curr=AED"))
            startActivity(intent)

        }

        sunny.setOnClickListener {
           val intent=Intent(Intent.ACTION_VIEW,Uri.parse("https://sunnydaysegypt.com/"))
            startActivity(intent)

        }

        baron.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://baronhotels.com/baron-palace-sahl-hasheesh/"))
            startActivity(intent)

        }

        Tropitel.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tropitelhotels.com/tropitel-sahl-hasheesh/"))
            startActivity(intent)
        }

        Hilton.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hilton.com/en/hotels/hrghitw-hilton-hurghada-plaza/"))
            startActivity(intent)
        }

        Meraki.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sunrise-resorts.com/page/1812_SUNRISE_Select_MERAKI_Resort"))
            startActivity(intent)
        }

        Muntajae.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jazhotels.com/hoteldetail/25-egypt-hurghada-jaz-aquamarine?travellers=25-1_25-2_25-3&travellersRoom=1-2_3"))
            startActivity(intent)
        }

        Swiss.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://swissinn.net/hotels/index.php?lang=Hurghada#"))
            startActivity(intent)
        }

        Diamond_Cairo.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/eg/diamond-cairo-apartment.ar.html?aid=357028&label=bin859jc-1DCAcoQ0IOY2Fpcm9fb2xkY2Fpcm9IAVgDaEOIAQGYAQG4ARfIAQzYAQPoAQH4AQKIAgGoAgO4AsbtnpQGwAIB0gIkNTMyY2RkNDctNDhlYS00MTdhLTlmOTQtZmVmYzA5NWY3NWUw2AIE4AIB&sid=093d88802a4817084ff6fcf6ebc9bf46&dest_id=7773;dest_type=district;dist=0;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;req_adults=2;req_children=0;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1653062212;srpvid=b3d4700e5bc102fb;type=total;ucfs=1&#hotelTmpl"))
            startActivity(intent)
        }

        Fouly_Cairo.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/eg/fouly-apartments.ar.html?aid=357028&label=bin859jc-1DCAcoQ0IOY2Fpcm9fb2xkY2Fpcm9IAVgDaEOIAQGYAQG4ARfIAQzYAQPoAQH4AQKIAgGoAgO4AsbtnpQGwAIB0gIkNTMyY2RkNDctNDhlYS00MTdhLTlmOTQtZmVmYzA5NWY3NWUw2AIE4AIB&sid=093d88802a4817084ff6fcf6ebc9bf46&dest_id=7773;dest_type=district;dist=0;group_adults=2;group_children=0;hapos=2;hpos=2;no_rooms=1;req_adults=2;req_children=0;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1653062212;srpvid=b3d4700e5bc102fb;type=total;ucfs=1&#hotelTmpl"))
            startActivity(intent)
        }

        porto_sokhna.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/eg/porto-el-sokhna.en-gb.html?aid=2174455&label=a7500408-a422-4957-b168-361fe21a900a&sid=093d88802a4817084ff6fcf6ebc9bf46&all_sr_blocks=24734401_347511268_2_1_0&checkin=2022-07-10&checkout=2022-07-11&dest_id=900040497&dest_type=city&dist=0&group_adults=2&group_children=0&hapos=1&highlighted_blocks=24734401_347511268_2_1_0&hpos=1&matching_block_id=24734401_347511268_2_1_0&no_rooms=1&req_adults=2&req_children=0&room1=A%2CA&sb_price_type=total&sr_order=popularity&sr_pri_blocks=24734401_347511268_2_1_0__11600&srepoch=1653162091&srpvid=c5dd8a7560cb0365&type=total&ucfs=1&activeTab=main"))
            startActivity(intent)
        }

        mariam_house.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/travel/hotels/%D8%A3%D8%B3%D9%8A%D9%88%D8%B7/entity/ChkI-avs4O6sqs0iGg0vZy8xMWcwdzJjcTVrEAE/overview?q=%D9%81%D9%86%D8%A7%D8%AF%D9%82%20%D8%A7%D8%B3%D9%8A%D9%88%D8%B7&g2lb=2502548%2C2503771%2C2503781%2C4258168%2C4284970%2C4306835%2C4515404%2C4649665%2C4722900%2C4723331%2C4733969%2C4738544%2C4757164%2C4758493%2C4762561%2C4786150&hl=ar-EG&gl=eg&ssta=1&rp=ogFA2KPYs9mK2YjYt9iMINin2YTYrdmF2LHYp9ihINin2YTYq9in2YbZitip2Iwg2YXYsdmD2LIg2KfZhNmB2KrYrTgBQABIAsABA8gBAJoCAggA&ap=MAFaHSIDRUdQKhYKBwjmDxAFGBYSBwjmDxAFGBcYASgAaAA&ictx=1&utm_campaign=sharing&utm_medium=link&utm_source=htls&ts=CAESAhAAGiAKAhoAEhoSFAoHCOYPEAUYFhIHCOYPEAUYFxgBMgIQACoJCgU6A0VHUBoA&ved=0CAAQ5JsGahcKEwjY1-nlrfH3AhUAAAAAHQAAAAAQPA"))
            startActivity(intent)
        }

        galaxy_hotel.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/travel/hotels/%D9%82%D8%B3%D9%85%20%D9%85%D8%B5%D8%B1%20%D8%A7%D9%84%D9%82%D8%AF%D9%8A%D9%85%D8%A9/entity/ChkIiOqm34eDiJ5GGg0vZy8xMWM3MTNmYjVwEAE/overview?q=%D9%81%D9%86%D8%A7%D8%AF%D9%82%20%D9%85%D8%B5%D8%B1%20%D8%A7%D9%84%D9%82%D8%AF%D9%8A%D9%85%D8%A9&g2lb=2502548%2C2503771%2C2503781%2C4258168%2C4284970%2C4306835%2C4515404%2C4649665%2C4722900%2C4723331%2C4733969%2C4738544%2C4757164%2C4758493%2C4762561%2C4786150&hl=ar-EG&gl=eg&ssta=1&rp=ogEc2YLYs9mFINmF2LXYsSDYp9mE2YLYr9mK2YXYqTgBQABIApoCAggA&ap=SAEwAVodIgNFR1AqFgoHCOYPEAUYFhIHCOYPEAUYFxgBKABoAA&ictx=1&utm_campaign=sharing&utm_medium=link&utm_source=htls&ts=CAESCgoCCAMKAggDEAAaQAoiEh46HNmC2LPZhSDZhdi12LEg2KfZhNmC2K_ZitmF2KkaABIaEhQKBwjmDxAFGBYSBwjmDxAFGBcYATICEAAqCwoHKAE6A0VHUBoA&ved=0CAAQ5JsGahcKEwigt9XArvH3AhUAAAAAHQAAAAAQdQ"))
            startActivity(intent)
        }

        Question.setOnClickListener {
             Toast.makeText(this, "Please click Image open hotels", Toast.LENGTH_SHORT).show()

         }


    }


}