package com.myapp.ecommerce.repository;

import com.myapp.ecommerce.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository <Utilisateur, Long>{

}
