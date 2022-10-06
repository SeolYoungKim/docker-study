package study.dockerstudy.PostDto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

    private String title;
    private String contents;

    @Builder
    public PostDto(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
}
