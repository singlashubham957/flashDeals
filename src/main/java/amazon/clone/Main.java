package amazon.clone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Main {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public static void main(String[] args) {


        System.out.println("Hello world!");
        SpringApplication.run(Main.class, args);
    }

    // users: userId, email, createdAt
    // Deals: Id, ItemDesc, startTime, endTIme, noOfItems
    // Orders: id, userId, dealId

}