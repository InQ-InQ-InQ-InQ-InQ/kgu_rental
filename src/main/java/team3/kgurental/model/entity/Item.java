package team3.kgurental.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Item {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_id")
    private Long Id;
    private String itemName;
    private Long itemCount;


    @OneToMany(mappedBy = "item")
    private List<ItemManager> itemManager=new ArrayList<>();

    @OneToMany(mappedBy = "item")
    private List<Reservation> reservation=new ArrayList<>();




}
