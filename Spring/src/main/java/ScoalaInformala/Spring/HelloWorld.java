package ScoalaInformala.Spring;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;


@RestController
@RequestMapping("/")
public class HelloWorld {

    @GetMapping("/")
    public String sayHi() {
        return "Hello world";
    }

    @RequestMapping(value="/date" , method=RequestMethod.GET)
    public @ResponseBody LocalDateTime myLocalDate() {
        return LocalDateTime.now();
    }
}
