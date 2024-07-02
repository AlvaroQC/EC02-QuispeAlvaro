package pe.idat.ec02_quispealvaro.ui.theme

import android.view.Menu
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Menu(navController: NavController){
    Column (Modifier.padding(top = 25.dp).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Button(onClick = {
            navController.navigate("FORMULARIO")
        }) {
            Text(text = "FORMULARIO")
        }

        Button(onClick = {
            navController.navigate("LISTADO")
        }) {
            Text(text = "LISTADO")
        }
    }
}

