package pe.idat.ec02_quispealvaro.ui.theme

import android.view.Menu
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

data class Event(
    val title: String,
    val description: String,
    val date: String
)

val events = listOf(
    Event("Festival de Cannes", "Uno de los festivales de cine más prestigiosos del mundo.", "2024-05-14"),
    Event("Oktoberfest", "El festival de la cerveza más grande del mundo en Múnich, Alemania.", "2024-09-21"),
    Event("Carnaval de Río", "El famoso carnaval de Brasil con desfiles y fiestas en la calle.", "2024-02-09"),
    Event("Feria de Abril", "Una de las fiestas más emblemáticas de Sevilla, España.", "2024-04-23"),
    Event("Día de los Muertos", "Celebración tradicional mexicana para honrar a los difuntos.", "2024-11-01"),
    Event("Diwali", "El festival de las luces, celebrado en la India y otras partes del mundo.", "2024-10-20"),
    Event("Juegos Olímpicos", "El evento deportivo más grande del mundo, que se celebra cada cuatro años.", "2024-07-26"),
    Event("Navidad en Nueva York", "Las famosas festividades navideñas en la ciudad de Nueva York.", "2024-12-25"),
    Event("Año Nuevo Chino", "La celebración del Año Nuevo según el calendario lunar chino.", "2024-02-10"),
    Event("Festival de Glastonbury", "Uno de los festivales de música más grandes y famosos del mundo.", "2024-06-26"),
    Event("San Fermín", "Fiesta popular en Pamplona, España, famosa por los encierros de toros.", "2024-07-07"),
    Event("Mardi Gras", "El famoso carnaval en Nueva Orleans, EE.UU., conocido por sus desfiles y fiestas.", "2024-03-05")
)

@Composable
fun EventCard(event: Event) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = event.title, style = androidx.compose.material3.MaterialTheme.typography.titleMedium)
            Text(text = event.description, style = androidx.compose.material3.MaterialTheme.typography.bodyMedium)
            Text(text = event.date, style = androidx.compose.material3.MaterialTheme.typography.bodySmall)
        }
    }
}

@Composable
fun listado(navController: NavController) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        LazyColumn(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            items(events) { event ->
                EventCard(event)
            }
        }
        Button(
            onClick = { navController.navigate("Menu") },
            modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 16.dp)
        ) {
            Text(text = "Volver")
        }
    }
}
