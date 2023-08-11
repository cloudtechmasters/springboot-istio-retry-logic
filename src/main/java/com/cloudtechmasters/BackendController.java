package com.cloudtechmasters;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {
    // ...

    @GetMapping("/data")
    public ResponseEntity<String> getData() {
        // Simulate transient failure
        if (Math.random() < 0.2) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error");
        }
        // Return normal response
        return ResponseEntity.ok("Data from backend");
    }
}
