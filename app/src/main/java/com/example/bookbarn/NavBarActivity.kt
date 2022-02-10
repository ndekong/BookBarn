package com.example.bookbarn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.close
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import com.example.bookbarn.databinding.ActivityNavBarBinding
import java.nio.channels.AsynchronousFileChannel.open

open class NavBarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavBarBinding

    private lateinit var  toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavBarBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        toggle = ActionBarDrawerToggle(this,binding.drawerLayout,R.string.open,R.string.close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.navView.setNavigationItemSelectedListener {

            when(it.itemId){
                R.id.nav_home -> Toast.makeText(applicationContext, "Home", Toast.LENGTH_SHORT).show()
                R.id.nav_explore -> Toast.makeText(applicationContext,"History", Toast.LENGTH_SHORT).show()
                R.id.nav_favorite -> Toast.makeText(applicationContext,"Tracking Rider", Toast.LENGTH_SHORT).show()
                R.id.nav_mylibrary -> Toast.makeText(applicationContext,"Request Pickup", Toast.LENGTH_SHORT).show()
                R.id.nav_Profile -> Toast.makeText(applicationContext,"setting", Toast.LENGTH_SHORT).show()

            }

            true
        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {

            return true
        }

        return super.onOptionsItemSelected(item)
    }

}
