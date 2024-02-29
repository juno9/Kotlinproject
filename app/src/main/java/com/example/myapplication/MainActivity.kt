package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val : 상수   , var : 변수
        val edtxt_email_input = findViewById<EditText>(R.id.edtxt_email)
        val edtxt_pw_input = findViewById<EditText>(R.id.edtxt_pw)
        val btn_login = findViewById<Button>(R.id.btn_login)
        val btn_login_kakao = findViewById<Button>(R.id.btn_kakaologin)
        val btn_login_google = findViewById<Button>(R.id.btn_googlelogin)
        val btn_login_naver = findViewById<Button>(R.id.btn_naverlogin)
        val ttv_signup = findViewById<TextView>(R.id.ttv_signup)
        val ttv_findidpw = findViewById<TextView>(R.id.ttv_findidpw)
        //view 선언

        btn_login.setOnClickListener {

            val enteredEmail : String = edtxt_email_input.text.toString()//입력받은 값 스트링으로 담음
            val enteredPW : String =edtxt_pw_input.text.toString() // 입력받은 값 스트링으로 담음



        }

    }


}