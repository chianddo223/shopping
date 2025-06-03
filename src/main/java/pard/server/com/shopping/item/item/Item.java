package pard.server.com.shopping.item.item;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pard.server.com.shopping.post.post.Post;

@Entity
@Getter
@AllArgsConstructor @NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "dtype")
public abstract class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @OneToOne(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
    private Post post;

    private String itemName;
    private int itemCount;

    public Item(String itemName, int itemCount){
        this.itemName = itemName;
        this.itemCount = itemCount;
    }

}
