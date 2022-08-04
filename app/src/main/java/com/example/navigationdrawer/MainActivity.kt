package com.example.navigationdrawer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()
        val fourthFragment = FourthFragment()

        setCurrentFregment(firstFragment)

        findViewById<BottomNavigationView>(R.id.buttomNavigationView).setOnNavigationItemSelectedListener{
            when(it.itemId){

                  R.id.home->setCurrentFregment(firstFragment)
                  R.id.favorite->setCurrentFregment(secondFragment)
                  R.id.cart->setCurrentFregment(thirdFragment)
                  R.id.logout->setCurrentFregment(fourthFragment)
            }
            true
        }

    }
    private  fun setCurrentFregment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment, fragment)
            commit()
        }

}
