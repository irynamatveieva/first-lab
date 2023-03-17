package com.example.matveevaproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView
    var animals = ArrayList<Animal>()
    lateinit var adapter: AnimalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rV_on_main_activity)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        var rabbit = Animal ("John", "Rabbit", getString(R.string.full_desc_of_rabbit) , R.drawable.rabbit)
        var cat = Animal ("Busy", "Cat", getString(R.string.full_desc_of_cat),R.drawable.cat)
        var dog = Animal("Killian", "Dog", getString(R.string.full_desc_off_dog),R.drawable.dog)

        animals.add(rabbit)
        animals.add(cat)
        animals.add(dog)

        adapter= AnimalAdapter(animals, this)

        recyclerView.adapter = adapter

    }
}