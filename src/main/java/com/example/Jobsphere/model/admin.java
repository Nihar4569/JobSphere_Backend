package com.example.Jobsphere.model;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class admin {

    @Id
    private String adminId;

    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotBlank
    private String password;

    private String role = "ADMIN"; // You can use this for role-based access if needed

    private boolean active = true; // For soft deactivation

}
