package pro.sky.homework_2_4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String hello() {
        return calcService.hello();
    }

    @GetMapping(path = "/calculator")
    public String prompt() {
        return calcService.prompt();
    }

    @GetMapping(path = "/calculator/plus")
    public String add(@RequestParam("num1") String op1Name,
                      @RequestParam("num2") String op2Name) {
        return calcService.add(op1Name, op2Name);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") String op1Name,
                        @RequestParam("num2") String op2Name) {
        return calcService.minus(op1Name, op2Name);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") String op1Name,
                           @RequestParam("num2") String op2Name) {
        return calcService.multiply(op1Name, op2Name);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") String op1Name,
                         @RequestParam("num2") String op2Name) {
        return calcService.divide(op1Name, op2Name);
    }

}