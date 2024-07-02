package pe.idat.ec02_quispealvaro.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Formulario(navController: NavController) {
    // State variables for the checkboxes
    var autoconocimiento by remember { mutableStateOf(false) }
    var empatia by remember { mutableStateOf(false) }
    var comunicacionAsertiva by remember { mutableStateOf(false) }
    var tomaDeDecisiones by remember { mutableStateOf(false) }
    var pensamientoCritico by remember { mutableStateOf(false) }
    var ninguno by remember { mutableStateOf(false) }

    // State variables for the radio buttons
    var trabajoSignificativo by remember { mutableStateOf("") }
    var paga by remember { mutableStateOf("") }
    var bajoPresion by remember { mutableStateOf("") }
    var crecimiento by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        Text(text = "CUESTIONARIO", style = MaterialTheme.typography.titleLarge)

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "1. Marque sus habilidades.")
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = autoconocimiento, onCheckedChange = { autoconocimiento = it })
            Text("Autoconocimiento")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = empatia, onCheckedChange = { empatia = it })
            Text("Empatía")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = comunicacionAsertiva, onCheckedChange = { comunicacionAsertiva = it })
            Text("Comunicación asertiva")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = tomaDeDecisiones, onCheckedChange = { tomaDeDecisiones = it })
            Text("Toma de decisiones")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = pensamientoCritico, onCheckedChange = { pensamientoCritico = it })
            Text("Pensamiento crítico")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = ninguno, onCheckedChange = { ninguno = it })
            Text("Ninguno")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "2. ¿Cuán significativo es tu trabajo?")
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = trabajoSignificativo == "Mucho",
                onClick = { trabajoSignificativo = "Mucho" }
            )
            Text("Mucho")
            Spacer(modifier = Modifier.width(8.dp))
            RadioButton(
                selected = trabajoSignificativo == "Más o menos",
                onClick = { trabajoSignificativo = "Más o menos" }
            )
            Text("Más o menos")
            Spacer(modifier = Modifier.width(8.dp))
            RadioButton(
                selected = trabajoSignificativo == "Poco",
                onClick = { trabajoSignificativo = "Poco" }
            )
            Text("Poco")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "3. ¿Qué tan bien te pagan en el trabajo que haces?")
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = paga == "Bien",
                onClick = { paga = "Bien" }
            )
            Text("Bien")
            Spacer(modifier = Modifier.width(8.dp))
            RadioButton(
                selected = paga == "Regular",
                onClick = { paga = "Regular" }
            )
            Text("Regular")
            Spacer(modifier = Modifier.width(8.dp))
            RadioButton(
                selected = paga == "Mal",
                onClick = { paga = "Mal" }
            )
            Text("Mal")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "4. ¿Trabajas bajo presión?")
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = bajoPresion == "SI",
                onClick = { bajoPresion = "SI" }
            )
            Text("SI")
            Spacer(modifier = Modifier.width(8.dp))
            RadioButton(
                selected = bajoPresion == "NO",
                onClick = { bajoPresion = "NO" }
            )
            Text("NO")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "5. ¿Tienes oportunidad de crecimiento en tu trabajo?")
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = crecimiento == "SI",
                onClick = { crecimiento = "SI" }
            )
            Text("SI")
            Spacer(modifier = Modifier.width(8.dp))
            RadioButton(
                selected = crecimiento == "NO",
                onClick = { crecimiento = "NO" }
            )
            Text("NO")
        }

        Spacer(modifier = Modifier.height(32.dp))

        Button(onClick = {
            navController.navigate("Menu")
        }) {
            Text(text = "Resolver")
        }
    }
}