package com.myapp.ecommerce.controllers;

import com.myapp.ecommerce.dto.UtilisateurDto;
import com.myapp.ecommerce.model.Utilisateur;
import com.myapp.ecommerce.response.UtilisateurResponse;
import com.myapp.ecommerce.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/utilisateur")
@RestController
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping
    public UtilisateurResponse addUtilisateur( @RequestBody UtilisateurDto utilisateurdto) {

        return utilisateurService.addUtilisateur(utilisateurdto);


    }


}
