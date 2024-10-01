package kr.co.playstoreapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kr.co.playstoreapp.model.Product

@OptIn(ExperimentalPagerApi::class, ExperimentalMaterial3Api::class)
@Composable
fun BannerListCard(products: List<Product>) {
    val pagerState = rememberPagerState()

    val widthWeight = 0.92f
    val horizontalContentPadding = (LocalConfiguration.current.screenWidthDp * (1f - widthWeight) / 2).dp

    HorizontalPager(
        count = products.size,
        state = pagerState,
        contentPadding = PaddingValues(horizontal = horizontalContentPadding),
        itemSpacing = 10.dp,
    ) { page ->
        Card(
            shape = RectangleShape,
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
            ),
            modifier = Modifier
                .fillMaxWidth(),
            onClick = {}
        ) {
            Spacer(modifier = Modifier.height(5.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Image(
                    painter = painterResource(id = products[page].mainImage),
                    contentDescription = "description",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(210.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
                Spacer(modifier = Modifier.height(5.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Image(
                        painter = painterResource(id = products[page].subImage),
                        contentDescription = "description",
                        modifier = Modifier
                            .size(40.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.weight(2.0f)
                    ) {
                        Text(
                            text = products[page].name,
                            fontSize = 15.sp
                        )
                        Row {
                            Text(
                                text = products[page].company,
                                fontSize = 12.sp
                            )
                            Text(
                                text = " * ",
                                fontSize = 12.sp
                            )
                            Text(
                                text = products[page].age,
                                fontSize = 12.sp
                            )
                            Text(
                                text = " * ",
                                fontSize = 12.sp
                            )
                            Text(
                                text = products[page].rating,
                                fontSize = 12.sp
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(5.dp))
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Button(
                            modifier = Modifier.size(80.dp, 27.dp),
                            onClick = { /*TODO*/ }
                        ) {
                            Text(
                                text = "설치",
                                fontSize = 8.sp
                            )
                        }
                        Text(
                            text = "인앱 구매",
                            fontSize = 8.sp
                        )
                    }
                }
            }
        }
    }
}