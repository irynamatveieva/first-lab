package com.example.matveevaproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var nameOfAnimal : TextView
    lateinit var fullDesc: TextView
    lateinit var image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        nameOfAnimal = findViewById(R.id.name_second_activity)
        fullDesc = findViewById(R.id.full_desc_second_activity)
        image = findViewById(R.id.image_second_activity)

        nameOfAnimal.text = intent.getStringExtra("passingName")
        fullDesc.text = intent.getStringExtra("passingFullDesc")

        when(nameOfAnimal.text){
            "John" -> image.setImageResource(R.drawable.rabbit)
            "Busy" -> image.setImageResource(R.drawable.cat)
            "Killian" -> image.setImageResource(R.drawable.dog)
        }

    }
}