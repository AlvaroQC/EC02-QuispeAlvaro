package pe.idat.ec02_quispealvaro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pe.idat.ec02_quispealvaro.ui.theme.EC02QuispeAlvaroTheme
import pe.idat.ec02_quispealvaro.ui.theme.Formulario
import pe.idat.ec02_quispealvaro.ui.theme.Menu
import pe.idat.ec02_quispealvaro.ui.theme.listado

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EC02QuispeAlvaroTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "Menu",
                    builder = {
                        composable("Menu"){
                            Menu(navController)
                        }
                        composable("Formulario"){
                            Formulario(navController)
                        }
                        composable("Listado"){
                            listado(navController)
                        }

                    })
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EC02QuispeAlvaroTheme {
    }
}