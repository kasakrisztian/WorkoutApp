package com.example.workoutapp.screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen(modifier: Modifier) {
    val toastContext = LocalContext.current.applicationContext

    Scaffold(
        backgroundColor = Color.DarkGray,
        topBar = {
        TopAppBar(
            title = { Text("App neve") },
            actions = {
                IconButton(onClick = {
                    Toast.makeText(toastContext, "Beállítások megnyitása", Toast.LENGTH_LONG ).show()
                }) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = null)
                }
            }
        )
    }) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Green, contentColor = Color.White),
                onClick = {
                Toast.makeText(toastContext, "Aktív edzéstervek megnyitása", Toast.LENGTH_LONG ).show()
            }) {
                Text(
                    text = "Aktív edzésterv",
                    fontSize = 32.sp
                )
            }
            Spacer(modifier = modifier.height(32.dp))
            Button(colors = ButtonDefaults.buttonColors( backgroundColor = Color.Green, contentColor = Color.White),
                onClick = {
                Toast.makeText(toastContext, "Edzéstervek megnyitása", Toast.LENGTH_LONG).show()
            }) {
                Text(
                    text = "Edzéstervek",
                    fontSize = 32.sp
                )
            }
            Spacer(modifier = modifier.height(32.dp))
            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green, contentColor = Color.White),
                onClick = {
                Toast.makeText(toastContext, "Naptár megnyitása", Toast.LENGTH_LONG).show()
            }) {
                Text(
                    text = "Naptár",
                    fontSize = 32.sp
                )
            }
            Spacer(modifier = modifier.height(32.dp))
            Button(colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green, contentColor = Color.White),
                onClick = {
                Toast.makeText(toastContext, "Előrehaladás megnyitása", Toast.LENGTH_LONG).show()
            }) {
                Text(
                    text = "Előrehaladás",
                    fontSize = 32.sp
                )
            }
        }
    }
}