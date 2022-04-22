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
    private Long term;

    @ManyToMany
    @JoinTable(name = "item_user",
    joinColumns = @JoinColumn(name="item_id"),
    inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<Item> item = new ArrayList<>();

}
