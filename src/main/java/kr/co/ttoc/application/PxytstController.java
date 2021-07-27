package kr.co.ttoc.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PxytstController {
    @GetMapping("/api/pxytst")
    public String test() {
        return  "dev full";
    }
}
