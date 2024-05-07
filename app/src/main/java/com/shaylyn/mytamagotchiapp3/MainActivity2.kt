package com.shaylyn.mytamagotchiapp3

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {

    private lateinit var PetImageView: ImageView

    private var happy = 100
    private var hunger = 50
    private var cleanliness= 50


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setupGameScreen()
    }


    private fun setupGameScreen() {
        PetImageView= findViewById(R.id.ImageView)
        val eatButton: Button = findViewById(R.id.eatButton)
        val cleanButton: Button = findViewById(R.id.cleanButton)
        val playButton: Button = findViewById(R.id.playbutton)

        eatButton.setOnClickListener {
            PetImageView.setImageResource(R.drawable.eating)
            updatePetStatus("eat")
        }

        cleanButton.setOnClickListener {
            PetImageView.setImageResource(R.drawable.cleaning)
            updatePetStatus("clean")
        }

        playButton.setOnClickListener {
            PetImageView.setImageResource(R.drawable.playing)
            updatePetStatus("play")
        }
    }

    private fun updatePetStatus(action: String) {
        when (action) {
            "eat" -> {
                hunger +=20
                if (hunger > 100) hunger = 100
            }
            "clean" -> {
                cleanliness += 20
                if (cleanliness > 100) cleanliness = 100
            }
            "play" -> {
                happy += 20
                if (happy > 100) happy = 100
            }
        }
        //update progress bars
        updateProgressBars()
    }

    private fun updateProgressBars() {
        //Update progress bars based on current values
    }
}