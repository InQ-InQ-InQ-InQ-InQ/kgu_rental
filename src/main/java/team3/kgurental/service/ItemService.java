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

    @Transactional
    public void itemModify(Item item,Long id){
        Item update = itemRepository.findItemById(id);
        update.setItemName(item.getItemName());
        update.setItemCount(item.getItemCount());
        update.setTerm(item.getTerm());
        itemRepository.save(update);
    }
}
