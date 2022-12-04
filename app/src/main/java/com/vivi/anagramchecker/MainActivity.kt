package com.vivi.anagramchecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Arrays

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        check_btn.setOnClickListener {
            val word1:String= et_text1.text.toString()
            val word2: String =et_text2.text.toString()

            val check:Boolean = areAnagram(word1,word2)
            if(check){
                Toast.makeText(this, "Entered words are anagram", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, "Entered words are not anagram", Toast.LENGTH_SHORT).show()
            }
        }
    }
   private fun areAnagram(str1: String,str2: String):Boolean {
    if (str1.length!= str2.length){
        return false
    }
    val strArray1 = str1.toCharArray()
    val strArray2 = str2.toCharArray()

    Arrays.sort(strArray1)
    Arrays.sort(strArray2)

    val sortedStr1= String(strArray1)
    val sortedStr2 = String(strArray2)

    return sortedStr1 == sortedStr2
}
}