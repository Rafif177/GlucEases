package com.example.glucease.ui.laporan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import com.example.glucease.ui.laporan.RingkasanGulaSection
import com.example.glucease.ui.laporan.RingkasanGulaDarahSection
import com.example.glucease.ui.laporan.TopBarSection
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LaporanMingguanPage() {
    androidx.compose.material3.Scaffold(
        bottomBar = {
            BottomNavigationBar()
        }
    ) { innerPadding -> // gunakan penulisan yang benar
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding) // <-- di sini kamu pakai innerPadding
                .padding(bottom = 64.dp) // jika memang butuh ekstra padding di bawah
        ) {
            TopBarSection()
            Spacer(modifier = Modifier.height(16.dp))
            RingkasanGulaSection()
            Spacer(modifier = Modifier.height(16.dp))
            RingkasanGulaDarahSection()
            Spacer(modifier = Modifier.height(16.dp))
            AktivitasMisiSection()
            Spacer(modifier = Modifier.weight(4f))
        }
    }
}

//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .verticalScroll(rememberScrollState())
//            .padding(bottom = 64.dp)
//    ) {
//        TopBarSection()
//        Spacer(modifier = Modifier.height(16.dp))
//        RingkasanGulaSection()
//        Spacer(modifier = Modifier.height(16.dp))
//        RingkasanGulaDarahSection()
//        Spacer(modifier = Modifier.height(16.dp))
//        AktivitasMisiSection()
//        Spacer(modifier = Modifier.weight(1f))
//        BottomNavigationBar()
//    }



@Preview(showBackground = true)
@Composable
fun PreviewLMP() {
    LaporanMingguanPage()
}
