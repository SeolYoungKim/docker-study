package study.dockerstudy.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/")
    public String docker() {
        return "Hello Docker!!!!!!!!!!!";
    }

    @PostMapping("/")
    public String docker2(@RequestBody String body) {
        return body;
    }
}
