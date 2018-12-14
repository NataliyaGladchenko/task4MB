package dao;

import entity.Song;

import java.util.List;

public interface SongDao {
    void save(Song song);
    List<Song> list();
}
