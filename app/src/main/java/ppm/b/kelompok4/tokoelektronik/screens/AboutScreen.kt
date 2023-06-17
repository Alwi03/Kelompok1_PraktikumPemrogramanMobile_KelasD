package ppm.b.kelompok4.tokoelektronik.screens

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import ppm.b.kelompok4.tokoelektronik.R

@Composable
fun AboutScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxWidth()
        .fillMaxHeight()) {

        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text="Created By",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(bottom = 7.dp)
            )
            Text(
                text = "Yusril Ismail Azi",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "Gigih Dwi Saputra",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "Anjara D Nissa",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "Muhammad Alwi R",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "Sulthan Jihad",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}