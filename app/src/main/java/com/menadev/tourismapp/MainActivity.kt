package com.menadev.tourismapp
import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import android.widget.Switch
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.util.rangeTo
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.menadev.tourismapp.databinding.ActivityMainBinding
import com.menadev.tourismapp.databinding.ThemeViewBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_list_item.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.system.exitProcess


@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    private lateinit var binding: ActivityMainBinding
    private lateinit var tempArrayList: ArrayList<News>
    private lateinit var toggle: ActionBarDrawerToggle
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    lateinit var location:Array<String>
    lateinit var news: Array<String>
    private lateinit var mMap: GoogleMap


    companion object {
        var themeIndex: Int = 0
        val themesList = arrayOf(R.style.coolPinkNav,
            R.style.coolBlueNav,
            R.style.coolPurpleNav,
            R.style.coolGreenNav,
            R.style.coolRedNav,
            R.style.coolBlackNav)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val editor = getSharedPreferences("Themes", MODE_PRIVATE)
        themeIndex = editor.getInt("themeIndex", 0)
        setTheme(themesList[themeIndex])
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //for nav drawer
        toggle = ActionBarDrawerToggle(this, binding.root, R.string.open, R.string.close)
        binding.root.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        binding.navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.themesNav -> {
                    val customDialog=
                        LayoutInflater.from(this).inflate(R.layout.theme_view, binding.root, false)
                    val bindingTv=ThemeViewBinding.bind(customDialog)
                    val dialog=MaterialAlertDialogBuilder(this).setView(customDialog)
                        .setTitle("Select Theme")
                        .create()
                    dialog.show()
                    when (themeIndex) {

                        0 -> bindingTv.themePink.setBackgroundColor(Color.YELLOW)
                        1 -> bindingTv.themeBlue.setBackgroundColor(Color.YELLOW)
                        2 -> bindingTv.themePurple.setBackgroundColor(Color.YELLOW)
                        3 -> bindingTv.themeGreen.setBackgroundColor(Color.YELLOW)
                        4 -> bindingTv.themeRed.setBackgroundColor(Color.YELLOW)
                        5 -> bindingTv.themeBlack.setBackgroundColor(Color.YELLOW)

                    }
                    bindingTv.themePink.setOnClickListener { saveTheme(0) }
                    bindingTv.themeBlue.setOnClickListener { saveTheme(1) }
                    bindingTv.themePurple.setOnClickListener { saveTheme(2) }
                    bindingTv.themeGreen.setOnClickListener { saveTheme(3) }
                    bindingTv.themeRed.setOnClickListener { saveTheme(4) }
                    bindingTv.themeBlack.setOnClickListener { saveTheme(5) }

                }
                R.id.Exit_Nav -> {
                    exitProcess(1)
                }
                R.id.About_Nav -> {
                    startActivity(Intent(this, AboutActivity::class.java))
                }
                R.id.home_Nav -> {
                    startActivity(Intent(this, MainActivity::class.java))
                }

            }

            return@setNavigationItemSelectedListener true
        }

        imageId = arrayOf(
            R.drawable.cairoold_cairo__hanging_church__egypt,
            R.drawable.elmegetha,
            R.drawable._42,
            R.drawable._583849772497147500,
            R.drawable.church_of_prayer___monastery_of_anba_paula,
            R.drawable.suran,
            R.drawable._5678,
            R.drawable.monastery_of_saint_pishoy_10,
            R.drawable.monastery_of_saint_anthony_monastero_antonio_2_400_300,
            R.drawable.t1518246429ace3c1a28c1473b4b6ddb5d9f6723e14image_jpg_w_1200_h_675_q_95_img,
            R.drawable._1,
            R.drawable.images__40_,
            R.drawable.images__41_,
            R.drawable._00px______________addeir_almoharraq___alqussia___assiut___egypt,
            R.drawable.katharinenkloster,
            R.drawable.cairoabbasiyamarkentrance,



        )

        heading = arrayOf(
            getString(R.string.Pyra1),
            getString(R.string.chu1),
            getString(R.string.Sergio),
            getString(R.string.Abo_mena_head),
            getString(R.string.bola_head),
            getString(R.string.Syriaan_head),
            getString(R.string.baramus_head),
            getString(R.string.bishoy_head),
            getString(R.string.Antonios_head),
            getString(R.string.Deirel7banat_head),
            getString(R.string.Deir_vergin_maddi_head),
            getString(R.string.Deir_Maryam_Badranek_Assiut_head),
            getString(R.string.Deir_Maryam_Mostorod_head),
            getString(R.string.Deir_Almoharraq_head),
            getString(R.string.saint_katreen_head),
            getString(R.string.Cairo_abbasiya_mark_head),



        )

        location = arrayOf(
            getString(R.string.loc1),
            getString(R.string.loc1),
            getString(R.string.loc1),
            getString(R.string.loc2),
            getString(R.string.loc3),
            getString(R.string.loc4),
            getString(R.string.loc4),
            getString(R.string.loc4),
            getString(R.string.loc3),
            getString(R.string.locDeir7banat),
            getString(R.string.loc_eir_vergin_maddi),
            getString(R.string.loc_Deir_Maryam_Badranek_Assiut),
            getString(R.string.loc_Deir_Maryam_Mostorod),
            getString(R.string.loc_Deir_Almoharraq),
            getString(R.string.loc_saint_katreen),
            getString(R.string.loc_Cairo_abbasiya_mark),

        )



        news = arrayOf(
            getString(R.string.the_hanging_Church),
            getString(R.string.chu),
            getString(R.string.sergio),
            getString(R.string.Abo_mena),
            getString(R.string.bola),
            getString(R.string.Deir_Al_Syriaan),
            getString(R.string.Baramus),
            getString(R.string.bishoy),
            getString(R.string.antonios),
            getString(R.string.DeirEl7banat),
            getString(R.string.Deir_church_of_vergin_maddi),
            getString(R.string.Deir_Maryam_Badranek_Assiut),
            getString(R.string.Deir_Maryam_Mostorod),
            getString(R.string.Deir_Almoharraq),
            getString(R.string.saint_katreen),
            getString(R.string.church_george),

        )



        newRecyclerView = findViewById(R.id.recyclerview)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        tempArrayList = arrayListOf<News>()

        getUserdata()


        btn_hotels_main.setOnClickListener {
                Intent(this,UrlActivty::class.java).also {
            startActivity(it)
            }
    }



        floatAction_btn.setOnClickListener {
            Intent(this,MapsActivity::class.java).also {
                startActivity(it)

            }



        }






    }




    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_drawer, menu)
        val item = menu?.findItem(R.id.search_action)
        val searchView = item?.actionView as SearchView


        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            @SuppressLint("NotifyDataSetChanged")
            override fun onQueryTextChange(newText: String?): Boolean {
                tempArrayList.clear()
                val searchText = newText!!.lowercase(Locale.getDefault())
                if (searchText.isNotEmpty()) {

                    newArrayList.forEach {
                        if (it.heading.lowercase(Locale.getDefault()).contains(searchText)) {
                            tempArrayList.add(it)

                        }


                    }

                    newRecyclerView.adapter!!.notifyDataSetChanged()

                } else {
                    tempArrayList.clear()
                    tempArrayList.addAll(newArrayList)
                    newRecyclerView.adapter!!.notifyDataSetChanged()

                }

                return false
            }


        })


        return super.onCreateOptionsMenu(menu)


    }

    private fun getUserdata() {
        for (i in imageId.indices) {
            val news = News(imageId[i], heading[i],location[i])
            newArrayList.add(news)
        }

        tempArrayList.addAll(newArrayList)

        var adapter = MyAdapter(tempArrayList)
        newRecyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                // Toast.makeText(this@MainActivity,"you clicked on item $position",Toast.LENGTH_SHORT).show()

                val intent=Intent(this@MainActivity, NewsActivity::class.java)
                    intent.putExtra("heading", newArrayList[position].heading)
                    intent.putExtra("imageId", newArrayList[position].titleImage)
                    intent.putExtra("news", news[position])
                    startActivity(intent)
                }

        })

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val gradientList = arrayOf(R.drawable.pink_gradient,
            R.drawable.blue_gradient,
            R.drawable.purple_gradient,
            R.drawable.green_gradient,
            R.drawable.red_gradient,
            R.drawable.black_gradient)
        if (toggle.onOptionsItemSelected(item))
            return true

        when (item.itemId) {
            R.id.home_Nav -> startActivity(Intent(this, MainActivity::class.java))
            R.id.About_Nav -> startActivity(Intent(this, AboutActivity::class.java))
            R.id.Exit_Nav -> exitProcess(1)
            R.id.themesNav -> {
                val customDialog =
                    LayoutInflater.from(this).inflate(R.layout.theme_view, binding.root, false)
                val bindingTv = ThemeViewBinding.bind(customDialog)
                val dialog = MaterialAlertDialogBuilder(this).setView(customDialog)
                    .setTitle("Select Theme")
                    .create()
                dialog.show()
                when (themeIndex) {

                    0 -> bindingTv.themePink.setBackgroundColor(Color.YELLOW)
                    1 -> bindingTv.themeBlue.setBackgroundColor(Color.YELLOW)
                    2 -> bindingTv.themePurple.setBackgroundColor(Color.YELLOW)
                    3 -> bindingTv.themeGreen.setBackgroundColor(Color.YELLOW)
                    4 -> bindingTv.themeRed.setBackgroundColor(Color.YELLOW)
                    5 -> bindingTv.themeBlack.setBackgroundColor(Color.YELLOW)

                }
                bindingTv.themePink.setOnClickListener { saveTheme(0) }
                bindingTv.themeBlue.setOnClickListener { saveTheme(1) }
                bindingTv.themePurple.setOnClickListener { saveTheme(2) }
                bindingTv.themeGreen.setOnClickListener { saveTheme(3) }
                bindingTv.themeRed.setOnClickListener { saveTheme(4) }
                bindingTv.themeBlack.setOnClickListener { saveTheme(5) }

            }


        }


        return super.onOptionsItemSelected(item)
    }


    private fun saveTheme(index: Int) {
        val editor = getSharedPreferences("Themes", MODE_PRIVATE).edit()
        editor.putInt("themeIndex", index)
        editor.apply()

        //for restarting app
        finish()
        startActivity(intent)


    }








}










