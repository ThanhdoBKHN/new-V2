package dao;

import model.entity.NewsEntity;

import java.util.List;

public interface INewsDao extends IGenericDao<NewsEntity>{
    List<NewsEntity> getList();
}
