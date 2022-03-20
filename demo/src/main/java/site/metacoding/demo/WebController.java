package site.metacoding.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/web")
    public String web() {
        return "<h1>My First Demo Page</h1>";
    }
}