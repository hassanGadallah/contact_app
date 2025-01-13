package com.example.contactsapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class HomeActivity : AppCompatActivity() {
    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val floatingBtn : Button = findViewById(R.id.floating_action_btn)
        floatingBtn.setOnClickListener {
            val fragment1 : Fragment = AddContactFragment()
            val fragTrans : FragmentTransaction = supportFragmentManager.beginTransaction()
            fragTrans.replace(R.id.fram_1,fragment1)
        }


    }
}