package com.bestamibakir.dortislemhesapmakinesi

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bestamibakir.dortislemhesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var ilkSayi : Int = 0
    var ikinciSayi : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }



    fun topla(view : View) {
        if (binding.editTextText.text.toString() == "" || binding.editTextText2.text.toString() == "") {
            binding.textView.text = "Lütfen sayıları doğru giriniz"
        } else {
            ilkSayi = binding.editTextText.text.toString().toInt()
            ikinciSayi = binding.editTextText2.text.toString().toInt()
            val sonuc = ilkSayi + ikinciSayi
            binding.textView.text = "Sonuç : ${sonuc}"
        }
    }

    fun cikar(view: View){
        if (binding.editTextText.text.toString() == "" || binding.editTextText2.text.toString() == "") {
            binding.textView.text = "Lütfen sayıları doğru giriniz"
        } else {
            ilkSayi = binding.editTextText.text.toString().toInt()
            ikinciSayi = binding.editTextText2.text.toString().toInt()
            val sonuc = ilkSayi - ikinciSayi
            binding.textView.text = "Sonuç : ${sonuc}"
        }
    }
    fun carp(view: View){
        if (binding.editTextText.text.toString() == "" || binding.editTextText2.text.toString() == "") {
            binding.textView.text = "Lütfen sayıları doğru giriniz"
        } else {
            ilkSayi = binding.editTextText.text.toString().toInt()
            ikinciSayi = binding.editTextText2.text.toString().toInt()
            val sonuc = ilkSayi * ikinciSayi
            binding.textView.text = "Sonuç : ${sonuc}"
        }
    }
    fun bol(view: View){
        if (binding.editTextText.text.toString() == "" || binding.editTextText2.text.toString() == "") {
            binding.textView.text = "Lütfen sayıları doğru giriniz"
        }else if (binding.editTextText2.text.toString().toInt() == 0){
            binding.textView.text = "${ilkSayi} 0'a bölünemez"
        }else {
            ilkSayi = binding.editTextText.text.toString().toInt()
            ikinciSayi = binding.editTextText2.text.toString().toInt()
            val sonuc : Double = ilkSayi.toDouble() / ikinciSayi.toDouble()
            binding.textView.text = "Sonuç : ${sonuc}"
        }
    }
}