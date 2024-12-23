package com.example.oyo

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.oyo.R

class MainActivity3 : AppCompatActivity() {

    private lateinit var searchEditText: EditText
    private lateinit var cityListView: ListView
    private lateinit var adapter: ArrayAdapter<String>
    private val cityList = listOf(
        "Bangalore", "Chennai", "Delhi", "Gurgaon", "Bihar",
        "Srinagar", "Lucknow", "Amaravati", "Itanagar", "Dispur", "Raipur", "Assam",
    )
    private val filteredCityList = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        searchEditText = findViewById(R.id.search_edit_text)
        cityListView = findViewById(R.id.city_list_view)

        filteredCityList.addAll(cityList)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, filteredCityList)
        cityListView.adapter = adapter

        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                filterCities(s.toString())
            }

            override fun afterTextChanged(s: Editable?) {}
        })
    }

    private fun filterCities(query: String) {
        filteredCityList.clear()
        if (query.isEmpty()) {
            filteredCityList.addAll(cityList)
        } else {
            for (city in cityList) {
                if (city.contains(query, ignoreCase = true)) {
                    filteredCityList.add(city)
                }
            }
        }
        adapter.notifyDataSetChanged()
    }
}


//package com.example.oyo
//
//
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Button
//import android.widget.ImageView
//import android.widget.LinearLayout
//import android.widget.TextView
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//
//class MainActivity3 : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main3)
//
//        var button1 = findViewById<ImageView>(R.id.close_page)
//        button1.setOnClickListener{
//            val intent1 = Intent(this,MainActivity2::class.java)
//            startActivity(intent1)
//        }
//    }
//}