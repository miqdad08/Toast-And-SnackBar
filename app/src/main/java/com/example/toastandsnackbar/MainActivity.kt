package com.example.toastandsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import com.example.toastandsnackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import com.musfickjamil.snackify.Snackify
import de.mateware.snacky.Snacky
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSnackbar.setOnClickListener {
//            val snackbar = Snackbar.make(binding.root, "Berhasil muncul", Snackbar.LENGTH_INDEFINITE)
//            //untuk menambahkan action
//            snackbar.setAction("Retry"){
//                Snackbar.make(binding.root, "Retry di pencet", Snackbar.LENGTH_SHORT).show()
//            }.show()
            Snackify.success(findViewById(android.R.id.content), "Success message !", Snackify.LENGTH_LONG).show()


        }
        binding.btnToast.setOnClickListener {
            MotionToast.createToast(this,
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.helvetica_regular))
        }
    }
}