package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.greetingcard.ui.theme.GreetingCardTheme
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding

class MainActivity : ComponentActivity() {
    //La funcion onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        //Aqui se llama a la funcion onCreate de la clase padre
        super.onCreate(savedInstanceState)
        //Aqui se llama a la funcion setContent, que es la que se encarga de mostrar
        // el contenido de la aplicacion
        setContent {
            //Aqui se llama a la funcion GreetingCardTheme, que es la que se encarga
            // de darle el tema a la aplicacion
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Aqui se llama a la funcion Greeting, que es la que se encarga de
                    // mostrar el mensaje de bienvenida
                    Greeting("Miguel")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = Color.Magenta) {
        Text(text = "Hola, mi nombre es $name!",
             modifier= Modifier.padding(24.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingCardTheme {
        Greeting("Miguel")
    }
}