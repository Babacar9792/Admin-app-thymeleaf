package com.belliBabs.admin_app.dao;

import com.belliBabs.admin_app.entity.ProduitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduitRepository extends JpaRepository<ProduitEntity, Long> {
}
