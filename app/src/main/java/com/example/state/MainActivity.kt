package com.example.state

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.state.ui.theme.StateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StateTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Practica01Inicio(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Practica01Inicio(modifier: Modifier = Modifier) {
    var x by remember { mutableIntStateOf(0) }

    Column(modifier = modifier) {
        Text(text = x.toString(), fontSize = 50.sp)

        Button(onClick = { x += 1 }) {
            Text("Sumar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InicioPreview() {
    StateTheme {
        Practica01Inicio()
    }
}
