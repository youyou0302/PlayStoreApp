package kr.co.playstoreapp.ui.data

sealed class BookScreenItem {
    abstract fun getName(): String

    data object EBook : BookScreenItem() {
        override fun getName(): String = "전자책"
    }

    data object AudioBook : BookScreenItem() {
        override fun getName(): String = "오디오북"
    }

    data object ComicBook : BookScreenItem() {
        override fun getName(): String = "만화"
    }

    data object Genre : BookScreenItem() {
        override fun getName(): String = "장르"
    }

    data object MostSold : BookScreenItem() {
        override fun getName(): String = "최다 판매"
    }

    data object NewBook : BookScreenItem() {
        override fun getName(): String = "도서 신작"
    }

    data object PopularFree : BookScreenItem() {
        override fun getName(): String = "인기 무료"
    }
}