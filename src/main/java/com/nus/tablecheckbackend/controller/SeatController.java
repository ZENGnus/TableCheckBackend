package com.nus.tablecheckbackend.controller;


import com.nus.tablecheckbackend.entity.Seat;
import com.nus.tablecheckbackend.service.impl.SeatServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SeatController {
    @Autowired
    SeatServiceImpl seatService;

    @GetMapping("/seats")
    public List<Seat> getSeats(){
        return seatService.getAllSeats();
    }

    @GetMapping("/seats/{id}/occupied")
    public boolean isOccupied(@PathVariable Long id){
        return seatService.checkOccupied(id);
    }

    @PostMapping("/reserveSeat")
    public ResponseEntity<String> reserveSeat(@RequestBody Seat seat){
        seatService.reserveSeat(seat);
        return ResponseEntity.ok("Seat reserved successfully");
    }

}
