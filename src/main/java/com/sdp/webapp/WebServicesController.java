package com.sdp.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServicesController {

    @GetMapping("/items")
    public String getItems(){
        return "List of items!";
    }

    @GetMapping("/deposits")
    public String getDeposits(){
        return "List of deposits!";
    }

    @GetMapping("/deliveries")
    public String getDeliveries(){
        return "List of deliveries!";
    }
}
