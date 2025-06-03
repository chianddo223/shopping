package pard.server.com.shopping.item.itemController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pard.server.com.shopping.item.itemRequestDto.CreateItemDto;
import pard.server.com.shopping.item.itemService.ItemService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemController {
    private final ItemService itemService;

    @PostMapping("/food")
    public void createItem(@RequestBody CreateItemDto createItemDto){
        itemService.createItem(createItemDto);
    }


}
