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
import kr.co.playstoreapp.ui.data.BookScreenItem
import kr.co.playstoreapp.ui.screen.book.AudioBookScreen
import kr.co.playstoreapp.ui.screen.book.ComicBookScreen
import kr.co.playstoreapp.ui.screen.book.EBookScreen
import kr.co.playstoreapp.ui.screen.book.GenreScreen
import kr.co.playstoreapp.ui.screen.book.MostSoldScreen
import kr.co.playstoreapp.ui.screen.book.NewBookScreen
import kr.co.playstoreapp.ui.screen.book.PopularFreeScreen

@OptIn(ExperimentalPagerApi::class)
@Composable
fun BookScreen() {
    val pagerState = rememberPagerState()
    val pages = listOf(
        BookScreenItem.EBook.getName(),
        BookScreenItem.AudioBook.getName(),
        BookScreenItem.ComicBook.getName(),
        BookScreenItem.Genre.getName(),
        BookScreenItem.MostSold.getName(),
        BookScreenItem.NewBook.getName(),
        BookScreenItem.PopularFree.getName()
    )

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ScreenTabRow(
            pages = pages,
            pagerState = pagerState
        )
        BookHorizontalPager(
            pages = pages,
            pagerState = pagerState
        )
    }
}

@Composable
@OptIn(ExperimentalPagerApi::class)
fun BookHorizontalPager(
    pages: List<String>,
    pagerState: PagerState
) {
    HorizontalPager(
        count = pages.size,
        state = pagerState
    ) { index ->
        when (pages[index]) {
            BookScreenItem.EBook.getName() -> {
                EBookScreen()
            }

            BookScreenItem.AudioBook.getName() -> {
                AudioBookScreen()
            }

            BookScreenItem.ComicBook.getName() -> {
                ComicBookScreen()
            }

            BookScreenItem.Genre.getName() -> {
                GenreScreen()
            }

            BookScreenItem.MostSold.getName() -> {
                MostSoldScreen()
            }

            BookScreenItem.NewBook.getName() -> {
                NewBookScreen()
            }

            BookScreenItem.PopularFree.getName() -> {
                PopularFreeScreen()
            }
        }
    }
}