package com.belliBabs.admin_app.mapper;

import com.belliBabs.admin_app.dto.Produit;
import com.belliBabs.admin_app.entity.ProduitEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ProduitMapper {

    Produit toProduit(ProduitEntity produitEntity);
    ProduitEntity fromProduit(Produit produit);
}
