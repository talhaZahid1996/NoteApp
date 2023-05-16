package com.noteapp.app.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.noteapp.app.ui.theme.BabyBlue
import com.noteapp.app.ui.theme.LightGreen
import com.noteapp.app.ui.theme.RedOrange
import com.noteapp.app.ui.theme.RedPink
import com.noteapp.app.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(
            RedOrange,
            LightGreen,
            Violet,
            BabyBlue,
            RedPink
        )
    }
}

class InvalidNoteException(message: String) : Exception(message)
