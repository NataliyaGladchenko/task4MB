package services;

import dao.SongDao;
import entity.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SongServiceImp implements SongService {
    @Autowired
    private SongDao songDao;

    @Transactional
    public void save(Song song) {
        songDao.save(song);
    }

    @Transactional(readOnly = true)
    public List<Song> list() {
        return songDao.list();
    }
}
