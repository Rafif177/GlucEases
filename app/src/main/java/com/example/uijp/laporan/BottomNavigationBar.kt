package com.example.uijp.laporan

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoGraph
import androidx.compose.material.icons.filled.CardGiftcard
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.uijp.LupaPasswordScreen

@Composable
fun BottomNavigationBar(navController: NavController) {
    //Membuat value yang berfungsi untuk mengambil route (halaman) yang sedang aktif dari NavController
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

    //Membuat value untuk memberi warna item navbar yang sedang aktif
    val activeColor = Color(0xFFFF6F61)

    NavigationBar(
        containerColor = Color.White // background navbar
    ) {
        NavigationBarItem(
            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
            label = { Text("Home") },
            selected = currentRoute == "home_main",
            onClick = { navController.navigate("home_main") },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = activeColor,
                selectedTextColor = activeColor
            )
        )

        NavigationBarItem(
            icon = { Icon(Icons.Default.CardGiftcard, contentDescription = "Konsultasi") },
            label = { Text("Konsultasi") },
            selected = currentRoute == "Konsultasi",
            onClick = { navController.navigate("konsultasi") },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = activeColor,
                selectedTextColor = activeColor
            )
        )

        // FAB akan muncul di tengah, jadi ini slot tengah (kosong)
        NavigationBarItem(
            icon = { Icon(Icons.Default.AutoGraph, contentDescription = "Tracker") },
            label = { Text("Tracker") },
            selected = currentRoute == "tracker",
            onClick = { navController.navigate("tracker") },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = activeColor,
                selectedTextColor = activeColor
            )
        )

        NavigationBarItem(
            icon = { Icon(Icons.Default.MenuBook, contentDescription = "Artikel") },
            label = { Text("Artikel") },
            selected = currentRoute == "artikel",
            onClick = { navController.navigate("artikel") },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = activeColor,
                selectedTextColor = activeColor
            )
        )

        NavigationBarItem(
            icon = { Icon(Icons.Default.Description, contentDescription = "Laporan") },
            label = { Text("Laporan") },
            selected = currentRoute == "Laporan",
            onClick = { navController.navigate("laporan") },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = activeColor,
                selectedTextColor = activeColor
            )
        )
    }
}

@Preview
@Composable
fun PreviewButtonNavBar() {
    val navController = rememberNavController() // Dummy NavController
    BottomNavigationBar(navController)
}