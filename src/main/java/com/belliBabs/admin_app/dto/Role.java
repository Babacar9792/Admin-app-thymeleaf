package com.belliBabs.admin_app.dto;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private Long id;

    @NotNull(message = "Le role dot forcément avoir un libellé")
    private String name;

}
