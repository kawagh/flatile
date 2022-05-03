// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import data.sampleBook
import ui.Document


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}

@Composable
@Preview
fun App() {
    val sampleBooks = List(10) {
        sampleBook
    }

    // for searchForm
    var searchText by remember { mutableStateOf("") }

    MaterialTheme {
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
        ) {
            // searchForm
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                TextField(searchText, { searchText = it }, singleLine = true)
                IconButton(onClick = { /* TODO */ }) {
                    Icon(Icons.Default.Search, "search")
                }
            }

            LazyColumn {
                itemsIndexed(sampleBooks) { index, book ->
                    Row {
                        Text(index.toString())
                        Spacer(modifier = Modifier.size(30.dp))
                        Document(book)
                    }
                }
            }
        }
    }
}
