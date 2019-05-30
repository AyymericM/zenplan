package com.example.zenplan

import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.ActionBar

class MainActivity : AppCompatActivity() {

    lateinit var toolbar: ActionBar

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_profile -> {
                toolbar.title = "Profile"
                val songsFragment = ProfileFragment.newInstance()
                openFragment(songsFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_todo -> {
                toolbar.title = "Todos"
                val albumsFragment = TodosFragment.newInstance()
                openFragment(albumsFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_analytics -> {
                toolbar.title = "Analytics"
                val artistsFragment = AnalyticsFragment.newInstance()
                openFragment(artistsFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun openDefaultFragment() {
        val albumsFragment = TodosFragment.newInstance()
        openFragment(albumsFragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openDefaultFragment()

        // BOTTOM NAVIGATION
        toolbar = supportActionBar!!
        val bottomNavigation: BottomNavigationView = findViewById(R.id.navigationView)

        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        bottomNavigation.selectedItemId = R.id.navigation_todo
    }
}
