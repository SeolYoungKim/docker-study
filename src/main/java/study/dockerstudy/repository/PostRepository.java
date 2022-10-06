package study.dockerstudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.dockerstudy.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
