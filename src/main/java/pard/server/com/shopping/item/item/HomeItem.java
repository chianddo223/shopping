package pard.server.com.shopping.item.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("HOME")
@Getter
@AllArgsConstructor @NoArgsConstructor
public class HomeItem extends Item{
    private String color;

    public HomeItem(String itemName, int itemCount, String color){
        super(itemName, itemCount);
        this.color = color;
    }

    public static HomeItem of(String itemName, int itemCount, String color){
        return new HomeItem(itemName, itemCount, color);
    }
}
