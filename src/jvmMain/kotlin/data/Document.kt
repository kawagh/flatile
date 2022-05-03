package data

import androidx.compose.ui.graphics.ImageBitmap

sealed class Document {
    data class Book(val title: String, val thumbNail: ImageBitmap? = null) : Document()
    data class WebPage(val title: String, val url: String) : Document()
    data class LocalFile(val title: String, val path: String) : Document()
}

val sampleBook = Document.Book(title = "this is book title")