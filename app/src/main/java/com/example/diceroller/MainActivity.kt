package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.rollBtn.text = "Let's Roll"

        binding.rollBtn.setOnClickListener {

            val image = when(rollDice()){
                1->R.drawable.dice_1
                2->R.drawable.dice_2
                3->R.drawable.dice_3
                4->R.drawable.dice_4
                5->R.drawable.dice_5
                else->R.drawable.dice_6
            }

            binding.diceImage.setImageResource(image)
        }
    }

    private fun rollDice() :Int {
        return Random.nextInt(6)+1
    }
}