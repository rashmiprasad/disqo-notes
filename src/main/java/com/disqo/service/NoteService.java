package com.disqo.service;

import com.disqo.persistence.model.Note;

import java.util.List;
import java.util.Optional;

/**
 * Created by rashmiprasad on 5/21/20.
 */
public interface NoteService {

    public Note addNote(Long userId, Note note);

    public List<Note> getNotesByUserId(Long userId);

    public Optional<Note> getNote(Long noteId);

    public void updateNote(Note note);

    public void deleteNote(Long id);

}
