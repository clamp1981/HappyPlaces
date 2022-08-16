package study.tutorials.myhappyplaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import study.tutorials.myhappyplaces.databinding.ActivityAddHappyPlaceBinding
import study.tutorials.myhappyplaces.databinding.ActivityMainBinding

class AddHappyPlaceActivity : AppCompatActivity() {
    var binding : ActivityAddHappyPlaceBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddHappyPlaceBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        //setContentView(R.layout.activity_add_happy_place)
        setSupportActionBar(binding?.toolbarAddPlace)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //뒤로가기 버튼
        binding?.toolbarAddPlace?.setNavigationOnClickListener {
            onBackPressed()
        }

    }
}