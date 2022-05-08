package team3.kgurental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team3.kgurental.model.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findItemById(Long id);
}
