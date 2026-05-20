package web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.http.WebSocket;
import java.util.Objects;

@RestController
@RequestMapping("/api/car")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    // [1] 학습 요청
    @GetMapping("/admin")
    public ResponseEntity<?> 학습요청(){
        return ResponseEntity.ok( carService.학습요청() );
    }

    // [2] 예측요청
    @PostMapping("/user")
    public ResponseEntity<?> 예측요청(@RequestBody CarDto carDto){
        return ResponseEntity.ok( carService.예측요청( carDto ) );
    }
}
