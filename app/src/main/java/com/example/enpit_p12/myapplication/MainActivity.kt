package com.example.enpit_p12.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import com.example.enpit_p12.myapplication.R.drawable.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gu.setOnClickListener{ onJankenButtonTapped(it) }
        choki.setOnClickListener{ onJankenButtonTapped(it)}
        pa.setOnClickListener{ onJankenButtonTapped(it)}

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()
        editor.clear().apply()
    }

    /*fun onJankenButtonTacpped(view: View?) {
        startActivity<ResultActivity>("MY_HAND" to view?.id)
    }*/
   fun onJankenButtonTapped (view: View?) {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("MY_HAND",view?.id)
        startActivity(intent)
    }
}
