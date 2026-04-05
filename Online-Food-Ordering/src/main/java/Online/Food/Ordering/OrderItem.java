package Online.Food.Ordering;


import Online.Food.Ordering.model.Food;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Food food;

    private int quantity;
    private long totalprice;

    private List<String> Ingredients;








}
