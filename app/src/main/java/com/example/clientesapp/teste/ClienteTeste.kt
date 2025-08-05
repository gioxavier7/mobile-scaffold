package com.example.clientesapp.teste

import com.example.clientesapp.model.Clientes
import com.example.clientesapp.service.RetrofitFactory

fun main() {
    val c1 = Clientes(
        nome = "Giovanna Xavier",
        email = "giovanna@gmail.com"
    )

    val retrofit = RetrofitFactory().getClienteService()
    val cliente = retrofit.cadastrarCliente(c1)
}