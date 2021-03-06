package com.codekul.shoping2interactkotlin

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_jeans.*

class JeansActivity : AppCompatActivity() {

    val jeans = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jeans)

        txtskinny.setOnClickListener {
            txtskinny.setBackgroundColor(Color.parseColor("#4a0072"))
            txtskinny.setTextColor(Color.parseColor("#FFFFFFFF"))
            jeans.add(txtskinny.text.toString())
        }

        txtloose.setOnClickListener {
            txtloose.setBackgroundColor(Color.parseColor("#4a0072"))
            txtloose.setTextColor(Color.parseColor("#FFFFFFFF"))
            jeans.add(txtloose.text.toString())

        }
        txtrelax.setOnClickListener {
            txtrelax.setBackgroundColor(Color.parseColor("#4a0072"))
            txtrelax.setTextColor(Color.parseColor("#FFFFFFFF"))
            jeans.add(txtrelax.text.toString())

        }
        txtslim.setOnClickListener {
            txtslim.setBackgroundColor(Color.parseColor("#4a0072"))
            txtslim.setTextColor(Color.parseColor("#FFFFFFFF"))
            jeans.add(txtslim.text.toString())

        }
        btnbackjeans.setOnClickListener {

            val i = Intent()
            i.putExtra("jeans", jeans)
            setResult(Activity.RESULT_OK, i)
            finish()
        }

    }
}


