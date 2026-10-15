package com.example.tugas4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tugas4.ui.theme.Tugas4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Tugas4Theme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen(
    callViewModel: CallViewModel = viewModel()
) {
    val count = callViewModel.count.intValue

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "NIM: 245150401111026",
                fontSize = 20.sp
            )

            Text(
                text = "Nama: Pinartika Nasya Meilanty",
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Nilai: $count",
                fontSize = 32.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(onClick = { callViewModel.down() }) {
                    Text("Down")
                }

                Button(onClick = { callViewModel.up() }) {
                    Text("Up")
                }

                Button(onClick = { callViewModel.reset() }) {
                    Text("Reset")
                }
            }
        }
    }
}
