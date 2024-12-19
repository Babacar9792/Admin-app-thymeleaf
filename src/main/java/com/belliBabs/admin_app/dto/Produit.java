package com.belliBabs.admin_app.dto;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit {

    private int id;

    @NotNull(message = "Le libelle du produit est obligatoire")
    private String libelle;

    @NotNull(message = "Veuillez renseigner une description")
    private String description;

    @NotNull(message = "Le prix du produit est obligatoire")
    private Long prix;
}
