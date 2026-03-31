package com.notes.app.data.repository

import com.notes.app.data.local.NoteDao
import com.notes.app.domain.model.Note
import com.notes.app.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val noteDao: NoteDao
) : NoteRepository {

    override fun getAllNotes(): Flow<List<Note>> = noteDao.getAllNotes()

    override fun searchNotes(query: String): Flow<List<Note>> = noteDao.searchNotes(query)

    override suspend fun getNoteById(id: Long): Note? = noteDao.getNoteById(id)

    override suspend fun insertNote(note: Note): Long = noteDao.insertNote(note)

    override suspend fun updateNote(note: Note) = noteDao.updateNote(note)

    override suspend fun deleteNote(note: Note) = noteDao.deleteNote(note)

    override suspend fun deleteNoteById(id: Long) = noteDao.deleteNoteById(id)
}
