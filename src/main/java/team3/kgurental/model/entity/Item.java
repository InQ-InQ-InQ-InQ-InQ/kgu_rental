package team3.kgurental.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Item {

    @Id @GeneratedValue
    private Long itemId;
    private String itemName;
    private Long itemCount;
}
