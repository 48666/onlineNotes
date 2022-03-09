package com.example.onlineNotes.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CATEGORY")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Long categoryId;
    private String title;
    private String about;
    private String url;
    private int generalRating;

    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "category")
    private List<Notes> notes = new ArrayList<>();

    public Category(Long categoryId, String title, String about, String url, int generalRating, List<Notes> notes) {
        this.categoryId = categoryId;
        this.title = title;
        this.about = about;
        this.url = url;
        this.generalRating = generalRating;
        this.notes = notes;
    }

    public Category() {

    }

    public void addNote(Notes n){
        notes.add(n);
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getGeneralRating() {
        return generalRating;
    }

    public void setGeneralRating(int generalRating) {
        this.generalRating = generalRating;
    }

    public List<Notes> getNotes() {
        return notes;
    }

    public void setNotes(List<Notes> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", title='" + title + '\'' +
                ", about='" + about + '\'' +
                ", url='" + url + '\'' +
                ", generalRating=" + generalRating +
                ", notes=" + notes +
                '}';
    }
}
