package kr.co.playstoreapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kr.co.playstoreapp.model.NormalCardTitle
import kr.co.playstoreapp.model.Product

@Composable
fun NormalCard(cardTitle: NormalCardTitle, products: List<Product>) {
    CardTitle(cardTitle)
    CardContent(products)
}

@Composable
fun CardTitle(cardTitle: NormalCardTitle) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.width(10.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = cardTitle.name1 ?: "",
                fontSize = 9.sp,
            )
            Text(
                text = cardTitle.name2 ?: "",
                fontSize = 13.sp
            )
        }
        Spacer(Modifier.weight(1f))
        IconButton(
            onClick = {},
        ) {
            if (cardTitle.icon != null) {
                Icon(
                    painter = painterResource(id = cardTitle.icon),
                    contentDescription = "Description",
                    modifier = Modifier.size(20.dp)
                )
            } else if (cardTitle.imageVector != null) {
                Icon(
                    imageVector = cardTitle.imageVector,
                    contentDescription = "Description",
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun CardContent(products: List<Product>) {
    val pagerState = rememberPagerState()

    HorizontalPager(
        count = products.size / 3 + (if (products.size % 3 == 0) 0 else 1),
        state = pagerState,
        contentPadding = PaddingValues(horizontal = 10.dp),
    ) { page ->
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            ProductCard(products[page * 3])
            Spacer(modifier = Modifier.height(10.dp))
            if (page * 3 + 1 < products.size)
                ProductCard(products[page * 3 + 1])
            Spacer(modifier = Modifier.height(10.dp))
            if (page * 3 + 2 < products.size)
                ProductCard(products[page * 3 + 2])
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductCard(product: Product) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),
        modifier = Modifier
            .fillMaxWidth(),
        onClick = {}
    ) {
        Row {
            Image(
                painter = painterResource(id = product.subImage),
                contentDescription = "description",
                modifier = Modifier
                    .size(50.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = product.name,
                    fontSize = 12.sp
                )
                Text(
                    text = product.type,
                    fontSize = 12.sp
                )
                Text(
                    text = product.rating,
                    fontSize = 12.sp
                )
            }
        }
    }
}