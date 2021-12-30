package model.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NewsResquest {

    private int id;

    private String title;

    private String content;

    private String avatar;

    private String author;

    private int categoryId;

    private String originalResource;

    private int numberAccess;

    private int censor;
}
