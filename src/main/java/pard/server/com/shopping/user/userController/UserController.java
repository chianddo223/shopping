package pard.server.com.shopping.user.userController;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> createUser(@RequestBody CreateUserDto createUserDto){
        userService.createUser(createUserDto.getUserName(), createUserDto.getEmail());
        return new ResponseEntity<>("User Created!", HttpStatus.CREATED);
    }
}
