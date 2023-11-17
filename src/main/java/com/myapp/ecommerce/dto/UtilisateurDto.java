package com.myapp.ecommerce.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UtilisateurDto {
    private String nom;
    private String prénom;
    private String motDePasse;
    private String email;
    private String photo;

}
