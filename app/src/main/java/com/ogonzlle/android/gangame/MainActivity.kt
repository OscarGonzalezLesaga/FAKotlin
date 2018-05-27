package com.ogonzlle.android.gangame

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.ogonzlle.android.gangame.deals.DealsFragment
import com.ogonzlle.android.gangame.owned.TopOwnedFragment
import com.ogonzlle.android.gangame.rated.TopRatedFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //static code
    companion object {
        const val DEFAULT_OPTION = R.id.action_deals
    }

    val FRAGMENT_CONTAINER = R.id.fragmentContainer

    val listFragment: HashMap<Int, Fragment> = hashMapOf(
            Pair(R.id.action_deals, DealsFragment()),
            Pair(R.id.action_top_rated, TopRatedFragment()),
            Pair(R.id.action_most_owned, TopOwnedFragment())
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

        navigationView.selectedItemId = DEFAULT_OPTION
        navigationView.setOnNavigationItemSelectedListener { item ->
            val fragment = listFragment[item.itemId]

            if (fragment != null) {
                replaceFragment(fragment)
            }

            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(FRAGMENT_CONTAINER, fragment)
    }

    private fun initView() {
        val currentFragment = supportFragmentManager.findFragmentById(FRAGMENT_CONTAINER)

        if (currentFragment == null) {
            supportFragmentManager.beginTransaction().add(FRAGMENT_CONTAINER, listFragment[DEFAULT_OPTION]).commit()
        }
    }
}
