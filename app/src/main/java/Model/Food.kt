package Model
import androidx.annotation.DrawableRes

data class Food (
    val name: String,
    val harga: Double,
    val stok: Int,
    @DrawableRes val imageResourceId: Int
)