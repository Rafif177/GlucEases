package com.example.glucease

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.glucease.ui.laporan.LaporanMingguanPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LaporanMingguanPage()
//            GlucEaseApp {
//                LaporanMingguanPage()
//            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLaporanMingguanPage() {
    LaporanMingguanPage()
}



//@Composable
//fun GlucEaseApp(content: @Composable () -> Unit) {
//    MaterialTheme {
//        Surface(
//            modifier = Modifier.fillMaxSize(),
//            color = MaterialTheme.colorScheme.background
//        ) {
//            content()
//        }
//    }
//}

//
//import android.os.Bundle
//import androidx.activity.compose.setContent
//import androidx.appcompat.app.AppCompatActivity
//import androidx.compose.runtime.Composable
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import com.example.glucease.ui.HomeScreen
//import com.example.glucease.ui.LoginScreen
//import com.example.glucease.ui.LupaPasswordScreen
//import com.example.glucease.ui.RegisterScreen
//import com.example.glucease.ui.ResetPasswordScreen
//import com.example.glucease.ui.VerificationScreen


//class MainActivity : AppCompatActivity() {
//
//    @Composable
//    fun GlucEaseApp() {
//        val navController = rememberNavController()
//        NavHost(navController = navController, startDestination = "register") {
//            composable("login") { LoginScreen(navController) }
//            composable("register") { RegisterScreen(navController) }
//            composable("home") { HomeScreen(navController) }
//            composable("lupaPassword") { LupaPasswordScreen(navController) }
//            composable("verifikasi") { VerificationScreen(navController) }
//            composable("resetPassword") { ResetPasswordScreen(navController) }
//        }
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            GlucEaseApp()
//        }
//
//    }
//}