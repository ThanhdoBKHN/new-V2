package dao.impl;

import dao.IGenericDao;
import model.entity.BaseEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class GenericDaoImpl<T extends BaseEntity> implements IGenericDao<T> {

    private final SessionFactory sessionFactory;

    public GenericDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public <T> T save(T o) {
        return (T) sessionFactory.getCurrentSession().save(o);
    }

    @Override
    public void delete(Object object) {
        sessionFactory.getCurrentSession().delete(object);
    }

    @Override
    public <T> T get(Class<T> type, Long id) {
        return (T) sessionFactory.getCurrentSession().get(type, id);
    }

    @Override
    public <T> T merge(T o) {
        return (T) sessionFactory.getCurrentSession().merge(o);
    }

    public <T> void saveOrUpdate(final T o){
        sessionFactory.getCurrentSession().saveOrUpdate(o);
    }

    @Override
    public <T> List<T> getAll(Class<T> type) {
        final Session session = sessionFactory.getCurrentSession();
        final Criteria criteria = session.createCriteria(type);
        return criteria.list();
    }
}
