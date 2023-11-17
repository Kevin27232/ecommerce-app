package com.myapp.ecommerce.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class UtilisateurResponse {

    private String nom;
    private String prénom;
    private String email;
    private String photo;


}
