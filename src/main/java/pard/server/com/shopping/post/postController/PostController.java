package pard.server.com.shopping.post.postController;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pard.server.com.shopping.post.postRequestDto.CreatePostDto;
import pard.server.com.shopping.post.postService.PostService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    @PostMapping("")
    public ResponseEntity<String> createPost(@RequestBody CreatePostDto createPostDto){
        postService.createPost(createPostDto);
        return new ResponseEntity<>("Post Created!", HttpStatus.CREATED);
    }
}
