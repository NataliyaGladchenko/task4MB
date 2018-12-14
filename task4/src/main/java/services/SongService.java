package services;

import entity.Song;

import java.util.List;

public interface SongService {
    void save(Song song);
    List<Song> list();
}
