package com.example.Music_Streaming_Service_Application.Repository;

import com.example.Music_Streaming_Service_Application.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepo  extends JpaRepository<Admin,Long> {

    Admin findFirstByAdminEmail(String adminEmail);
}
