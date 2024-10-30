package com.kadir.dto;

import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {

    @NotEmpty(message = "First name is required")
    @Min(value = 2, message = "First name must be at least 2 characters")
    @Max(value = 40, message = "First name must be at most 40 characters")
    private String firstName;

    @Size(min = 2, max = 40, message = "Last name must be between 2 and 40 characters")
    private String lastName;

    private Date birthOfDate;

    @Email(message = "Email is not valid")
    private String email;

    @Size(min = 11, max = 11, message = "Identity number must be 11 characters")
    @NotEmpty(message = "Identity number is required")
    private String identityNumber;
}
