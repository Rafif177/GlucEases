package com.example.uijp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.konsultasiprofil.UI.Screen.KonsultasiUi
import com.example.uijp.laporan.LaporanMingguanPage
import com.example.uijp.ui.LoginScreen
import com.example.uijp.LupaPasswordScreen
import com.example.uijp.ui.RegisterScreen
import com.example.uijp.ResetPasswordScreen
import com.example.uijp.VerificationScreen
import com.example.uijp.artikel.ArtikelKategoriScreen
import com.example.uijp.artikel.ArtikelScreen
import com.example.uijp.artikel.DetailArtikelScreen
import com.example.uijp.tracker.TrackerGulaScreen
import com.example.uijp.ui.theme.UijpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UijpTheme {
                val navController = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainNavGraph(navController = navController, modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainNavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = "register", modifier = modifier) {
        composable("login") { LoginScreen(navController) }
        composable("register") { RegisterScreen(navController) }
        composable("reminder") { ReminderScreen(navController) }
        composable("LMP") { LaporanMingguanPage(navController) }
        composable("home") {HomeScreen(navController)}
        composable("artikel") { ArtikelScreen(navController)}
        composable("konsultasi") { KonsultasiUi(navController)}
        composable("tracker") { TrackerGulaScreen(navController)}

    }
}

