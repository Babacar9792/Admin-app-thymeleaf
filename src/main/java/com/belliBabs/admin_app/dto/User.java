package com.belliBabs.admin_app.dto;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    @NotNull(message = "Le username est obligatoire")
    private String username;

    @NotNull(message = "L'email ne peut etre null")
    private String email;

    @NotNull(message = "Veuillez choisir un mot de passe")
    private String password;

    private int state;


}
