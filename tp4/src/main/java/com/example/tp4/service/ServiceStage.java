package com.example.tp4.service;


import com.example.tp4.model.Societe;
import com.example.tp4.model.OffreStage;
import com.example.tp4.repository.RepositoryStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceStage {
    private final RepositoryStage stageRepo;
    @Autowired
    public ServiceStage(RepositoryStage stageRepo) {
        super();
        this.stageRepo = stageRepo;
    }
    public List<OffreStage> getOffreStage(){
      return stageRepo.findAll();
    }
    public Optional<OffreStage> getOffreStageById(Long id){
        Optional<OffreStage> off = stageRepo.findById(id);
        return off ;

    }
    public boolean deleteStage(Long id){
        Optional<OffreStage> OffreStage = stageRepo.findById(id);
        if(OffreStage.isPresent()){
            stageRepo.deleteById(id);
            return  true ;
        }else{
            return  false ;
        }
    }
   public OffreStage createStage(OffreStage newStage){
        return  stageRepo.save(newStage);
    }


    public String updateStage1(OffreStage updatestage){

        Long code=updatestage.getCode();
       Optional <OffreStage> stage= getOffreStageById(code);
        if (stage.isPresent()){
              stageRepo.save(updatestage);

            return"offre de stage a été mis a jour";

        }
        else {
            stageRepo.save(updatestage);
            return "offre de stage a été créer avec succées";
        }
    }
    public List<OffreStage> getOffretageByIntitule(String intutile){

        return stageRepo.findByIntitule(intutile);
    }
    public List<OffreStage> getStagesBySociete(Long idSociete){

        return stageRepo.findBySocieteId(idSociete);
    }
    public List<OffreStage> getStagesBypays(String pays){

        return stageRepo.findBypays(pays);
    }
   public  void deleteBySpecialite(String specialite){
        stageRepo.deleteByspecialite(specialite);
    }


}
