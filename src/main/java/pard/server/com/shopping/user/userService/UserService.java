package pard.server.com.shopping.user.userService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pard.server.com.shopping.user.user.User;
import pard.server.com.shopping.user.userRepo.UserRepo;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public void createUser(String userName, String email){
        userRepo.save(User.of(userName, email));
    }


}
