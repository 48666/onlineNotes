package com.example.onlineNotes.repository;

import com.example.onlineNotes.entities.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NotesRepository extends JpaRepository<Notes,Long> {

}
