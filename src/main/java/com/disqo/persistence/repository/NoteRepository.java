package com.disqo.persistence.repository;

import com.disqo.persistence.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * Created by rashmiprasad on 5/21/20.
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long>, JpaSpecificationExecutor<Note> {

    List<Note> findByUserId(Long userId);

}
