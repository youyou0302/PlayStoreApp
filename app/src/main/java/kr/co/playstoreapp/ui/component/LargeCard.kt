package kr.co.playstoreapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kr.co.playstoreapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LargeCard() {
    Card(
        shape = RoundedCornerShape(4.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(intrinsicSize = IntrinsicSize.Max)
            .padding(10.dp)
            .shadow(elevation = 10.dp),
        onClick = {}
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Image(
                painter = painterResource(id = R.drawable.image_example2),
                contentDescription = "description",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Row {
                Image(
                    painter = painterResource(id = R.drawable.image_example),
                    contentDescription = "description",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.weight(1.0f)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.weight(2.0f)
                ) {
                    Text(
                        text = "리니지 W",
                        fontSize = 30.sp
                    )
                    Row {
                        Text(text = "nc soft")
                        Text(text = " * ")
                        Text(text = "15세")
                        Text(text = " * ")
                        Text(text = "3.8")
                    }
                }
                Spacer(modifier = Modifier.width(5.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.weight(1.0f)
                ) {
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "설치")
                    }
                    Text(
                        text = "인앱 구매",
                        fontSize = 10.sp
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewLargeCard() {
    LargeCard()
}