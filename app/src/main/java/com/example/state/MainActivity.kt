package com.example.state

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.state.ui.theme.StateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StateTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Practica04Inicio(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Practica04Inicio(modifier: Modifier = Modifier) {
    val listaNombres = listOf(
        "Alejandro", "Alejandro", "Alejandro", "Alejandro"
    )

    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(listaNombres) { nombre ->
            MiCard(nombre = nombre)
        }
    }
}

@Composable
fun MiCard(modifier: Modifier = Modifier, nombre: String) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            text = nombre,
            modifier = Modifier.padding(16.dp),
            fontSize = 18.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun InicioPreview() {
    StateTheme {
        Practica04Inicio()
    }
}
