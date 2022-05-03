package ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    Column(modifier = Modifier.fillMaxSize()) {
        Text(book.title)
        if (book.thumbNail != null) {
            Image(bitmap = book.thumbNail, contentDescription = "thumbnail")
        }
    }
}