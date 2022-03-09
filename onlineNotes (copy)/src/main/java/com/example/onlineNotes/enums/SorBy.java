package com.example.onlineNotes.enums;

public enum SorBy {
    TOPIC(1),MESSAGE(2),CREATEDATE(3);
    public int number;

    SorBy(int number) {
        this.number = number;
    }
}
