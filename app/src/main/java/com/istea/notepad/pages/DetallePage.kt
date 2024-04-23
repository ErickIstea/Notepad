package com.istea.notepad.pages

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.istea.notepad.ui.theme.NotepadTheme

@Composable
fun DetallePage(
    modifier: Modifier = Modifier,
    nota : String
) {
    Text(
        text = nota,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun DetallePagePreview() {
    NotepadTheme {
        DetallePage(nota = "Esta es una prueba")
    }
}