package team3.kgurental.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class User {

    @Id@GeneratedValue
    @Column(name="user_id")
    private Long userId;

    private  String userPw;

    private  String userName;

    private  Long userPhoneNumber;

    @OneToMany(mappedBy="user")
    private List<ItemManager> itemManagers = new ArrayList<>();




}