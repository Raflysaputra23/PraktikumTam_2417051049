package ui.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktam_2417051049.R

@Composable
fun Header() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .clip(shape = RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp))
        .background(Color(0xFFFF5722))
        .padding(top = 24.dp, end = 12.dp, start = 12.dp, bottom = 12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Column(verticalArrangement = Arrangement.spacedBy(-4.dp)) {
                Text(text = "Halo, Rafly", fontSize = 15.sp, color = Color(0xFFd2d1d0), fontWeight = FontWeight.Light)
                Text(text = "Mau makan apa hari ini?", fontSize = 16.sp, color = Color(0xFFFFFFFF), fontWeight = FontWeight.Bold)
            }
            Card(modifier = Modifier.clip(shape = CircleShape).size(42.dp)) {
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null, tint = Color(0xFFFFFFFF), modifier = Modifier.padding(8.dp).size(42.dp))
//                Text(text="R", fontSize = 20.sp, color = Color(0xFFFFFFFF), fontWeight = FontWeight.Bold)
//                Image(painter = painterResource(id = R.drawable.pizza), contentDescription = null)
            }
        }
        SearchInput()
    }
}
