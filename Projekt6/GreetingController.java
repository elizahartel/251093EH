package pl.hartel.firstapp;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GreetingController {

    private static final int age = 21;
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private CountService countService;

    @Autowired // Wstrzykiwanie zależności przez konstruktor
    public GreetingController(CountService countService) {
        this.countService = countService;
    }

    @RequestMapping(path = "/bye", method = GET) // odpowiada endpoin'tom http
    public Greeting bye(@RequestParam(value = "name", defaultValue = "World") String
                                name) {
        return new Greeting(counter.incrementAndGet(), String.format(template,
                countService.count(name)));
    }

    // Zad 2 , 3
    @RequestMapping(path="/getAge", method = GET)
    public int getAge()
    {
        return GreetingController.age;
    }

    // Zad 6
    @RequestMapping(path = "/checkText", method = GET)
    public boolean checkText(@RequestParam("text") String text) {
        if (this.template.contains(text)) {
            return true;
        } else {
            return false;
        }
    }

    // Zad 5
    @RequestMapping(path = "/checkName", method = GET)
    public String checkName(@RequestParam("name") String name) {
        if (name.charAt(name.length() - 1) == 'a') {
            return "Kobieta";
        } else {
            return "Mężczyzna";
        }
    }
    // Zad 4
    @RequestMapping(path="/getIdNameAge", method = GET)
    public Person getIdNameAge(@RequestParam("id") long id, @RequestParam("name") String name, @RequestParam("age") int age)
    {
        return new Person(id, name, age);
    }
}
