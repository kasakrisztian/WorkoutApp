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
import com.example.workoutapp.screens.destinations.DirectionDestination
import com.example.workoutapp.screens.destinations.WorkoutsDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.spec.Direction
import com.ramcosta.composedestinations.spec.DirectionDestinationSpec

@Destination(start = true)
@Composable
fun MainScreen(
    navigator: DestinationsNavigator
) {
    val toastContext = LocalContext.current.applicationContext
    val modifier: Modifier = Modifier

    Scaffold(
        backgroundColor = Color(211, 211, 211),
        topBar = {
        TopAppBar(
            title = { Text("App neve") },
            actions = {
                IconButton(onClick = {
                    //navigator.navigate()
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
                backgroundColor = Color(152, 251, 152),
                contentColor = Color.White),
                onClick = {
                    Toast.makeText(toastContext, "Aktív edzéstervek megnyitása", Toast.LENGTH_LONG ).show()
            }) {
                Text(
                    text = "Aktív edzésterv",
                    fontSize = 32.sp
                )
            }
            Spacer(modifier = modifier.height(32.dp))
            /*Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(152, 251, 152),
                contentColor = Color.White),
                onClick = {
                    navigator.navigate(WorkoutsDestination())
            }) {
                Text(
                    text = "Edzéstervek",
                    fontSize = 32.sp
                )
            }*/
            ButtonLayout(
                navigator = navigator,
                destination = WorkoutsDestination(),
                content = "Edzéstervek"
            )
            Spacer(modifier = modifier.height(32.dp))
            /*ButtonLayout(
                navigator = navigator,
                destination = ,
                content =
            )*/
            Spacer(modifier = modifier.height(32.dp))
            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor =Color(152, 251, 152),
                contentColor = Color.White),
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

@Composable
fun ButtonLayout(
    navigator: DestinationsNavigator,
    destination: Direction,
    content: String
) {
    Button(colors = ButtonDefaults.buttonColors(
        backgroundColor = Color(152, 251, 152),
        contentColor = Color.White
    ),
        onClick = {
            navigator.navigate(destination)
        }) {
        Text(
            text = content,
            fontSize = 32.sp
        )
    }
}