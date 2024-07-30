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
import kr.co.playstoreapp.ui.data.AppScreenItem
import kr.co.playstoreapp.ui.screen.app.CategoryScreen
import kr.co.playstoreapp.ui.screen.app.KidsScreen
import kr.co.playstoreapp.ui.screen.app.PopularChartsScreen
import kr.co.playstoreapp.ui.screen.app.SuggestionScreen

@OptIn(ExperimentalPagerApi::class)
@Composable
fun AppScreen() {
    val pagerState = rememberPagerState()
    val pages = listOf(
        AppScreenItem.Suggestion.getName(),
        AppScreenItem.PopularCharts.getName(),
        AppScreenItem.Kids.getName(),
        AppScreenItem.Category.getName()
    )

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        AppTabRow(
            pages = pages,
            pagerState = pagerState
        )
        AppHorizontalPager(
            pages = pages,
            pagerState = pagerState
        )
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun AppTabRow(
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
fun AppHorizontalPager(
    pages: List<String>,
    pagerState: PagerState
) {
    HorizontalPager(
        count = pages.size,
        state = pagerState
    ) { index ->
        when (pages[index]) {
            AppScreenItem.Suggestion.getName() -> {
                SuggestionScreen()
            }

            AppScreenItem.PopularCharts.getName() -> {
                PopularChartsScreen()
            }

            AppScreenItem.Kids.getName() -> {
                KidsScreen()
            }

            AppScreenItem.Category.getName() -> {
                CategoryScreen()
            }
        }
    }
}