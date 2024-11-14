package com.game.mycal

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.game.mycal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply{



        }

           binding.btnAdd.setOnClickListener {

               if (binding.edtNo1.text.toString()!="" && binding.edtNo2.text.toString()!="" ) {

                   val no1 = binding.edtNo1.text.toString().toInt()
                   val no2 = binding.edtNo2.text.toString().toInt()

                   val sum = no1+no2
                   Toast .makeText(this,"This sum is $sum",Toast.LENGTH_LONG).show()

               }else
                   Toast .makeText(this,"Inpute",Toast.LENGTH_LONG).show()
           }

        binding.btnSub.setOnClickListener {


            if (binding.edtNo1.text.toString()!="" && binding.edtNo2.text.toString()!="" ) {

                val no1 = binding.edtNo1.text.toString().toInt()
                val no2 = binding.edtNo2.text.toString().toInt()



                val sub = no1-no2
                Toast .makeText(this,"This sum is $sub",Toast.LENGTH_LONG).show()

            }else
                Toast .makeText(this,"Inpute",Toast.LENGTH_LONG).show()

        }

        binding.btnMul.setOnClickListener {


            if (binding.edtNo1.text.toString()!="" && binding.edtNo2.text.toString()!="" ) {

                val no1 = binding.edtNo1.text.toString().toInt()
                val no2 = binding.edtNo2.text.toString().toInt()



                val mul = no1*no2
                Toast .makeText(this,"This sum is $mul",Toast.LENGTH_LONG).show()

            }else
                Toast .makeText(this,"Inpute",Toast.LENGTH_LONG).show()

        }

        binding.btnDiv.setOnClickListener {


            if (binding.edtNo1.text.toString()!="" && binding.edtNo2.text.toString()!="" ) {

                val no1 = binding.edtNo1.text.toString().toInt()
                val no2 = binding.edtNo2.text.toString().toInt()



                val dev = no1*no2
                Toast .makeText(this,"This sum is $dev",Toast.LENGTH_LONG).show()

            }else
                Toast .makeText(this,"Inpute",Toast.LENGTH_LONG).show()

        }




    }


    }
