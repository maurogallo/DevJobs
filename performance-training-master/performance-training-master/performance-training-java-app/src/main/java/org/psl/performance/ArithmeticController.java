package org.psl.performance;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.psl.performance.services.*;

@RestController
public class ArithmeticController {

    private final AtomicLong counter = new AtomicLong();

    /*
    curl -X POST -H 'Content-type: application/json' 'localhost:8080/add' -d'{"a": 10, "b": 5}'
     */
    @PostMapping("/add")
    public ArithmeticResult add(@RequestBody ArithmeticInput input) {
        return new ArithmeticResult(counter.incrementAndGet(),
                                    new AddService().add(input.getA(), input.getB()));
    }

    /*
    curl -X POST -H 'Content-type: application/json' 'localhost:8080/divide' -d'{"a": 10, "b": 5}'
     */
    @PostMapping("/divide")
    public ArithmeticResult divide(@RequestBody ArithmeticInput input) {
        return new ArithmeticResult(counter.incrementAndGet(),
                new DivideService().divide(input.getA(), input.getB()));
    }

    /*
    curl -X POST -H 'Content-type: application/json' 'localhost:8080/multiply' -d'{"a": 10, "b": 5}'
     */
    @PostMapping("/multiply")
    public ArithmeticResult multiply(@RequestBody ArithmeticInput input) {
        return new ArithmeticResult(counter.incrementAndGet(),
                new MultiplyService().multiply(input.getA(), input.getB()));
    }

    /*
    curl -X POST -H 'Content-type: application/json' 'localhost:8080/subtract' -d'{"a": 10, "b": 5}'
     */
    @PostMapping("/subtract")
    public ArithmeticResult subtract(@RequestBody ArithmeticInput input) {
        return new ArithmeticResult(counter.incrementAndGet(),
                new SubtractService().subtract(input.getA(), input.getB()));
    }
}
