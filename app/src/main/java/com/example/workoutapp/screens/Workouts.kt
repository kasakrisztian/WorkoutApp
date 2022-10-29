package com.example.workoutapp.screens

import android.widget.Toast
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun Workouts(
    navigator: DestinationsNavigator
) {
    val toastContext = LocalContext.current.applicationContext

    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "Edzéstervek") },
            actions = {
                IconButton(onClick = {
                    Toast.makeText(toastContext, "Törlés", Toast.LENGTH_SHORT).show()
                }) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = null
                    )
                }
            }
        )
    }) {
        LazyColumn() {

        }
        Button(colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(152, 251, 152),
            contentColor = Color.White
        ),
            onClick = {
                Toast.makeText(toastContext, "Új terv létrehozása", Toast.LENGTH_SHORT).show()
            }) {
            Text(
                text = "Új terv",
                fontSize = 20.sp
            )
        }
    }
}