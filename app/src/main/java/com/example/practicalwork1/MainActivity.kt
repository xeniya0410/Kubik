package com.example.practicalwork1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val diceImage: ImageView = findViewById(R.id.dice_image)

        rollButton.setOnClickListener {
            rollDice(diceImage)
        }
    }

    private fun rollDice(diceImage: ImageView) {
        // Генерация случайного числа от 1 до 6
        val randomNumber = Random.nextInt(1, 7)

        // Выбор изображения кубика в зависимости от случайного числа
        val drawableResource = when (randomNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Установка нового изображения кубика
        diceImage.setImageResource(drawableResource)
    }
}
