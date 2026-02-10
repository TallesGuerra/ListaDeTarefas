package com.example.listadetarefas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                // Definição do Gradiente
                val gradient45 = Brush.linearGradient(
                    colors = listOf(Color(0xFF6200EE), Color(0xFF03DAC5)),
                    start = Offset.Zero,
                    end = Offset.Infinite
                )

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(brush = gradient45)
                ) {
                    ListaDeTarefasApp()
                }
            } // Fim MaterialTheme
        } // Fim setContent
    } // Fim onCreate
} // Fim MainActivity

@Composable
fun ListaDeTarefasApp() {
    var textoTarefa by remember { mutableStateOf("") }
    var listaTarefas by remember { mutableStateOf(listOf<String>()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Lista de Tarefas",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.White,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                value = textoTarefa,
                onValueChange = { textoTarefa = it },
                label = { Text("Nova tarefa", color = Color.White) },
                modifier = Modifier.weight(1f),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    focusedContainerColor = Color.White.copy(alpha = 0.1f),
                    unfocusedContainerColor = Color.Transparent,
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White.copy(alpha = 0.5f),
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.White
                )
            )
            Spacer(modifier = Modifier.width(8.dp))
            Button(
                onClick = {
                    if (textoTarefa.isNotBlank()) {
                        listaTarefas = listaTarefas + textoTarefa
                        textoTarefa = ""
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color(0xFF6200EE)
                )
            ) {
                Text("Add")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(listaTarefas) { tarefa ->
                ItemTarefa(
                    nomeTarefa = tarefa,
                    onDelete = {
                        listaTarefas = listaTarefas - tarefa
                    }
                )
            }
        }
    }
}

@Composable
fun ItemTarefa(nomeTarefa: String, onDelete: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.8f))
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = nomeTarefa,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black
            )
            IconButton(onClick = onDelete) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Remover",
                    tint = Color(0xFFD32F2F)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListaDeTarefasAppPreview() {
    MaterialTheme {
        val gradient45 = Brush.linearGradient(
            colors = listOf(Color(0xFF6200EE), Color(0xFF03DAC5)),
            start = Offset.Zero,
            end = Offset.Infinite
        )
        Box(modifier = Modifier.fillMaxSize().background(gradient45)) {
            ListaDeTarefasApp()
        }
    }
}