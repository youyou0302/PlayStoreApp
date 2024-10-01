package kr.co.playstoreapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kr.co.playstoreapp.R

@OptIn(ExperimentalPagerApi::class, ExperimentalMaterial3Api::class)
@Composable
fun NormalCard() {
    val pagerState = rememberPagerState()

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.width(10.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "스폰서 - ",
                fontSize = 9.sp,
            )
            Text(
                text = "추천",
                fontSize = 12.sp
            )
        }
        IconButton(
            onClick = {},
        ) {
            Icon(
                imageVector = Icons.Filled.Done,
                contentDescription = "Description"
            )
        }
    }

    HorizontalPager(
        count = 3,
        state = pagerState,
        contentPadding = PaddingValues(horizontal = 10.dp),
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
            ),
            border = CardDefaults.outlinedCardBorder(),
            onClick = {}
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Image(
                    painter = painterResource(id = R.drawable.lineage_main),
                    contentDescription = "description",
                    modifier = Modifier
                        .height(150.dp)
                        .aspectRatio(1f)
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lineage_sub),
                        contentDescription = "description",
                        modifier = Modifier
                            .size(40.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.weight(2.0f)
                    ) {
                        Text(
                            text = "리니지 W",
                            fontSize = 15.sp
                        )
                        Row {
                            Text(
                                text = "nc soft",
                                fontSize = 12.sp
                            )
                            Text(
                                text = " * ",
                                fontSize = 12.sp
                            )
                            Text(
                                text = "15세",
                                fontSize = 12.sp
                            )
                            Text(
                                text = " * ",
                                fontSize = 12.sp
                            )
                            Text(
                                text = "3.8",
                                fontSize = 12.sp
                            )
                        }
                    }
                }
            }
        }
    }
}