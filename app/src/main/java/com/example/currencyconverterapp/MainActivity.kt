package com.example.currencyconverterapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // this app convert dollars into euros

    //Declaring Variables(Widgets)
    lateinit var titleTextView: TextView
    lateinit var resultTextView: TextView
    lateinit var editText: EditText
    lateinit var converterButton: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    // Initializing Widgets
        titleTextView = findViewById(R.id.textView)
        resultTextView = findViewById(R.id.textView5)
        editText = findViewById(R.id.editText)
        converterButton = findViewById(R.id.ConvertBTN)

        converterButton.setOnClickListener {
          // code to be executed when the button is clicked
            var enterUSD:String = editText.text.toString()
            var enterUSdDoubler:Double = enterUSD.toDouble()

        var euros =  makeConversion(enterUSdDoubler)//fun call

            resultTextView.text = euros.toString()

        }

    }
    fun makeConversion(usd:Double):Double{

        //var euros : Double = usd*0.94

     return usd*0.94
    }

}