package com.example.humbleman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.humbleman.fragments.AboutFragment
import com.example.humbleman.fragments.FavouritesFragment
import com.example.humbleman.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //ISIAN
    private lateinit var homeFragment:  HomeFragment
    private lateinit var aboutFragment: AboutFragment
    private lateinit var favouritesFragment: FavouritesFragment
    //BATAS

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ISIAN
        val btmNav: BottomNavigationView = findViewById(R.id.bottom_navigation)
        val btmFrameLayout: FrameLayout = findViewById(R.id.fl_wrapper)

        homeFragment = HomeFragment()

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fl_wrapper, homeFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()


        //BATAS

        //makeCurrentFragment(homeFragment)
        btmNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ic_home -> {
                    //ISIAN
                    homeFragment = HomeFragment()
                    if (savedInstanceState == null) {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.fl_wrapper, homeFragment)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit()
                    }
                    //BATAS
                    //makeCurrentFragment(homeFragment)
                }
                /*R.id.ic_favorite -> {
                    //ISIAN
                    favouritesFragment = FavouritesFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fl_wrapper, favouritesFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }*/ //BATAS
                    //makeCurrentFragment(favouritesFragment)

                R.id.ic_about -> {
                    aboutFragment = AboutFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fl_wrapper, aboutFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
            //makeCurrentFragment(aboutFragment)
            }
            true
        }
    }
    //ISIAN FUN
    override fun getIntent(): Intent {
        return super.getIntent()
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }
    //BATAS
}