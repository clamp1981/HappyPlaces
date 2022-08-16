package study.tutorials.myhappyplaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import study.tutorials.myhappyplaces.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding : ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.fabAddHappyPlace?.setOnClickListener {
            val intent = Intent( this, AddHappyPlaceActivity::class.java )
            startActivity(intent)
        }
    }
}