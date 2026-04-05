package Online.Food.Ordering;


import Online.Food.Ordering.model.Address;
import Online.Food.Ordering.model.Restaurant;
import Online.Food.Ordering.model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private User Customer;

    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant;

    private Long TotalAmount;

    private String OrderStatus;

    private Date CreatedAt;

    @ManyToOne
    private Address DeliveryAddress;

    @OneToMany
    private List<OrderItem> items;

    private int totalItem;

    private int totalprice;

}
