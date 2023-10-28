package com.example.Music_Streaming_Service_Application.Repository;

import com.example.Music_Streaming_Service_Application.Model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMusicRepo extends JpaRepository<Music,Long> {

}