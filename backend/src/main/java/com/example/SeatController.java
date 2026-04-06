package com.example.smartseat; 

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class SeatController {

    @GetMapping("/api/seats")
    public List<Map<String, String>> getSeats() {
        List<Map<String, String>> seats = new ArrayList<>();
        Map<String, String> seat = new HashMap<>();
        seat.put("id", "301");
        seat.put("status", "empty");
        seats.add(seat);
        return seats;
    }
}
