package pard.server.com.shopping.item.itemController;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> createItem(@RequestBody CreateItemDto createItemDto){
        itemService.createItem(createItemDto);
        return new ResponseEntity<>("Item Created!", HttpStatus.CREATED);
    }
}
