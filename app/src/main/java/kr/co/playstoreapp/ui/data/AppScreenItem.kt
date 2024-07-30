package kr.co.playstoreapp.ui.data

sealed class AppScreenItem {
    abstract fun getName(): String

    data object Suggestion : AppScreenItem() {
        override fun getName(): String = "추천"
    }

    data object PopularCharts : AppScreenItem() {
        override fun getName(): String = "인기 차트"
    }

    data object Kids : AppScreenItem() {
        override fun getName(): String = "키즈"
    }

    data object Category : AppScreenItem() {
        override fun getName(): String = "카테고리"
    }
}