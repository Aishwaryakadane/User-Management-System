package com.project.UMS.Model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotNull
    private Integer userId;

    @NotBlank
    @Pattern(regexp = "^[a-zZ-a]+$")
    private String username;

    @Pattern(regexp = "^\\d{2}-\\d{2}-\\d{4}$", message="Date format must be in dd-mm-yyyy")
    private String dateOfBirth;


    @Email(message = "plz enter valid email")
    private String userEmail;

    @Size(min = 12, max = 12)
    @Pattern(regexp = "91[0-9]{10}$", message = "valid number plz")
    private String phone_num;

    @NotNull(message = "it should not be null")
    private LocalDate date = LocalDate.now();

    @NotNull(message = "it should not be null")
    private LocalTime time = LocalTime.now();

}
