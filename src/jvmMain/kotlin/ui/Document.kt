package ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import data.Document

@Composable
fun Document(document: Document) {
    when (document) {
        is Document.Book -> Book(document)
        is Document.LocalFile -> TODO()
        is Document.WebPage -> TODO()
    }
}

@Composable
fun Book(book: Document.Book) {
    Column {
        Text(book.title)
    }
}