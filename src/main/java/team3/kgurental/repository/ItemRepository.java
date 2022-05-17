package team3.kgurental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team3.kgurental.model.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
