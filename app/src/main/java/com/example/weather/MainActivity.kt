package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    // Variables
    private lateinit var radioGroup: RadioGroup
    private lateinit var selectedUnits: TextView
    private lateinit var enterZip: EditText
    private lateinit var selectedZip: TextView
    private lateinit var zipButton: Button
    private lateinit var searchButton: Button

    /**
     * Does the business
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(R.layout.weather_display_layout)

//        initViews() // Initializes variables so we can use them
//        radioGroup.setOnCheckedChangeListener { radioGroup, i ->
//            var selectedRadioButton = findViewById<RadioButton>(i)
//            if (selectedRadioButton != null) {
//                selectedUnits.setText(selectedRadioButton.text.toString())
//            }
//        }
//
//        zipButton.setOnClickListener {
//            selectedZip.setText(enterZip.text.toString())
//        }
//
//        searchButton.setOnClickListener {
//            Toast.makeText(applicationContext,
//                "Zip: " + selectedZip.text.toString() + "\n" +
//                "Units: " + selectedUnits.text.toString(),
//                Toast.LENGTH_SHORT).show()
//        }
//
    }
//
//    private fun initViews() {
//        radioGroup = findViewById(R.id.radio_group)
//        selectedUnits = findViewById(R.id.tv_selected_units)
//        selectedZip = findViewById(R.id.tv_selected_zip)
//        enterZip = findViewById(R.id.et_zip_code)
//        zipButton = findViewById(R.id.btn_calc_zip)
//        searchButton = findViewById(R.id.btn_find_weather)
//    }


}