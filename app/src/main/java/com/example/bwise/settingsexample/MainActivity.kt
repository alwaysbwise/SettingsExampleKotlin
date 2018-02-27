package com.example.bwise.settingsexample

import android.app.Activity
import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.content.Intent
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun displaySettings(view: View) {

        //start settings activity
        startActivity(Intent(this, SettingsActivity::class.java))

    }

    fun readSettings(view: View) {

        //read the value which is stored in a key/value pair
        val prefs = PreferenceManager.getDefaultSharedPreferences(this)

        //pulling the value from the settings activity
        val setting1 = prefs.getString("example_text", "John Smith")

        //display the value in a toast
        Toast.makeText(this, setting1, Toast.LENGTH_LONG).show()
    }

}
