package model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name = "USER")
@Entity
public class UserEntity extends BaseEntity{
    private String username;

    private String password;

    private String fullName;

    private String address;

    private String email;
}
