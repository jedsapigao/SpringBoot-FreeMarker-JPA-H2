package com.example.demo2.repository;

import com.example.demo2.domain.Note;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NoteRepository extends PagingAndSortingRepository<Note, Long>,
        ListCrudRepository<Note, Long>,
        JpaSpecificationExecutor<Note> {
}
