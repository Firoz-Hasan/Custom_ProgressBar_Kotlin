package com.example.rumana.percentagematcher

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var editText : EditText? = null
    var ok: Button? = null
    var userinput: String? = null
    var divisionResult: Int? = null
    var modularResult:Int? = null
    var barValue: Int?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.et1)
        ok = findViewById(R.id.btn1)

        ok?.setOnClickListener {
            userinput = editText?.text?.toString()
            Log.d("user", userinput)
            getPercentage()
        }
        





    }

    private fun getPercentage() {
        divisionResult = (userinput?.toInt())?.div(20)
        modularResult = userinput?.toInt()?.mod(20)
        Log.d("user", divisionResult?.toString()+ " : "+ modularResult)



    }
}
