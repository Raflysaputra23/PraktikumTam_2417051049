package Model

import com.example.praktam_2417051049.R

object FoodSource {
    val foods = listOf(
        Food(
            name = "Nasi Goreng",
            harga = 15000.0,
            stok = 10,
            imageResourceId = R.drawable.pizza
        ),
        Food(
            name = "Pizza",
            harga = 150000.0,
            stok = 10,
            imageResourceId = R.drawable.pizza
        )
    )
}