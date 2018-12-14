package dao;

import entity.Song;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SongDaoImp implements SongDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Song song) {
        sessionFactory.getCurrentSession().save(song);
    }

    @Override
    public List<Song> list() {
        Query query = sessionFactory.getCurrentSession().createQuery("from Song ");
        return query.list();
    }
}
