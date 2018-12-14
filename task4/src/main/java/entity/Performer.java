package entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "performers", uniqueConstraints = {@UniqueConstraint(columnNames = "performer_id")})
public class Performer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "performer_id")
    private int performerId;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "song_id")
    private int songId;

    public int getPerformerId() {
        return performerId;
    }

    public void setPerformerId(int performerId) {
        this.performerId = performerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public Performer() {
    }

    public Performer(int performerId, String name, String surname, Date dateOfBirth, int songId) {
        this.performerId = performerId;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.songId = songId;
    }

    @Override
    public String toString() {
        return "Performer{" +
                "performerId=" + performerId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", songId=" + songId +
                '}';
    }
}
