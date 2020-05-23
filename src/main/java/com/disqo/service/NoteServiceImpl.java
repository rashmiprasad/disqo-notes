package com.disqo.service;

import com.disqo.exception.ResourceNotFoundException;
import com.disqo.persistence.model.Note;
import com.disqo.persistence.model.User;
import com.disqo.persistence.repository.NoteRepository;
import com.disqo.persistence.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Created by rashmiprasad on 5/21/20.
 */
@Component
public class NoteServiceImpl implements NoteService{

    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private UserRepository userRepository;


    @Override
    public Note addNote(Long userId, Note note) {
        Set<Note> notes = new HashSet<>();
        User user = new User();

        Optional<User> userOptional = userRepository.findById(userId);
        if (!userOptional.isPresent()) {
            throw new ResourceNotFoundException("User with id " + userId + " does not exist");
        }
        User userFound = userOptional.get();

        //tie User to Note
        note.setUser(userFound);

        Note noteSaved = noteRepository.save(note);
        //tie Note to User
        notes.add(noteSaved);
        user.setNotes(notes);;

        return noteSaved;
    }

    @Override
    public List<Note> getNotesByUserId(Long userId) {
        return noteRepository.findByUserId(userId);

    }

    @Override
    public Optional<Note> getNote(Long noteId) {
        if (!noteRepository.existsById(noteId)) {
            throw new ResourceNotFoundException("Note with id " + noteId + " not found");
        }
        return noteRepository.findById(noteId);
    }

    @Override
    public void updateNote(Note note) {

        Optional<Note>  noteOptional = noteRepository.findById(note.getId());

        if(noteOptional.isPresent()) {
            note.setId(noteOptional.get().getId());
            noteRepository.save(note);
        }
    }

    @Override
    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }
}
