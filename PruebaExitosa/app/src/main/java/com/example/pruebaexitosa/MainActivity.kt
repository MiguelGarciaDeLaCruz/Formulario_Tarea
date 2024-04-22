package com.example.pruebaexitosa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //variables por cada atributo en el XML
    private  lateinit var textView: TextView
    private  lateinit var textView2: TextView
    private  lateinit var textView3: TextView
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var editText3: EditText
    private lateinit var editText4: EditText
    private lateinit var btnAccept1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView= findViewById(R.id.text_1)
        textView2= findViewById(R.id.textCorrect)
        textView3= findViewById(R.id.textIncorrect)
        btnAccept1 = findViewById(R.id.button_1)
        editText1 = findViewById(R.id.name_edit_text)
        editText2 = findViewById(R.id.nickname_edit_text)
        editText3 = findViewById(R.id.phone_edit_text)
        editText4 = findViewById(R.id.email_edit_text)


        btnAccept1.setOnClickListener {
            val inputText1 = editText1.text.toString().trim()
            val inputText2 = editText2.text.toString().trim()
            val inputText3 = editText3.text.toString().trim()
            val inputText4 = editText4.text.toString().trim()

            if(inputText1.isNotEmpty() && inputText2.isNotEmpty() && inputText3.isNotEmpty() && inputText4.isNotEmpty() ) {
                textView2.visibility = View.VISIBLE
                textView3.visibility = View.INVISIBLE
                editText1.visibility = View.INVISIBLE
                editText2.visibility = View.INVISIBLE
                editText3.visibility = View.INVISIBLE
                editText4.visibility = View.INVISIBLE
                textView.text = "Llenado exitosamente"
            } else {
                textView.text = "Termina de llenar el formulario"
                textView3.visibility = View.VISIBLE


            }


        }
    }
}