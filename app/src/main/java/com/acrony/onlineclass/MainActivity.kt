package com.acrony.onlineclass

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvName=findViewById<TextView>(R.id.tvName)
        val btnLogin=findViewById<Button>(R.id.btnLogin)
        val etEmail=findViewById<EditText>(R.id.etEmail)
        val pbar=findViewById<ProgressBar>(R.id.progressBar)


        pbar.visibility=View.GONE
        val names="I am second toast"

        //Toast.makeText(applicationContext,"I am dynamic"+names,Toast.LENGTH_LONG).show()

        btnLogin.setOnClickListener {
             pbar.visibility=View.VISIBLE
            val email=etEmail.text.toString();
            val names=tvName.text.toString();
            Toast.makeText(applicationContext,email+names,Toast.LENGTH_LONG).show()
            //pbar.visibility=View.GONE

            tvName.setText("I am ANdroid")
        }

        switch1.setOnCheckedChangeListener { _, isChecked ->

            if(isChecked){
                Toast.makeText(applicationContext,"Switch is On",Toast.LENGTH_LONG).show()
                btnLogin.setBackgroundColor(Color.RED)
                btnLogin.setText("Switch is On")
                btnLogin.setTextColor(Color.WHITE)
            }
            else
            {
                Toast.makeText(applicationContext,"Switch is Off",Toast.LENGTH_LONG).show()
                btnLogin.setBackgroundColor(Color.BLUE)
                btnLogin.setText("Switch is Off")
                btnLogin.setTextColor(Color.WHITE)
            }

        }

    }
}
