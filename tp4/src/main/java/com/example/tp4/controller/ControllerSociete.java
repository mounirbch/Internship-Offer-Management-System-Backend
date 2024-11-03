package com.example.tp4.controller;

import com.example.tp4.service.ServiceSociete;
import com.example.tp4.service.ServiceStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="")
public class ControllerSociete {
    private final ServiceSociete servicesociete;
    @Autowired
    public ControllerSociete(ServiceSociete servicesociete){this.servicesociete=servicesociete;}
}

