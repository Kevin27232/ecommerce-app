package com.myapp.ecommerce.service;

import com.myapp.ecommerce.dto.UtilisateurDto;
import com.myapp.ecommerce.model.Utilisateur;
import com.myapp.ecommerce.repository.UtilisateurRepository;
import com.myapp.ecommerce.response.UtilisateurResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public UtilisateurResponse addUtilisateur(UtilisateurDto utilisateurDto) {
        Utilisateur utilisateur = maptoUtilisateur(utilisateurDto);
       Utilisateur savedUtilisateur = utilisateurRepository.save(utilisateur);

        return maptoUtilisateurResponse(savedUtilisateur);

    }

    public UtilisateurResponse maptoUtilisateurResponse(Utilisateur utilisateur) {
        return UtilisateurResponse.builder()
                .nom(utilisateur.getNom())
                .prénom(utilisateur.getPrénom())
                .email(utilisateur.getEmail())
                .photo(utilisateur.getPhoto()).build();
    }
    public Utilisateur maptoUtilisateur (UtilisateurDto utilisateur) {
        return Utilisateur.builder()
                .nom(utilisateur.getNom())
                .prénom(utilisateur.getPrénom())
                .email(utilisateur.getEmail())
                .photo(utilisateur.getPhoto()).build();
    }

}
