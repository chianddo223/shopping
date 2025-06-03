package pard.server.com.shopping.item.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("FOOD")
@Getter
@AllArgsConstructor @NoArgsConstructor
public class FoodItem extends Item{
    private int weight;

    public FoodItem(String itemName, int itemCount, int weight){
        super(itemName, itemCount);
        this.weight = weight;
    }

    public static FoodItem of(String itemName, int itemCount, int weight){
        return new FoodItem(itemName, itemCount, weight);
    }
}
