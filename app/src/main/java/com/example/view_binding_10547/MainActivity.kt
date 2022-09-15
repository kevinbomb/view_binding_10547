package com.example.view_binding_10547

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.view_binding_10547.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
  //      setContentView(R.layout.activity_main)
        setTitle("The Prince of Denmark")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = MainAdapter(TaskList.taskList)
        binding?.taskRv?.adapter = adapter
    }

    override fun onDestroy(){
        super.onDestroy()
        binding=null
    }
}