package ru.normno.data

import ru.normno.domain.model.Note
import java.time.Instant

class NoteService {
    private var note: Note = Note("", Instant.now(), Instant.now())

    fun updatedText(text: String) {
        note = note.copy(
            text = text,
            updateAt = Instant.now(),
        )
    }

    fun getNote(): Note {
        return note
    }
}