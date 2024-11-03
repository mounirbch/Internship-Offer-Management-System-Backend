package com.example.tp4.controller;

import com.example.tp4.model.OffreStage;
import com.example.tp4.service.ServiceStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/mounir")
public class ControllerStage {
private final ServiceStage servicestage;
@Autowired
public ControllerStage(ServiceStage servicestage){this.servicestage=servicestage;}

    @GetMapping(path="/stages")
        public List<OffreStage> getAll(){return servicestage.getOffreStage();}
    @GetMapping(value="/stage/{id}")
    public Optional<OffreStage> getAllById(@PathVariable Long id){
        return servicestage.getOffreStageById(id);
}
    @DeleteMapping(value="/delete/{id}")
    public String deleteoffrestage(@PathVariable Long id){
    boolean exist = servicestage.deleteStage(id);
    if(exist){
        return "deleted ";
    }else{
        return "not deleted";
    }
    }
    @PostMapping
    public OffreStage creteStage(@RequestBody OffreStage newStage){
    return servicestage.createStage(newStage);

    }
    @PutMapping

    public String UpdateStage(@RequestBody OffreStage updatestage){
    return servicestage.updateStage1(updatestage);
    }
    @GetMapping(value="/intitule/{intitule}")
    public List <OffreStage> findbyIntiule (@PathVariable String intitule){
    return servicestage.getOffretageByIntitule(intitule);
    }
    @GetMapping(value = "/stages/societe/{idSociete}")
    public List<OffreStage> getStagesBySociete(@PathVariable Long idSociete) {
        return servicestage.getStagesBySociete(idSociete);
    }
    @GetMapping(value = "/stages/pays/{pays}")
    public List<OffreStage> getStagesBypays(@PathVariable String pays) {
        return servicestage.getStagesBypays(pays);
    }
    @DeleteMapping(value = "/stages/specialite/{specialite}")
    public String deleteBySpecialite(@PathVariable String specialite) {
         servicestage.deleteBySpecialite(specialite);
         return "b n ";
    }
}
