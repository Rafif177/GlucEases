package com.example.uijp

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.uijp.HomeScreen
import com.example.uijp.artikel.ArtikelScreen
import com.example.uijp.laporan.BottomNavigationBar

@Composable
fun MainNavigation(rootNavHostController: NavHostController, selectedTab: String = "home_main") {

    val buttomNavController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigationBar(buttomNavController)
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { buttomNavController.navigate("progress") },
                containerColor = Color(0xFFFF6F61),
                contentColor = Color.White
            ) {
                Icon(Icons.Default.Favorite, contentDescription = "Progress")
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        // FAB akan otomatis mengambang di atas NavigationBar
    ) { paddingValues ->
        NavHost(
            navController = buttomNavController,
            startDestination = selectedTab,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable("home_main") { HomeScreen(rootNavHostController) }
            composable("konsultasi") { /* TODO */ }
            composable("progress") { /* TODO */ }
            composable("artikel") { ArtikelScreen(rootNavHostController) }
            composable("laporan") { /* TODO */ }
        }
    }
}
