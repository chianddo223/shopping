package pard.server.com.shopping.post.postRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pard.server.com.shopping.post.post.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Long> {
}
