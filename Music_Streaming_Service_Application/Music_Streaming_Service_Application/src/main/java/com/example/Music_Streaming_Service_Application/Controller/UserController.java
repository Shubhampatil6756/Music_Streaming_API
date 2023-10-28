package com.example.Music_Streaming_Service_Application.Controller;

import com.example.Music_Streaming_Service_Application.Model.Dto.SignInInput;
import com.example.Music_Streaming_Service_Application.Model.Dto.SignUpOutput;
import com.example.Music_Streaming_Service_Application.Model.Music;
import com.example.Music_Streaming_Service_Application.Model.User;
import com.example.Music_Streaming_Service_Application.Service.TokenService;
import com.example.Music_Streaming_Service_Application.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    TokenService tokenService;

    @PostMapping("User/Signup")
    public SignUpOutput signUp(@RequestBody User user) throws NoSuchAlgorithmException {
        return userService.signUp(user);
    }

    @PostMapping("User/SignIn")
    public String signIn(@RequestBody @Valid SignInInput signInInput) throws NoSuchAlgorithmException {
        return userService.signIn(signInInput);
    }

    @GetMapping("PlayList/{id}")
    public List<Music> getPlayList(@PathVariable Long id)throws NoSuchAlgorithmException{
        return userService.getPlayList(id);
    }
    @DeleteMapping("Music/{ID}/{musicId}")
    public  String deleteMusic (@PathVariable Long id , Long musicId)throws NoSuchAlgorithmException{
        return userService.deleteMusic(id ,musicId);
    }
    @DeleteMapping("user/SignOut")
    public  String signOut (@PathVariable String email, @PathVariable String token){
        if(tokenService.authenticate(email,token)){
            return userService.logOut(email);
        }
        return "Authentication Failed";
    }

}
