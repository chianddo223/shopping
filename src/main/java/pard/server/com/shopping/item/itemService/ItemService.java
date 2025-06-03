package pard.server.com.shopping.item.itemService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pard.server.com.shopping.item.item.FoodItem;
import pard.server.com.shopping.item.item.HomeItem;
import pard.server.com.shopping.item.itemRepo.ItemRepo;
import pard.server.com.shopping.item.itemRequestDto.CreateItemDto;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepo itemRepo;

    public void createItem(CreateItemDto createItemDto){
        if(createItemDto.getCategory().equalsIgnoreCase("FOOD")){
            itemRepo.save(FoodItem.of(createItemDto.getItemName(), createItemDto.getItemCount(), createItemDto.getWeight()));
        }else if(createItemDto.getCategory().equalsIgnoreCase("HOME")){
            itemRepo.save(HomeItem.of(createItemDto.getItemName(), createItemDto.getItemCount(), createItemDto.getColor()));
        }
    }
}
