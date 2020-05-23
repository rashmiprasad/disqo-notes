package com.disqo.persistence.repository;

import com.disqo.persistence.model.Note;
import com.disqo.persistence.model.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rashmiprasad on 5/21/20.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

}
