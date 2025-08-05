package com.example.clientesapp.screens

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clientesapp.R
import com.example.clientesapp.ui.theme.ClientesappTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Scaffold(
        topBar = {
            BarraDeTitulo()
        },
        bottomBar = {
            BarraDeNavegacao()
        },
        floatingActionButton = {
            BotaoFlutuante()
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
        ) {
            Text(text = "aqui fica o conteudo")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BarraDeTitulo(modifier: Modifier = Modifier){
    TopAppBar(
        modifier = Modifier
            .fillMaxWidth(),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        ),
        title = {
            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Column {
                    Text(
                        text = "Isabela Merced",
                        fontSize = 18.sp,
                        color = MaterialTheme.colorScheme.onPrimary
                        )
                    Text(
                        text = "isabela@gmail.com",
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                }
                Card (
                    modifier = Modifier
                        .size(60.dp),
                    shape = CircleShape
                ){
                    Image(
                        painter = painterResource(R.drawable.isabelamerced),
                        contentDescription = "Foto perfil"
                    )
                }
            }
        }
    )
}

@Preview
@Composable
private fun BarraDeTituloPreview() {
    ClientesappTheme {
        BarraDeTitulo()
    }
}

@Composable
fun BarraDeNavegacao(modifier: Modifier = Modifier){
    NavigationBar(
        containerColor = MaterialTheme
            .colorScheme.primary,
        contentColor = MaterialTheme
            .colorScheme.onPrimary
    ) {
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home",
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            },
            label = {
                Text(text = "Home", color = MaterialTheme.colorScheme.onPrimary)
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Favorite",
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            },
            label = {
                Text(text = "Favorite", color = MaterialTheme.colorScheme.onPrimary)
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu",
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            },
            label = {
                Text(text = "Menu", color = MaterialTheme.colorScheme.onPrimary)
            }
        )
    }
}

@Preview
@Composable
private fun BarraDeNavegacaoPreview() {
    ClientesappTheme {
        BarraDeNavegacao()
    }
}

@Composable
fun BotaoFlutuante(modifier: Modifier = Modifier){
    FloatingActionButton(
        onClick = {}
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Botão adicionar"
        )
    }
}

@Preview
@Composable
private fun BotaoFlutuantePreview() {
    ClientesappTheme {
        BotaoFlutuante()
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun HomeScrenPreview() {
    ClientesappTheme {
        HomeScreen()
    }
}