package com.example.Music_Streaming_Service_Application.Model.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpOutput {

    private boolean signUpStatus;
    private String signUpMessage;

}
