package ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SearchInput(modifier: Modifier = Modifier) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .clip(shape = RoundedCornerShape(8.dp))
        .background(Color(0xFFFFFFFF))
        .padding(vertical = 6.dp, horizontal = 8.dp), horizontalArrangement = Arrangement.spacedBy(2.dp), verticalAlignment = Alignment.CenterVertically) {
        Icon(imageVector = Icons.Default.Search, contentDescription = null, tint = Color(0xFF1e1e1d), modifier = Modifier.size(18.dp))
        Card(colors = CardDefaults.cardColors(containerColor = Color(0xFFFFFFFF)), modifier = Modifier.fillMaxWidth()) {
            Text(text = "Cari makanan...", color = Color(0xFFd2d1d0), modifier = Modifier.padding(horizontal = 6.dp), fontSize = 14.sp)
        }
//        TextField(value = "",  onValueChange = {},  modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp), singleLine = true, placeholder = { Text(text = "Cari makanan") }, colors = TextFieldDefaults.colors(
//            focusedContainerColor = Color(0xFFFFFFFF),
//            unfocusedContainerColor = Color(0xFFFFFFFF),
//            focusedIndicatorColor = Color.Transparent,
//            unfocusedIndicatorColor = Color.Transparent,
//        ))

    }
}