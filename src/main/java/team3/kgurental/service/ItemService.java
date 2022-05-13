package team3.kgurental.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team3.kgurental.model.entity.Item;
import team3.kgurental.repository.ItemRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    //아이템 등록
    public void saveItem(Item item){itemRepository.save(item);}
    //아이템 리스트 불러오기
    public List<Item> allItemView() {return itemRepository.findAll();}
    //아이템 삭제
    public void itemDelete(Long Id) {itemRepository.deleteById(Id);}
    //아이템 개수 수정
//    public void itemCountModify(Item item, Long Id) {
//        Item update = itemRepository.findItemById(Id);
//        update.setItemCount(item.getItemCount());
//        itemRepository.save(update);
//    }
}
