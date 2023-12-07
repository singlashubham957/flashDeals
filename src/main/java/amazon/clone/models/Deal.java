package amazon.clone.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "deals")
public class Deal {
    @Id
    private String id;

    private String itemDescription;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int noOfItems;

    public Deal() {}

    public Deal(String id, String itemDescription, LocalDateTime startTime, LocalDateTime endTime, int noOfItems ) {
        this.id = id;
        this.itemDescription = itemDescription;
        this.startTime = startTime;
        this.endTime = endTime;
        this.noOfItems = noOfItems;
    }

    public String id() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String itemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public LocalDateTime startTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime endTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int noOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }
}
