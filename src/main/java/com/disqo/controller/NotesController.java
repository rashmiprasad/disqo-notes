package com.disqo.controller;

import com.disqo.persistence.model.Note;
import com.disqo.service.NoteService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;


@RestController
public class NotesController {

    @Autowired
    private NoteService noteService;

    @RequestMapping(value = "/{userId}/note", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Note createNewNote(@PathVariable(value = "userId") Long userId, @RequestBody Note note)
            throws Exception {
        return noteService.addNote(userId, note);
    }

    @RequestMapping(value = "/note/{noteId}", method = RequestMethod.GET)
    public Optional<Note> getNoteById(@PathVariable(value = "noteId") Long noteId) {
        return noteService.getNote(noteId);
    }

    @RequestMapping(value = "/user/{userId}/note", method = RequestMethod.GET)
    public List<Note> getNotesByUserId(@PathVariable(value = "userId") Long userId) {
        return noteService.getNotesByUserId(userId);
    }

    @RequestMapping(value = "/note/{noteId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateNote(@PathVariable(value = "noteId") Long noteId, @RequestBody Note note)
            throws Exception {
         note.setId(noteId);
         noteService.updateNote(note);
    }

    @RequestMapping(value = "/note/{noteId}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateNote(@PathVariable(value = "noteId") Long noteId)
            throws Exception {
        noteService.deleteNote(noteId);
    }


}
