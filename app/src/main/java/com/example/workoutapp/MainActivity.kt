package com.example.workoutapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.workoutapp.screens.NavGraphs
import com.example.workoutapp.ui.theme.WorkoutAppTheme
import com.ramcosta.composedestinations.DestinationsNavHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorkoutAppTheme {
                DestinationsNavHost(navGraph = NavGraphs.root)

                /*TODO("1 - Edzéstervek képernyő létrehozása")
                TODO("2 - Edzéstervek gombra rámenve a főmenüben az új képernyő megnyitása")
                TODO("3 - Feri gyűjtse ki a gyakorlatokról az infókat")
                TODO("4 - Firebase adatbázis kezelés implementálása")
                TODO("5 - Edzésterven belül egy új gyakorlat felvételekor kilistázni a gyakorlatokat")*/
            }
        }
    }
}

