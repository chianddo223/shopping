package pard.server.com.shopping.item.itemRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pard.server.com.shopping.item.item.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Long> {
    Item findByItemId(Long itemId);
}
