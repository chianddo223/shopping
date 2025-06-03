package pard.server.com.shopping.user.userController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pard.server.com.shopping.user.user.User;
import pard.server.com.shopping.user.userRequestDto.CreateUserDto;
import pard.server.com.shopping.user.userService.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping("")
    public void createUser(@RequestBody CreateUserDto createUserDto){
        userService.createUser(createUserDto.getUserName(), createUserDto.getEmail());
    }
}
