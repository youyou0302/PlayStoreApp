package kr.co.playstoreapp.ui.screen.game

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kr.co.playstoreapp.R
import kr.co.playstoreapp.model.NormalCardTitle
import kr.co.playstoreapp.model.Product
import kr.co.playstoreapp.ui.component.BannerListCard
import kr.co.playstoreapp.ui.component.NormalCard

@Composable
fun SuggestionScreen() {
    val products = getExampleProducts()
    val normalCardTitle1 = getNormalCardTitle1()
    val normalCardProducts1 = getNormalCardProducts1()
    val normalCardTitle2 = getNormalCardTitle2()
    val normalCardProducts2 = getNormalCardProducts2()

    LazyColumn {
        item {
            BannerListCard(products)
            Spacer(Modifier.height(10.dp))
            NormalCard(normalCardTitle1, normalCardProducts1)
            Spacer(Modifier.height(10.dp))
            NormalCard(normalCardTitle2, normalCardProducts2)
            Spacer(Modifier.height(10.dp))
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
        rating = "3.8",
        type = "롤플레잉 * 기사"
    )
    val product2 = Product(
        id = "신의 탑: 새로운 세계",
        name = "신의 탑: 새로운 세계",
        mainImage = R.drawable.top_main,
        subImage = R.drawable.top_sub,
        company = "Netmarble",
        age = "12세",
        rating = "4.5",
        type = "NGELGAMES * 롤플레잉 * 방치형 RPG * 캐주얼"
    )
    val product3 = Product(
        id = "THE 라그나로크",
        name = "THE 라그나로크",
        mainImage = R.drawable.ragnarok_main,
        subImage = R.drawable.ragnarok_sub,
        company = "GRAVITY CO., Ltd",
        age = "19",
        rating = "1.7",
        type = "신규 * GRAVITY Co. Ltd * 롤플레잉"
    )
    val products = listOf(product1, product2, product3)

    return products
}

fun getNormalCardTitle1(): NormalCardTitle {
    return NormalCardTitle(
        name1 = "스폰서 - ",
        name2 = "추천",
        icon = R.drawable.horizontal_3dots,
        imageVector = null,
    )
}

private fun getNormalCardProducts1(): List<Product> {
    val product1 = Product(
        id = "리니지 W",
        name = "리니지 W",
        mainImage = R.drawable.lineage_main,
        subImage = R.drawable.lineage_sub,
        company = "nc soft",
        age = "15세",
        rating = "3.8",
        type = "롤플레잉 * 기사"
    )
    val product2 = Product(
        id = "신의 탑: 새로운 세계",
        name = "신의 탑: 새로운 세계",
        mainImage = R.drawable.top_main,
        subImage = R.drawable.top_sub,
        company = "Netmarble",
        age = "12세",
        rating = "4.5",
        type = "NGELGAMES * 롤플레잉 * 방치형 RPG * 캐주얼"
    )
    val product3 = Product(
        id = "THE 라그나로크",
        name = "THE 라그나로크",
        mainImage = R.drawable.ragnarok_main,
        subImage = R.drawable.ragnarok_sub,
        company = "GRAVITY CO., Ltd",
        age = "19",
        rating = "1.7",
        type = "신규 * GRAVITY Co. Ltd * 롤플레잉"
    )
    val product4 = Product(
        id = "신의 탑: 새로운 세계",
        name = "신의 탑: 새로운 세계",
        mainImage = R.drawable.top_main,
        subImage = R.drawable.top_sub,
        company = "Netmarble",
        age = "12세",
        rating = "4.5",
        type = "NGELGAMES * 롤플레잉 * 방치형 RPG * 캐주얼"
    )
    val product5 = Product(
        id = "THE 라그나로크",
        name = "THE 라그나로크",
        mainImage = R.drawable.ragnarok_main,
        subImage = R.drawable.ragnarok_sub,
        company = "GRAVITY CO., Ltd",
        age = "19",
        rating = "1.7",
        type = "신규 * GRAVITY Co. Ltd * 롤플레잉"
    )
    val product6 = Product(
        id = "리니지 W",
        name = "리니지 W",
        mainImage = R.drawable.lineage_main,
        subImage = R.drawable.lineage_sub,
        company = "nc soft",
        age = "15세",
        rating = "3.8",
        type = "롤플레잉 * 기사"
    )
    val product7 = Product(
        id = "THE 라그나로크",
        name = "THE 라그나로크",
        mainImage = R.drawable.ragnarok_main,
        subImage = R.drawable.ragnarok_sub,
        company = "GRAVITY CO., Ltd",
        age = "19",
        rating = "1.7",
        type = "신규 * GRAVITY Co. Ltd * 롤플레잉"
    )
    val product8 = Product(
        id = "리니지 W",
        name = "리니지 W",
        mainImage = R.drawable.lineage_main,
        subImage = R.drawable.lineage_sub,
        company = "nc soft",
        age = "15세",
        rating = "3.8",
        type = "롤플레잉 * 기사"
    )
    val product9 = Product(
        id = "신의 탑: 새로운 세계",
        name = "신의 탑: 새로운 세계",
        mainImage = R.drawable.top_main,
        subImage = R.drawable.top_sub,
        company = "Netmarble",
        age = "12세",
        rating = "4.5",
        type = "NGELGAMES * 롤플레잉 * 방치형 RPG * 캐주얼"
    )
    val products = listOf(
        product1,
        product2,
        product3,
        product4,
        product5,
        product6,
        product7,
        product8,
        product9
    )

    return products
}


fun getNormalCardTitle2(): NormalCardTitle {
    return NormalCardTitle(
        name1 = null,
        name2 = "내 최근 활동에 따른 추천",
        icon = null,
        imageVector = Icons.Filled.ArrowForward
    )
}

private fun getNormalCardProducts2(): List<Product> {
    val product1 = Product(
        id = "신의 탑: 새로운 세계",
        name = "신의 탑: 새로운 세계",
        mainImage = R.drawable.top_main,
        subImage = R.drawable.top_sub,
        company = "Netmarble",
        age = "12세",
        rating = "4.5",
        type = "NGELGAMES * 롤플레잉 * 방치형 RPG * 캐주얼"
    )
    val product2 = Product(
        id = "리니지 W",
        name = "리니지 W",
        mainImage = R.drawable.lineage_main,
        subImage = R.drawable.lineage_sub,
        company = "nc soft",
        age = "15세",
        rating = "3.8",
        type = "롤플레잉 * 기사"
    )
    val product3 = Product(
        id = "THE 라그나로크",
        name = "THE 라그나로크",
        mainImage = R.drawable.ragnarok_main,
        subImage = R.drawable.ragnarok_sub,
        company = "GRAVITY CO., Ltd",
        age = "19",
        rating = "1.7",
        type = "신규 * GRAVITY Co. Ltd * 롤플레잉"
    )
    val product4 = Product(
        id = "신의 탑: 새로운 세계",
        name = "신의 탑: 새로운 세계",
        mainImage = R.drawable.top_main,
        subImage = R.drawable.top_sub,
        company = "Netmarble",
        age = "12세",
        rating = "4.5",
        type = "NGELGAMES * 롤플레잉 * 방치형 RPG * 캐주얼"
    )
    val product5 = Product(
        id = "THE 라그나로크",
        name = "THE 라그나로크",
        mainImage = R.drawable.ragnarok_main,
        subImage = R.drawable.ragnarok_sub,
        company = "GRAVITY CO., Ltd",
        age = "19",
        rating = "1.7",
        type = "신규 * GRAVITY Co. Ltd * 롤플레잉"
    )
    val product6 = Product(
        id = "리니지 W",
        name = "리니지 W",
        mainImage = R.drawable.lineage_main,
        subImage = R.drawable.lineage_sub,
        company = "nc soft",
        age = "15세",
        rating = "3.8",
        type = "롤플레잉 * 기사"
    )
    val product7 = Product(
        id = "THE 라그나로크",
        name = "THE 라그나로크",
        mainImage = R.drawable.ragnarok_main,
        subImage = R.drawable.ragnarok_sub,
        company = "GRAVITY CO., Ltd",
        age = "19",
        rating = "1.7",
        type = "신규 * GRAVITY Co. Ltd * 롤플레잉"
    )
    val product8 = Product(
        id = "리니지 W",
        name = "리니지 W",
        mainImage = R.drawable.lineage_main,
        subImage = R.drawable.lineage_sub,
        company = "nc soft",
        age = "15세",
        rating = "3.8",
        type = "롤플레잉 * 기사"
    )
    val product9 = Product(
        id = "신의 탑: 새로운 세계",
        name = "신의 탑: 새로운 세계",
        mainImage = R.drawable.top_main,
        subImage = R.drawable.top_sub,
        company = "Netmarble",
        age = "12세",
        rating = "4.5",
        type = "NGELGAMES * 롤플레잉 * 방치형 RPG * 캐주얼"
    )
    val products = listOf(
        product1,
        product2,
        product3,
        product4,
        product5,
        product6,
        product7,
        product8,
        product9
    )

    return products
}