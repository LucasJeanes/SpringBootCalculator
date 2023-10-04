package ie.atu.springbootcalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public Object details(@RequestParam int num1, int num2, String operation) {

        return switch (operation) {
            case "add" -> new CalculatorData(num1 + num2, operation);
            case "subtract" -> new CalculatorData(num1 - num2, operation);
            case "multiply" -> new CalculatorData(num1 * num2, operation);
            case "divide" -> new CalculatorData(num1 / num2, operation);
            default -> ("Not a valid operation");
        };
    }
}