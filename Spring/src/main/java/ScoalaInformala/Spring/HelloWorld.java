package ScoalaInformala.Spring;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


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
