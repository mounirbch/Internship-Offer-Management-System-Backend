package com.example.tp4.service;

import com.example.tp4.repository.RepositorySociete;
import com.example.tp4.repository.RepositoryStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceSociete {
    private final RepositorySociete societeRepo;
    @Autowired
    public ServiceSociete(RepositorySociete societeRepo) {
        super();
        this.societeRepo = societeRepo;
    }
}
