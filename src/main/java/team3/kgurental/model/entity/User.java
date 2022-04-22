package team3.kgurental.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class User {

    @Id@GeneratedValue

    private Long userId;

    private  String userPw;

    private  String userName;

    private  Long userPhoneNumber;



}
