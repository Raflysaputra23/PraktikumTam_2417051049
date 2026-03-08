package com.example.praktam_2417051049

import Model.FoodSource
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktam_2417051049.ui.theme.PrakTam_2417051049Theme
import ui.components.Header

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrakTam_2417051049Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column(modifier = modifier, verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Header()
        Column(modifier = Modifier.fillMaxWidth().padding(end = 12.dp, start = 12.dp).height(100.dp)) {
            Image(painter = painterResource(id = R.drawable.banner),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth().clip(shape = RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop)
        }
        Column(modifier = Modifier.fillMaxWidth().padding(end = 12.dp, start = 12.dp).height(height = 55.dp), verticalArrangement = Arrangement.spacedBy(2.dp)) {
            Text(text = "Kategori", fontSize = 14.sp, color = Color(0xFF1e1e1d), fontWeight = FontWeight.SemiBold)
            LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                items(items = listOf("Makanan", "Minuman", "Cemilan")) { item ->
                    Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(10.dp), colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFF5722),
                        contentColor = Color(0xFFFFFFFF),

                        ), contentPadding = PaddingValues(horizontal = 10.dp)) {
                        Text(text = item, fontSize = 12.sp, fontWeight = FontWeight.Medium)
                    }
                }
            }

        }
        Column(modifier = Modifier.fillMaxWidth().padding(end = 12.dp, start = 12.dp)) {
            Text(text = "Semua Menu", fontSize = 14.sp, color = Color(0xFF1e1e1d), fontWeight = FontWeight.SemiBold)
            Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Card(modifier = Modifier.clip(shape = RoundedCornerShape(8.dp)).fillMaxWidth(0.5f)) {
                        Column() {
                            Box(modifier = Modifier.fillMaxWidth().height(100.dp)) {
                                Image(painter = painterResource(id = R.drawable.banner),
                                    contentDescription = null,
                                    modifier = Modifier.fillMaxSize().clip(shape = RoundedCornerShape(8.dp)),
                                    contentScale = ContentScale.Crop)
                                Text(text = "Makanan", fontSize = 14.sp, color = Color(0xFFFFFFFF), fontWeight = FontWeight.Medium, modifier = Modifier.background(Color(0xFFFF5722), shape = RoundedCornerShape(4.dp)).padding(vertical = 4.dp, horizontal = 8.dp))
                            }
                            Column(modifier = Modifier.padding(horizontal = 6.dp, vertical = 4.dp)) {
                                Text(text = "Nasi Goreng", fontSize = 14.sp, color = Color(0xFF000000), fontWeight = FontWeight.SemiBold)
                                Text(text = "Nasi goreng dengan telur", fontSize = 11.sp, color = Color(0xFF000000), fontWeight = FontWeight.Light)
                                Spacer(modifier = Modifier.height(4.dp))
                                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                                    Text(text = "Rp. 15.000", fontSize = 14.sp, fontWeight = FontWeight.SemiBold, color = Color(0xFFFF5722))
                                    Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(10.dp), colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(0xFFFF5722),
                                        contentColor = Color(0xFFFFFFFF),

                                        ), contentPadding = PaddingValues(horizontal = 4.dp, vertical = 2.dp)) {
                                        Text(text = "Beli", fontSize = 12.sp, fontWeight = FontWeight.Medium)
                                    }

                                }
                            }
                        }
                    }
                    Card(modifier = Modifier.clip(shape = RoundedCornerShape(8.dp)).fillMaxWidth()) {
                        Column() {
                            Box(modifier = Modifier.fillMaxWidth().height(100.dp)) {
                                Image(painter = painterResource(id = R.drawable.banner),
                                    contentDescription = null,
                                    modifier = Modifier.fillMaxSize().clip(shape = RoundedCornerShape(8.dp)),
                                    contentScale = ContentScale.Crop)
                                Text(text = "Makanan", fontSize = 14.sp, color = Color(0xFFFFFFFF), fontWeight = FontWeight.Medium, modifier = Modifier.background(Color(0xFFFF5722), shape = RoundedCornerShape(4.dp)).padding(vertical = 4.dp, horizontal = 8.dp))
                            }
                            Column(modifier = Modifier.padding(horizontal = 6.dp, vertical = 4.dp)) {
                                Text(text = "Sate Ayam", fontSize = 14.sp, color = Color(0xFF000000), fontWeight = FontWeight.SemiBold)
                                Text(text = "Sate Ayam dengan bumbu kacang", fontSize = 11.sp, color = Color(0xFF000000), fontWeight = FontWeight.Light)
                                Spacer(modifier = Modifier.height(4.dp))
                                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                                    Text(text = "Rp. 25.000", fontSize = 14.sp, fontWeight = FontWeight.SemiBold, color = Color(0xFFFF5722))
                                    Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(10.dp), colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(0xFFFF5722),
                                        contentColor = Color(0xFFFFFFFF),

                                        ), contentPadding = PaddingValues(horizontal = 4.dp, vertical = 2.dp)) {
                                        Text(text = "Beli", fontSize = 12.sp, fontWeight = FontWeight.Medium)
                                    }

                                }
                            }
                        }
                    }

                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Card(modifier = Modifier.clip(shape = RoundedCornerShape(8.dp)).fillMaxWidth(0.5f)) {
                        Column() {
                            Box(modifier = Modifier.fillMaxWidth().height(100.dp)) {
                                Image(painter = painterResource(id = R.drawable.snack),
                                    contentDescription = null,
                                    modifier = Modifier.fillMaxSize().clip(shape = RoundedCornerShape(8.dp)),
                                    contentScale = ContentScale.Crop)
                                Text(text = "Makanan", fontSize = 14.sp, color = Color(0xFFFFFFFF), fontWeight = FontWeight.Medium, modifier = Modifier.background(Color(0xFFFF5722), shape = RoundedCornerShape(4.dp)).padding(vertical = 4.dp, horizontal = 8.dp))
                            }
                            Column(modifier = Modifier.padding(horizontal = 6.dp, vertical = 4.dp)) {
                                Text(text = "Pizza", fontSize = 14.sp, color = Color(0xFF000000), fontWeight = FontWeight.SemiBold)
                                Text(text = "Pizza dengan daging sapi", fontSize = 11.sp, color = Color(0xFF000000), fontWeight = FontWeight.Light)
                                Spacer(modifier = Modifier.height(4.dp))
                                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                                    Text(text = "Rp. 85.000", fontSize = 14.sp, fontWeight = FontWeight.SemiBold, color = Color(0xFFFF5722))
                                    Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(10.dp), colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(0xFFFF5722),
                                        contentColor = Color(0xFFFFFFFF),

                                        ), contentPadding = PaddingValues(horizontal = 4.dp, vertical = 2.dp)) {
                                        Text(text = "Beli", fontSize = 12.sp, fontWeight = FontWeight.Medium)
                                    }

                                }
                            }
                        }
                    }
                    Card(modifier = Modifier.clip(shape = RoundedCornerShape(8.dp)).fillMaxWidth()) {
                        Column() {
                            Box(modifier = Modifier.fillMaxWidth().height(100.dp)) {
                                Image(painter = painterResource(id = R.drawable.seafood),
                                    contentDescription = null,
                                    modifier = Modifier.fillMaxSize().clip(shape = RoundedCornerShape(8.dp)),
                                    contentScale = ContentScale.Crop)
                                Text(text = "Makanan", fontSize = 14.sp, color = Color(0xFFFFFFFF), fontWeight = FontWeight.Medium, modifier = Modifier.background(Color(0xFFFF5722), shape = RoundedCornerShape(4.dp)).padding(vertical = 4.dp, horizontal = 8.dp))
                            }
                            Column(modifier = Modifier.padding(horizontal = 6.dp, vertical = 4.dp)) {
                                Text(text = "Seafood", fontSize = 14.sp, color = Color(0xFF000000), fontWeight = FontWeight.SemiBold)
                                Text(text = "Aneka makanan laut fresh", fontSize = 11.sp, color = Color(0xFF000000), fontWeight = FontWeight.Light)
                                Spacer(modifier = Modifier.height(4.dp))
                                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                                    Text(text = "Rp. 35.000", fontSize = 14.sp, fontWeight = FontWeight.SemiBold, color = Color(0xFFFF5722))
                                    Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(10.dp), colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(0xFFFF5722),
                                        contentColor = Color(0xFFFFFFFF),

                                        ), contentPadding = PaddingValues(horizontal = 4.dp, vertical = 2.dp)) {
                                        Text(text = "Beli", fontSize = 12.sp, fontWeight = FontWeight.Medium)
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPreview() {
    PrakTam_2417051049Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Greeting(
                name = "FoodMart",
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}