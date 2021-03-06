package model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name = "CATEGORY")
@Entity
public class CategoryEntity extends BaseEntity{
//    private int id;

    private String name;

    @Column(nullable = true)
    private int parentsCategoryId;
}
