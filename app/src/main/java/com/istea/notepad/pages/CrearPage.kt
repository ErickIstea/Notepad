package com.istea.notepad.pages

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.istea.notepad.ui.theme.NotepadTheme

@Composable
fun CrearNotaPage(
    modifier: Modifier = Modifier,
    onNuevaNota: () -> Unit
) {
    Button(
        onClick = {
            onNuevaNota()
        }
    ) {
        Text(
            text = "Crear nueva Nota",
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CrearNotaPagePreview() {
    NotepadTheme {
        CrearNotaPage(onNuevaNota = {})
    }
}