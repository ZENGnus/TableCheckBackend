package com.nus.tablecheckbackend.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;


@Data

public class Seat {
    private String seatName;

    private Long id;

    private boolean isOccupied;
}
