/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.guia.service;

import com.example.guia.models.Persona;
import com.example.guia.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService {

    @Autowired
    PersonaRepository personaRepository;
    
    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaRepository;
    }
}
