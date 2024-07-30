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
        ScreenTabRow(
            pages = pages,
            pagerState = pagerState
        )
        GameHorizontalPager(
            pages = pages,
            pagerState = pagerState
        )
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