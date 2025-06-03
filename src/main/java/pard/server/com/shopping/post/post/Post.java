package pard.server.com.shopping.post.post;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import pard.server.com.shopping.item.item.Item;
import pard.server.com.shopping.user.user.User;

import java.sql.Timestamp;

@Entity
@Getter
@AllArgsConstructor @NoArgsConstructor @Builder
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @CreationTimestamp
    private Timestamp timestamp;

    private int price;

    public static Post of(Item item, User user, int price){
        return Post.builder()
                .item(item)
                .user(user)
                .price(price)
                .build();
    }
}
