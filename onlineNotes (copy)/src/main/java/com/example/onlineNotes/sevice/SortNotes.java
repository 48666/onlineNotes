package com.example.onlineNotes.sevice;

import com.example.onlineNotes.entities.Notes;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortNotes {
    private List<Notes> notes;

    public SortNotes(List<Notes> notes) {
        this.notes = notes;
    }

    public List<Notes> sortByTopic() {
        return notes.stream().sorted(Comparator.comparing(Notes::getTitle)).collect(Collectors.toList());
    }
    public List<Notes> sortByMessage() {
            return notes.stream().sorted(Comparator.comparing(Notes::getMessage)).collect(Collectors.toList());
    }

    public List<Notes> sortByCreateDate() {
            return notes.stream().sorted(Comparator.comparing(Notes::getCrate_date)).collect(Collectors.toList());

    }
}