package com.example.onlineNotes.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "NOTES")
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long noteId;
    private String title;
    private int rating ;

    private String message;
    private LocalDate crate_date;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Users person;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


    public Notes() {
    }



    public Notes(Long noteId, String title, int rating, String message, LocalDate crate_date, Users person) {
        this.noteId = noteId;
        this.title = title;
        this.rating = 0;
        this.message = message;
        this.crate_date = crate_date;
        this.person = person;
    }

    public Notes(Long noteId, String title, int rating, String message, LocalDate crate_date, Category category) {
        this.noteId = noteId;
        this.title = title;
        this.rating = rating;
        this.message = message;
        this.crate_date = crate_date;
        this.category = category;
    }

    public Notes(Long noteId, String title, int rating, String message, LocalDate crate_date) {
        this.noteId = noteId;
        this.title = title;
        this.rating = rating;
        this.message = message;
        this.crate_date = crate_date;
    }


    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getCrate_date() {
        return crate_date;
    }

    public void setCrate_date(LocalDate crate_date) {
        this.crate_date = crate_date;
    }

    public Users getPerson() {
        return person;
    }

    public void setPerson(Users person) {
        this.person = person;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "noteId=" + noteId +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                ", message='" + message + '\'' +
                ", crate_date=" + crate_date +
                ", person=" + person +
                ", category=" + category +
                '}';
    }
}
