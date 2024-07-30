package kr.co.playstoreapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.Text
import androidx.compose.material3.Tab
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.pagerTabIndicatorOffset
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch
import kr.co.playstoreapp.ui.data.GameScreenItem
import kr.co.playstoreapp.ui.screen.game.CategoryScreen
import kr.co.playstoreapp.ui.screen.game.KidsScreen
import kr.co.playstoreapp.ui.screen.game.NewScreen
import kr.co.playstoreapp.ui.screen.game.PopularChartsScreen
import kr.co.playstoreapp.ui.screen.game.PremiumScreen
import kr.co.playstoreapp.ui.screen.game.SuggestionScreen

@OptIn(ExperimentalPagerApi::class)
@Composable
fun GameScreen() {
    val pagerState = rememberPagerState()
    val pages = listOf(
        GameScreenItem.Suggestion.getName(),
        GameScreenItem.PopularCharts.getName(),
        GameScreenItem.Kids.getName(),
        GameScreenItem.New.getName(),
        GameScreenItem.Premium.getName(),
        GameScreenItem.Category.getName()
    )

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        GameTabRow(
            pages = pages,
            pagerState = pagerState
        )
        GameHorizontalPager(
            pages = pages,
            pagerState = pagerState
        )
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun GameTabRow(
    pages: List<String>,
    pagerState: PagerState
) {
    val coroutineScope = rememberCoroutineScope()

    ScrollableTabRow(
        backgroundColor = Color.White,
        selectedTabIndex = pagerState.currentPage,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                modifier = Modifier.pagerTabIndicatorOffset(
                    pagerState,
                    tabPositions = tabPositions
                ),
                color = Color(0xFF7C86DF)
            )
        },
        edgePadding = 0.dp
    ) {
        pages.forEachIndexed { index, text ->
            Tab(
                selected = pagerState.currentPage == index,
                onClick = {
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                },
                text = { Text(text = text) },
                selectedContentColor = Color(0xFF7C86DF),
                unselectedContentColor = Color.LightGray
            )
        }
    }
}

@Composable
@OptIn(ExperimentalPagerApi::class)
fun GameHorizontalPager(
    pages: List<String>,
    pagerState: PagerState
) {
    HorizontalPager(
        count = pages.size,
        state = pagerState
    ) { index ->
        when (pages[index]) {
            GameScreenItem.Suggestion.getName() -> {
                SuggestionScreen()
            }

            GameScreenItem.PopularCharts.getName() -> {
                PopularChartsScreen()
            }

            GameScreenItem.Kids.getName() -> {
                KidsScreen()
            }

            GameScreenItem.New.getName() -> {
                NewScreen()
            }

            GameScreenItem.Premium.getName() -> {
                PremiumScreen()
            }

            GameScreenItem.Category.getName() -> {
                CategoryScreen()
            }
        }
    }
}