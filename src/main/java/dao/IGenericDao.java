package dao;

import model.entity.BaseEntity;

import java.util.List;

public interface IGenericDao<T extends BaseEntity> {

    <T> T save(final T o);

    void delete(final Object object);

    <T> T get(final Class<T> type, final Long id);

    <T> T merge(final T o);

    <T> List<T> getAll(final Class<T> type);
}
