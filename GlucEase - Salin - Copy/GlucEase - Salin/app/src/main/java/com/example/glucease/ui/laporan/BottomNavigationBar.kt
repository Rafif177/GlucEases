package com.example.glucease.ui.laporan

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.glucease.R

@Composable
fun BottomNavigationBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(painter = painterResource(id = R.drawable.ic_home), contentDescription = "home", tint = Color.Unspecified)
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(painter = painterResource(id = R.drawable.ic_chat), contentDescription = "chat", tint = Color.Unspecified)
        }
        Icon(
            painter = painterResource(id = R.drawable.ic_chart), // Ganti dengan resource graph Anda
            contentDescription = "chart",
            modifier = Modifier.padding(start = 16.dp),
            tint = Color.Unspecified
        )
        IconButton(onClick = { /*TODO*/ }) {
            Icon(painter = painterResource(id = R.drawable.ic_report), contentDescription = "report", tint = Color.Unspecified)
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(painter = painterResource(id = R.drawable.ic_docs), contentDescription = "docs", tint = Color.Unspecified)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBNS() {
    BottomNavigationBar()
}
