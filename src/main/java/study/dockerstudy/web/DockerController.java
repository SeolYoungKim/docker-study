package study.dockerstudy.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import study.dockerstudy.PostDto.PostDto;
import study.dockerstudy.domain.Post;
import study.dockerstudy.repository.PostRepository;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

@Slf4j
@Controller
@RequiredArgsConstructor
public class DockerController {

    private final PostRepository postRepository;

    @GetMapping("/")
    public String docker(Model model) {
        model.addAttribute("post", new PostDto());
        return "index";
    }

    @PostMapping("/")
    public String docker2(@ModelAttribute PostDto postDto) throws IOException {

//        Post post = Post.builder()
//                .title(postDto.getTitle())
//                .contents(postDto.getContents())
//                .build();
//
//        postRepository.save(post);

        try (FileWriter out = new FileWriter(postDto.getTitle() + "/file.txt")) {

            out.write(postDto.getContents());

        }
            return "redirect:/";
    }
}
