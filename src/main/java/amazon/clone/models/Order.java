package amazon.clone.models;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    private String id;

    private String userId;
    private String dealId;

    public Order(String id, String userId, String dealId) {
        this.id = id;
        this.userId = userId;
        this.dealId = dealId;
    }

    public Order() {

    }
}
