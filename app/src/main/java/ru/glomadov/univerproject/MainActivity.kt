package ru.glomadov.univerproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.glomadov.univerproject.databinding.ActivityMainBinding
import ru.glomadov.univerproject.profile.ProfileActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.profile.setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}