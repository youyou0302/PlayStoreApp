package kr.co.playstoreapp.ui.data

sealed class GameScreenItem {
    abstract fun getName(): String

    data object Suggestion : GameScreenItem() {
        override fun getName(): String = "추천"
    }

    data object PopularCharts : GameScreenItem() {
        override fun getName(): String = "인기 차트"
    }

    data object Kids : GameScreenItem() {
        override fun getName(): String = "키즈"
    }

    data object New : GameScreenItem() {
        override fun getName(): String = "신규"
    }

    data object Premium : GameScreenItem() {
        override fun getName(): String = "프리미엄"
    }

    data object Category : GameScreenItem() {
        override fun getName(): String = "카테고리"
    }
}