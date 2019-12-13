package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {

        //val resultText: TextView = findViewById(R.id.result_text)
        //val resultText1: TextView = findViewById(R.id.result_text1)
        //val resultText2: TextView = findViewById(R.id.result_text2)

        //val value1 = randomDiceValue()
        //val value2 = randomDiceValue()
        //val value3 = randomDiceValue()

       // resultText.text = value1.toString()

        val diceImage : ImageView = findViewById(R.id.dice_image)
        val diceImage1 : ImageView = findViewById(R.id.dice_image1)
        val diceImage2 : ImageView = findViewById(R.id.dice_image2)


        val drawableResource = when (randomDiceValue()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource1 = when (randomDiceValue()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource2 = when (randomDiceValue()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        diceImage1.setImageResource(drawableResource1)
        diceImage2.setImageResource(drawableResource2)

        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }

    fun randomDiceValue(): Int {
        return Random().nextInt(6) + 1
    }
}
