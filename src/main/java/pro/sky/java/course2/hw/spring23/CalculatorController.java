package pro.sky.java.course2.hw.spring23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String hello () {
        return "<h1>Добро пожаловать в калькулятор!</h1>";
    }

    @GetMapping("/plus")
    public String plus (@RequestParam(required = false) Integer num1,
                        @RequestParam (required = false) Integer num2) {

        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "<h1>Параметр не передан!</h1>"; }
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus (@RequestParam (required = false) Integer num1,
                         @RequestParam (required = false) Integer num2) {

        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "<b>Параметр не передан!</b>"; }
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply (@RequestParam (required = false) Integer num1,
                            @RequestParam (required = false) Integer num2) {

        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "<b>Параметр не передан!</b>"; }
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide (@RequestParam (required = false) Integer num1,
                          @RequestParam (required = false) Integer num2) {

        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "<b>Параметр не передан!</b>";
        }
        if (num2 == 0) {
            return "На ноль делить нельзя";
        }
        return num1 + " * " + num2 + " = " + calculatorService.divide(num1, num2);
    }

}
