package kr.co.playstoreapp.ui.screen.game

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import kr.co.playstoreapp.R
import kr.co.playstoreapp.model.Product
import kr.co.playstoreapp.ui.component.BannerListCard
import kr.co.playstoreapp.ui.component.NormalCard

@Composable
fun SuggestionScreen() {
    val products = getExampleProducts()

    LazyColumn {
        item {
            BannerListCard(products)
            NormalCard()
        }
    }
}

private fun getExampleProducts(): List<Product> {
    val product1 = Product(
        id = "리니지 W",
        name = "리니지 W",
        mainImage = R.drawable.lineage_main,
        subImage = R.drawable.lineage_sub,
        company = "nc soft",
        age = "15세",
        rating = "3.8"
    )
    val product2 = Product(
        id = "신의 탑: 새로운 세계",
        name = "신의 탑: 새로운 세계",
        mainImage = R.drawable.top_main,
        subImage = R.drawable.top_sub,
        company = "Netmarble",
        age = "12세",
        rating = "4.5"
    )
    val product3 = Product(
        id = "THE 라그나로크",
        name = "THE 라그나로크",
        mainImage = R.drawable.ragnarok_main,
        subImage = R.drawable.ragnarok_sub,
        company = "GRAVITY CO., Ltd",
        age = "19",
        rating = "1.7"
    )
    val products = listOf(product1, product2, product3)

    return products
}