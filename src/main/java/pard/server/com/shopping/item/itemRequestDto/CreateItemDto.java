package pard.server.com.shopping.item.itemRequestDto;

import lombok.*;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor @Builder
public class CreateItemDto {
    private String itemName;
    private int itemCount;

    private String category;

    private Integer weight;
    private String color;
}
