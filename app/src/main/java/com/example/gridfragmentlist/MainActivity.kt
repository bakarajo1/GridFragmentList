package com.example.gridfragmentlist

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.replace

lateinit var fragment3: Fragment
lateinit var fragment4: Fragment

lateinit var fragment5: Fragment

lateinit var imageView: ImageView

lateinit var editText: EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       imageView = findViewById(R.id.imageView3)
        editText=findViewById(R.id.editTextTextPersonName2)

        fragment3 = RegisterFrag.newInstance(0, "jeka", "dzaan avia", R.drawable.android__1_)
          fragment4=RegisterFrag.newInstance(1,"roki","dzaan swrafia", R.drawable.android__2_,)
            fragment5=RegisterFrag.newInstance(2,"tarzani","dzaan kaia", R.drawable.android__3_,)
    }

    fun onc3(view: View) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.table, fragment3).commit()

          }
    fun onc4(view: View) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.table, fragment4).commit()

    }
    fun onc5(view: View) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.table, fragment5).commit()

    }

    fun butn(view: View) {

       val temp=editText.text.toString()
        val tempList= listOf<RegisterFrag>(fragment4 as RegisterFrag, fragment5 as RegisterFrag, fragment3 as RegisterFrag)

        Toast.makeText(this, (fragment3 as RegisterFrag)!!.saxeli, Toast.LENGTH_SHORT).show()
        for ( fr in tempList){

            if ((fr as RegisterFrag).saxeli.toString() ==temp){
                val fragmentTransaction = supportFragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.table, fr).commit()




            }
            else{
                Toast.makeText(this, "not found", Toast.LENGTH_SHORT).show()
            }
        }
    }


}