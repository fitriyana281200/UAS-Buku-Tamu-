package com.informatika19100071.pitriyana_19100071_bukutamu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    koneksi.service.getUser().enqueue(object : Callback<List<ResponseUsersItem?>>{
        override fun onFailure(call: Call<List<ResponseUsersItem?>>, t: Throwable) {
            Log.d("pesan1", t.locallizedMessage)
        }

    override fun onResponse(
        call: Call<List<ResponseUsersItem?>>,
        response: Response<List<ResponseUsersItem?>>
    ) }
            if(response.isSuccessful){
                Log.d("pesan", response.body().toString());
            }
        }
    )}
}