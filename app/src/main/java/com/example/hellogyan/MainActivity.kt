package com.example.hellogyan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        button.setOnClickListener{
//
//            var name = inputName.editableText.toString()
//            Toast.makeText(this, "Happy Birthday $name", Toast.LENGTH_SHORT).show()
//
//            var intent = Intent(this, BirthdayCard::class.java)
//            startActivity(intent)
//
//        }



    }

    fun birthdayCard(view: View) {
        var name = inputName.editableText.toString()
        var  intent = Intent(this, BirthdayCard::class.java)
        intent.putExtra(BirthdayCard.NAME_EXTRA , name)
        startActivity(intent)

    }


}