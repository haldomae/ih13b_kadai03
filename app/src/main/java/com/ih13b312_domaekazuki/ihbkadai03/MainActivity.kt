package com.ih13b312_domaekazuki.ihbkadai03

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // 画像のリスト
    // listは読み取り専用
    // Arrayは書き込み可能
    private val imageList = listOf(
        R.drawable.dog,
        R.drawable.horse,
        R.drawable.kitten
    )

    // テキストの配列
    private val textList = listOf(
        "aaaa",
        "bbbb",
        "cccc"
    )

    private var position = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnLeft: ImageButton = findViewById(R.id.btnLeft)
        btnLeft.setOnClickListener{
            // 画像切り替え処理
            // movePosition()
        }
    }

    private fun movePosition(num: Int){
        val textView: TextView = findViewById(R.id.textView)
        val imageView: ImageView = findViewById(R.id.imageView)

        textView.text = textList[0]
        imageView.setImageResource(imageList[0])
    }
}