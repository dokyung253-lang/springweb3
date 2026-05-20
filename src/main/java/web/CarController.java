package web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    // [1] 학습 요청
    @GetMapping("admin")
    public ResponseEntity<?> 학습요청(){
        return ResponseEntity.ok( carService.학습요청() );
    }
}
