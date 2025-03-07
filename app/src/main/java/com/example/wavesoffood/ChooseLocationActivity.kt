package com.example.wavesoffood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import com.example.wavesoffood.databinding.ActivityChooseLocationBinding

class ChooseLocationActivity : AppCompatActivity() {
    private val binding:ActivityChooseLocationBinding by lazy{
        ActivityChooseLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val locationList= arrayOf("K. G. Mittal College ( College )", "K. G. Mittal College (Higher Secondary section)")
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView=binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)
    }
}
