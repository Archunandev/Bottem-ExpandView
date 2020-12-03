package com.example.bottemuiactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title=resources.getString(R.string.home)
        loadFragment(HomeFragment())

        navigationView.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.navigation_home-> {
                    title=resources.getString(R.string.home)
                    loadFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.navigation_add-> {
                    title=resources.getString(R.string.add)
                    loadFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.navigation_view-> {
                    title=resources.getString(R.string.view)
                    loadFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }


    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}