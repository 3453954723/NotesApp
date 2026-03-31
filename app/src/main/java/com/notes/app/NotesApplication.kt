package com.notes.app

import android.app.Application
import com.notes.app.data.local.NotesDatabase
import com.notes.app.data.repository.NoteRepositoryImpl
import com.notes.app.domain.repository.NoteRepository

class NotesApplication : Application() {
    val database by lazy { NotesDatabase.getDatabase(this) }
    val repository by lazy { NoteRepositoryImpl(database.noteDao()) }
}
