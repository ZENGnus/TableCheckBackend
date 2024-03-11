package com.nus.tablecheckbackend.service.impl;

import com.nus.tablecheckbackend.exception.SeatServiceException;
import com.nus.tablecheckbackend.entity.Seat;
import com.nus.tablecheckbackend.repository.SeatRepository;
import com.nus.tablecheckbackend.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeatServiceImpl implements SeatService {
    @Autowired
    SeatRepository seatRepository;
    public List<Seat> getAllSeats(){
        try {
            return seatRepository.findAll();
        } catch (Exception e) {
            throw new SeatServiceException("Fail to retrieve all seats",e);
        }
    }

    public void reserveSeat(Seat seat){
        seat.setOccupied(true);
        seatRepository.save(seat);
    }

    public boolean checkOccupied(Long id){
        Optional<Seat> seat = seatRepository.findById(id);
        return seat.map(Seat::isOccupied).orElse(false);
    }
}
