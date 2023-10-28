package com.example.Music_Streaming_Service_Application.Repository;

import com.example.Music_Streaming_Service_Application.Model.AuthenticationToken;
import com.example.Music_Streaming_Service_Application.Model.Music;
import com.example.Music_Streaming_Service_Application.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITokenRepo extends JpaRepository<AuthenticationToken, Long> {
    AuthenticationToken findFirstByTokenValue(String tokenValue);

    AuthenticationToken findFirstByUser(User user);

    List<Music> findByUser(User user);
}
