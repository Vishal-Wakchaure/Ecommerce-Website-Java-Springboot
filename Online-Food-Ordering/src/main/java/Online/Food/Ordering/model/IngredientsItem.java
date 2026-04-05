package Online.Food.Ordering.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IngredientsItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @ManyToOne
    private IngredientCategory category;

    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant;

    private boolean Instock = true;

}