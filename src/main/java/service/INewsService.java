package service;

import model.response.NewsResponse;

import java.util.List;

public interface INewsService {
    List<NewsResponse> getList();
}
