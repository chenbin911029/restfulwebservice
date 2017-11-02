package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * restful controller
 *
 * @author chenbin at 2017/11/2 15:45
 */
@RestController
public class GreetingController {
    private static final String template = "Hello Restful,%s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "world") String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}
