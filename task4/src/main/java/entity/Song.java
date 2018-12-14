package entity;

import javax.persistence.*;

@Entity
@Table(name = "songs", uniqueConstraints = {@UniqueConstraint(columnNames = "song_id")})
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "song_id")
    private int songId;
    @Column(name = "song_name")
    private String songName;
    @Column(name = "duration")
    private String duration;

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Song(int songId, String songName, String duration) {
        this.songId = songId;
        this.songName = songName;
        this.duration = duration;
    }

    public Song() {
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", songName='" + songName + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }


}
