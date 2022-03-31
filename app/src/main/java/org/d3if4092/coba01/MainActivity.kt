package org.d3if4092.coba01

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.switchmaterial.SwitchMaterial
import org.d3if4092.coba01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener { tampilData() }
        binding.button3.setOnClickListener { reset() }
        val switchMaterial = findViewById<SwitchMaterial>(R.id.switch_material)

        switchMaterial.setOnCheckedChangeListener { compoundButton, b ->
            if (b)
                AppCompatDelegate.setDefaultNightMode( AppCompatDelegate.MODE_NIGHT_YES)
            else
                AppCompatDelegate.setDefaultNightMode( AppCompatDelegate.MODE_NIGHT_NO)
        }

    }
    @SuppressLint("StringFormatInvalid")
    private fun tampilData() {

        val nama = binding.namaInp.text.toString()
        if (TextUtils.isEmpty(nama)) {
            Toast.makeText(this, R.string.nama_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val telpon = binding.telponInp.text.toString()
        if (TextUtils.isEmpty(telpon)) {
            Toast.makeText(this, R.string.telpon_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val lokasi = binding.lokasiInp.text.toString()
        if (TextUtils.isEmpty(lokasi)) {
            Toast.makeText(this, R.string.lokasi_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val tanggal = binding.tanggalInp.text.toString()
        if (TextUtils.isEmpty(tanggal)) {
            Toast.makeText(this, R.string.tanggal_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val isi = binding.isiInp.text.toString()
        if (TextUtils.isEmpty(isi)) {
            Toast.makeText(this, R.string.isi_invalid, Toast.LENGTH_LONG).show()
            return
        }


        binding.nama1TextView.text = getString(R.string.nama_x, nama)
        binding.telponTextView.text = getString(R.string.telpon_x, telpon)
        binding.lokasiTextView.text = getString(R.string.lokasi_x, lokasi)
        binding.tanggalTextView.text = getString(R.string.tanggal_x, tanggal)
        binding.isiTextView.text = getString(R.string.isi_x, isi)


    }
    private fun reset() {
        binding.namaInp.setText("");
        binding.telponInp.setText("");
        binding.lokasiInp.setText("");
        binding.tanggalInp.setText("");
        binding.isiInp.setText("");
        binding.nama1TextView.setText("");
        binding.telponTextView.setText("");
        binding.lokasiTextView.setText("");
        binding.tanggalTextView.setText("");
        binding.isiTextView.setText("");


    }


    }





