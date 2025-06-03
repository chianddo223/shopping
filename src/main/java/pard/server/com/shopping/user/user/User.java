package pard.server.com.shopping.user.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pard.server.com.shopping.post.post.Post;

import java.util.List;

@Entity
@Getter
@AllArgsConstructor @NoArgsConstructor @Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> posts;

    private String userName;
    private String email;

    public static User of(String userName, String email){
        return User.builder()
                .userName(userName)
                .email(email)
                .build();
    }
}
