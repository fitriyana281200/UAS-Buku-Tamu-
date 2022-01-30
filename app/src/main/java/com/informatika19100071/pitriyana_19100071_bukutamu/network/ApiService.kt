package com.informatika19100071.pitriyana_19100071_bukutamu.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface ApiService {
    @GET("read.php")
    fun getBuku(): Call<ResponseBuku>

    @FormUrlEncoded
    @POST("create.php")
    fun insertBuku(
        @Field("Nama_Pengunjung") namapengunjung: String?,
        @Field("Alamat_Pengunjung") alamatpengunjung: String?,
        @Field("Tambah_Data") tambahdata: String?,
    ): Call<ResponseAction<Buku>

    @FormUrlEncoded
    @POST("update.php")
    fun updateBuku(
        @Field("id") id: String?,
        @Field("date") date: String?,
        @Field("time") time: String?
    ): Call<ResponseActionBuku>

    @FormUrlEncoded
    @POST("delete.php")
    fun deleteBuku(
        @Field("id") id: String?
    ): Call<ResponseActionMemos>

    @FormUrlEncoded
    @POST("login.php")
    fun logIn(
        @Field("Username") Username : String?,
        @Field("Password") Password : String?
    ):Call<ResponseAdmin>

    @FormUrlEncoded
    @POST("register.php")
    fun register(
        @Field("Username") Username : String?,
        @Field("Password") Password : String?
    ):Call<ResponseAdmin>
}
