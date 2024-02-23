package com.nus.tablecheckbackend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "seats")
public class Seat {
    private String seatName;

    @Id
    private Long id;

    private boolean isOccupied;
}
