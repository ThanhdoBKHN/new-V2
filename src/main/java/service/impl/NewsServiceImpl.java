package service.impl;

import dao.INewsDao;
import model.entity.NewsEntity;
import model.response.NewsResponse;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import service.INewsService;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsServiceImpl implements INewsService {

    private final INewsDao iNewsDao;
    private final ModelMapper modelMapper;

    public NewsServiceImpl(INewsDao iNewsDao, ModelMapper modelMapper) {
        this.iNewsDao = iNewsDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<NewsResponse> getList() {
        List<NewsEntity> newsEntities = iNewsDao.getList();
        List<NewsResponse> responses = new ArrayList<>();
        for (NewsEntity entity: newsEntities){
            responses.add(modelMapper.map(entity, NewsResponse.class));
        }

        return responses;
    }
}
