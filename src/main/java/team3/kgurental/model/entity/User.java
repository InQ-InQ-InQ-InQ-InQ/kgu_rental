package team3.kgurental.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class User {

    @Id

    private String userId;

    private  String password;

    private  String name;

    private  String userPhoneNumber;

    @OneToMany(mappedBy="user")
    private List<ItemManager> itemManagers = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Reservation> reservations=new ArrayList<>();



}