package kr.co.playstoreapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import kr.co.playstoreapp.ui.component.ScreenTabRow
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
        ScreenTabRow(
            pages = pages,
            pagerState = pagerState
        )
        AppHorizontalPager(
            pages = pages,
            pagerState = pagerState
        )
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