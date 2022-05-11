package team3.kgurental.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team3.kgurental.model.entity.ItemManager;
import team3.kgurental.repository.ItemManagerRepository;
import team3.kgurental.repository.ItemRepository;
import team3.kgurental.repository.UserRepository;

import java.math.BigInteger;
import java.time.LocalDate;


@Service
@Transactional
@RequiredArgsConstructor
public class ItemManagerService {

    private final ItemManagerRepository itemManagerRepositoryRepository;

    private final UserRepository userRepository;

    private final ItemRepository itemRepository;

    //대여
    /*
    public long ItemManager(long userId, long itemId, BigInteger itemManagerId,
                            LocalDate rentalDate, LocalDate returnDate);
    */


}
