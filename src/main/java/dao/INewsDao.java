package dao;

import model.entity.NewsEntity;

import java.util.List;

public interface INewsDao {
    List<NewsEntity> getList();
}
