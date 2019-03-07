package com.sorokinoleg.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val foodList = arrayListOf("Chines", "Hamburger", "Pizza", "McDonalds", "Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener {
            val randomFood = Random.nextInt(foodList.count())
            selectedFoodTextView.text = foodList[randomFood]
        }
        addFoodButton.setOnClickListener {
            val newFood = addFoodPlainText.text.toString()
            if (!newFood.isEmpty()) {
                foodList.add(newFood)
                addFoodPlainText.text.clear()
            }
        }
    }
}
