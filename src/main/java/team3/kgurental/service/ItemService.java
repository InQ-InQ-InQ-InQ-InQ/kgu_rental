package team3.kgurental.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team3.kgurental.model.entity.Item;
import team3.kgurental.repository.ItemRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public void saveItem(Item item){itemRepository.save(item);}

    public List<Item> allItemView() {return itemRepository.findAll();}

    public void itemDelete(Long Id) {itemRepository.deleteById(Id);}

    //아이템 개수 수정
    public void itemCountModify(Item item, Long Id) {
        Item update = itemRepository.findById(Id)
                .orElseThrow(() -> new RuntimeException());
        update.setItemCount(item.getItemCount());
    }
}
