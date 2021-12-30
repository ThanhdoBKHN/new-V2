package dao.impl;

import dao.INewsDao;
import model.entity.NewsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class NewDaoImpl extends GenericDaoImpl<NewsEntity> implements INewsDao {

    private final SessionFactory sessionFactory;

    public NewDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
        this.sessionFactory = sessionFactory;
    }

//
//    @Override
//    public <T> T save(T o) {
//        return null;
//    }
//
//    @Override
//    public void delete(Object object) {
//
//    }
//
//    @Override
//    public <T> T get(Class<T> type, Long id) {
//        return null;
//    }
//
//    @Override
//    public <T> T merge(T o) {
//        return null;
//    }
//
//    @Override
//    public <T> List<T> getAll(Class<T> type) {
//        return null;
//    }

    @Override
    public List<NewsEntity> getList() {

//        Session session = sessionFactory.getCurrentSession();
//        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
//        CriteriaQuery<NewsEntity> criteriaQuery = criteriaBuilder.createQuery(NewsEntity.class);
//        Root<NewsEntity> root = criteriaQuery.from(NewsEntity.class);
//        criteriaQuery.select(root);
//        Query query = session.createQuery(criteriaQuery);
//        return query.getResultList();
        return getAll(NewsEntity.class);
    }
}
