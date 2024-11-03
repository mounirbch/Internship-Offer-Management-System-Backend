package com.example.tp4.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Entity
@Table(name = "OffreStage")
@NamedQuery(name = "OffreStage.findBySocieteId", query = "SELECT o FROM OffreStage o WHERE o.societe.idSociete = ?1")
@NamedQuery(name = "OffreStage.findBypays", query = "SELECT o FROM OffreStage o WHERE o.societe.pays = ?1")

@NamedQuery(name="OffreStage.deleteByspecialite",query="delete from OffreStage o where o.specialite=?1")
public class OffreStage {
    @Id

    long code;
    String intitule;
    String specialite;
    @ManyToOne
    @JoinColumn(name="idSociete", nullable=false)
    Societe societe;



    public OffreStage() {
    }
    public OffreStage(long code, String intitule, String specialite, Societe societe) {
        super();
        this.code = code;
        this.intitule = intitule;
        this.specialite = specialite;
        this.societe = societe;
    }

    // Constructeur avec tous les paramètres sauf identifiant
    public OffreStage(String intitule, String specialite, Societe societe) {
        this.intitule = intitule;
        this.specialite = specialite;
        this.societe = societe;
    }

    // Accesseurs et modificateurs
    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
}

}
