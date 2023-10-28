package com.example.Music_Streaming_Service_Application.Repository;

import com.example.Music_Streaming_Service_Application.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Long> {

    User findFirstByUserEmail(String newEmail);

}
