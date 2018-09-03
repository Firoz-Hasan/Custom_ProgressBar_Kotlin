package com.example.rumana.percentagematcher

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var editText: EditText? = null
    var ok: Button? = null
    var userinput: String? = null
    var divisionResult: Int? = null
    var modularResult: Int? = null
    var barValue: Float = 0F
    var barImage: ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.et1)
        ok = findViewById(R.id.btn1)
        barImage = findViewById(R.id.img1)

        ok?.setOnClickListener {
            userinput = editText?.text?.toString()
            Log.d("user", userinput)
            getPercentage()
        }


    }

    private fun getPercentage() {
        if (userinput?.toInt()!! >= 15 && userinput?.toInt()!! < 20) {
            barValue = 0.5F
            percentageChanger(barValue)
        } else {


            divisionResult = (userinput?.toInt())?.div(20)
            modularResult = userinput?.toInt()?.mod(20)

            Log.d("user", divisionResult?.toString() + " : " + modularResult)

            //Log.d("user", barValue?.toString())
            // according to requirements if user wants range in 10
            /*   if (modularResult!! > 0) {

               barValue = this!!.divisionResult!!.toFloat()
               if (modularResult!! <= 19 && modularResult!! > 9) {
                   Log.d("user", "asche")
                   barValue = (barValue + 0.5F)
               }

               Log.d("user", barValue?.toString())
               percentageChanger(barValue)
           } else {
               barValue = this!!.divisionResult!!.toFloat()
               percentageChanger(barValue)
           }*/

            // according to requirements if user wants range between 5 and 15
            if (modularResult == 0) {
                barValue = divisionResult?.toFloat()!!
                percentageChanger(barValue)
                Log.d("user", barValue.toString())
            } else if (modularResult!! >= 15) {
                barValue = (divisionResult!! + 1F)
                percentageChanger(barValue)
                Log.d("user", barValue.toString())
            } else if (modularResult!! < 15 && modularResult!! > 4) {
                barValue = (divisionResult!! + 0.5F)
                percentageChanger(barValue)
                Log.d("user", barValue.toString())
            } else {
                barValue = divisionResult?.toFloat()!!
                percentageChanger(barValue)
            }
        }


    }

    private fun percentageChanger(barValue: Float) {
        when (barValue.toDouble()) {
            0.0 -> {
                barImage?.setBackgroundResource(R.drawable.ic_0)
                Log.d("user", "asche0.5")
            }
            0.5 -> {
                barImage?.setBackgroundResource(R.drawable.ic__5)
                Log.d("user", "asche0.5")
            }
            1.0 -> {
                barImage?.setBackgroundResource(R.drawable.ic_1)
                Log.d("user", "asche1.0")
            }
            1.5 -> {
                barImage?.setBackgroundResource(R.drawable.ic_1_5)
                Log.d("user", "asche1.5")
            }
            2.0 -> {
                barImage?.setBackgroundResource(R.drawable.ic_2)
                Log.d("user", "asche2.0")
            }
            2.5 -> {
                barImage?.setBackgroundResource(R.drawable.ic_2_5)
                Log.d("user", "asche2.5")
            }
            3.0 -> {
                barImage?.setBackgroundResource(R.drawable.ic_3)
                Log.d("user", "asche1.5")
            }
            3.5 -> {
                barImage?.setBackgroundResource(R.drawable.ic_3_5)
                Log.d("user", "asche1.5")
            }
            4.0 -> {
                barImage?.setBackgroundResource(R.drawable.ic_4)
                Log.d("user", "asche1.5")
            }
            4.5 -> {
                barImage?.setBackgroundResource(R.drawable.ic_4_5)
                Log.d("user", "asche1.5")
            }
            5.0 -> {
                barImage?.setBackgroundResource(R.drawable.ic_5)
                Log.d("user", "asche1.5")
            }
            else -> print("otherwise")
        }

    }
}
