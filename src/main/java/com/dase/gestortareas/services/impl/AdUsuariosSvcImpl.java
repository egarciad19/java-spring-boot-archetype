/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestortareas.services.impl;

import com.dase.gestortareas.entities.AdUsuarios;
import com.dase.gestortareas.jsons.AdUsuariosRest;
import com.dase.gestortareas.repositories.AdUsuariosRepository;
import com.dase.gestortareas.services.AdUsuariosSvc;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fernando Garcia
 */
@Service
public class AdUsuariosSvcImpl implements AdUsuariosSvc {

    @Autowired
    AdUsuariosRepository userRepository;

    public static final ModelMapper modelMapper = new ModelMapper();

    @Override
    public Optional<AdUsuarios> getUsuariosById(Long userId) {
        Optional<AdUsuarios> datos = this.userRepository.findById(userId);   
        System.out.println(":::::Implementacion:::::" + datos.get().getUsuario());
        return datos;
    }

   

    private Optional<AdUsuarios> getUsauriosEntity(Long userId) {
        
        
        Optional<AdUsuarios> datos = this.userRepository.findById(userId);   
        System.out.println(":::::Implementacion:::::" + datos.get().getUsuario());
        return datos;

    }
}
