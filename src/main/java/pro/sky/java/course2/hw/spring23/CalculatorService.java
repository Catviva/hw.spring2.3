package pro.sky.java.course2.hw.spring23;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public int minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public int multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public int divide(Integer num1, Integer num2) {
        return num1/num2;
    }
}
