package com.example.clientesapp.service

import com.example.clientesapp.model.Clientes
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ClienteService {

    @POST("clientes")
    fun cadastrarCliente(@Body clientes: Clientes): Call<Clientes>

    @GET("clientes")
    fun exibirClientes(): Call<List<Clientes>>

    @GET("clientes/{id}")
    fun exibirPorId(@Path("id") id: Long): Call<Clientes>

    @PUT("clientes")
    fun atualizarCliente(@Body clientes: Clientes): Call<Clientes>

    @DELETE("clientes/{id}")
    fun excluirCliente(@Path("id") id: Long): Call<Unit>
}