package com.example.onlineNotes.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = ("PERSON"))
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long personId;

    @Column(nullable = false,unique = true,length = 70)
    String email;

    private String imie;

    private String nazwisko;

    private int age;

    private String password;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    private List<Notes> notes = new ArrayList<>();


    public Users() {
    }

    public Users(Long personId, String imie, String nazwisko, int age, String password, String email, List<Notes> notes) {
        this.personId = personId;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.age = age;
        this.password = password;

        this.email = email;

        this.notes = notes;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Notes> getNotes() {
        return notes;
    }

    public void setNotes(List<Notes> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Users{" +
                "personId=" + personId +
                ", email='" + email + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", notes=" + notes +
                '}';
    }
}
