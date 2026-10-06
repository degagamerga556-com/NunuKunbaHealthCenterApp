package com.nunukunba.healthcenter

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(32, 32, 32, 32)

        val title = TextView(this)
        title.text = "Nunu Kumba Health Center"
        title.textSize = 26f
        title.setTextColor(Color.rgb(0, 100, 80))
        title.gravity = Gravity.CENTER

        val welcome = TextView(this)
        welcome.text = "Welcome to Health Center App"
        welcome.textSize = 18f
        welcome.gravity = Gravity.CENTER
        welcome.setPadding(0, 30, 0, 0)

        layout.addView(title)
        layout.addView(welcome)

        setContentView(layout)
    }
}
