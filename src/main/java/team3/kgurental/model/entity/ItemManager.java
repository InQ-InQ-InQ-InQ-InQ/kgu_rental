package team3.kgurental.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter @Setter
public class ItemManager {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name="item_id")
    private Item item;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Date rentalDate;
    private Date returnDate;



}
