package com.example.tp4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Societe {
    @Id
    @GeneratedValue
    long idSociete;
    String nomCommercial;
    String activite;
    String pays;
    public Societe() {
    }
    public Societe(Long idSociete){
        this.idSociete=idSociete;

    }

    // Constructeur avec tous les paramètres sauf identifiant
    public Societe(String nomCommercial, String activite, String pays) {
        this.nomCommercial = nomCommercial;
        this.activite = activite;
        this.pays = pays;
    }

    // Accesseurs et modificateurs
    public long getIdSociete() {
        return idSociete;
    }

    public void setIdSociete(long idSociete) {
        this.idSociete = idSociete;
    }

    public String getNomCommercial() {
        return nomCommercial;
    }

    public void setNomCommercial(String nomCommercial) {
        this.nomCommercial = nomCommercial;
    }

    public String getActivite() {
        return activite;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}

