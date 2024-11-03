package com.example.tp4.repository;

import com.example.tp4.model.OffreStage;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryStage extends JpaRepository<OffreStage,Long> {
    List<OffreStage> findByIntitule(String intitule);
    List<OffreStage> findBySocieteId(Long idSociete);
    List<OffreStage> findBypays(String pays);
    @Transactional
    @Modifying
    @Query(name = "OffreStage.deleteByspecialite")
    void deleteByspecialite(String specialite);

}
