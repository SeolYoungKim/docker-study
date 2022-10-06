package study.dockerstudy.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import study.dockerstudy.PostDto.PostDto;
import study.dockerstudy.domain.Post;
import study.dockerstudy.repository.PostRepository;

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
    public String docker2(@ModelAttribute PostDto postDto) {

        Post post = Post.builder()
                .title(postDto.getTitle())
                .contents(postDto.getContents())
                .build();

        postRepository.save(post);

        return "redirect:/post/" + post.getId();
    }

    @GetMapping("/post/{id}")
    public String docker3(@PathVariable Long id, Model model) {
        model.addAttribute("post", postRepository.findById(id).get());
        return "post";
    }
}
