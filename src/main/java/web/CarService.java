package web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    // [1] 학습요청
    public boolean 학습요청(){
        List<CarEntity> entityList = carRepository.findAll();
        List<CarDto> dtoList = entityList.stream()
                .map( CarEntity :: toDto ).toList();
        System.out.println("dtoList ="+ dtoList.size());

        return true;
    }
}