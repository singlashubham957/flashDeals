package amazon.clone.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String userId;
    private String emailId;

    public User(String userId, String emailId) {
        this.userId = userId;
        this.emailId = emailId;
    }

    public User() {

    }
}
