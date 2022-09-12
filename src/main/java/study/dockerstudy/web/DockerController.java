package study.dockerstudy.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DockerController {

    @GetMapping("/")
    public String docker() {
        log.info("THIS IS DOCKER!!!!!!");
        return "Docker is very hard :(";
    }

    @PostMapping("/")
    public String docker2(@RequestBody String body) {
        return body;
    }
}
