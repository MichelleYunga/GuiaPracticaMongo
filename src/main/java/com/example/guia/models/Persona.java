/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.guia.models;

import java.util.List;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;


@Data
@Component
@Document(collection = "Persona")
public class Persona {
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private Contactos contactos;
    private List<Telefonia> listTelefonia;

  
}
