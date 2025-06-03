package pard.server.com.shopping.post.postService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pard.server.com.shopping.item.item.Item;
import pard.server.com.shopping.item.itemRepo.ItemRepo;
import pard.server.com.shopping.post.post.Post;
import pard.server.com.shopping.post.postRepo.PostRepo;
import pard.server.com.shopping.post.postRequestDto.CreatePostDto;
import pard.server.com.shopping.user.user.User;
import pard.server.com.shopping.user.userRepo.UserRepo;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepo postRepo;
    private final ItemRepo itemRepo;
    private final UserRepo userRepo;

    public void createPost(CreatePostDto createPostDto){
        Item item = itemRepo.findByItemId(createPostDto.getItem_id());
        User user = userRepo.findByUserId(createPostDto.getUser_id());

        postRepo.save(Post.of(item, user, createPostDto.getPrice()));
    }
}
