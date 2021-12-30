package dao;

import model.entity.CategoryEntity;

import java.util.List;

public interface ICategoryDao extends IGenericDao<CategoryEntity>{
    List<CategoryEntity> getList();
}
