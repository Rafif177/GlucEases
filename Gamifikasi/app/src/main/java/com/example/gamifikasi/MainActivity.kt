package com.example.gamifikasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gamifikasi.ui.gamifikasi.DetailMisi
import com.example.gamifikasi.ui.gamifikasi.GamifikasiUI
import com.example.gamifikasi.ui.gamifikasi.KlaimReward

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()

            Surface(color = MaterialTheme.colorScheme.background) {
                NavHost(navController = navController, startDestination = "gamifikasi_ui") {
                    composable("gamifikasi_ui") {
                        GamifikasiUI(navController, onKlaimClicked = { navController.navigate("klaim_reward") })
                    }
                    composable("detail_misi") {
                        DetailMisi(navController)
                    }
                    composable("klaim_reward"){
                        KlaimReward(navController)
                    }
                }
            }
        }
    }
}
