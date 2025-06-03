package pard.server.com.shopping.post.postRequestDto;

import lombok.*;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor @Builder
public class CreatePostDto {
    private Long user_id;
    private Long item_id;
    private int price;
}
