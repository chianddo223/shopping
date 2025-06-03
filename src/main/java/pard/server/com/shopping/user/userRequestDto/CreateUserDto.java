package pard.server.com.shopping.user.userRequestDto;

import lombok.*;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor @Builder
public class CreateUserDto {
    private String userName;
    private String email;
}
