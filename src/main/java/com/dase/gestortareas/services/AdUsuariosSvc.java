/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestortareas.services;

import com.dase.gestortareas.entities.AdUsuarios;
import com.dase.gestortareas.jsons.AdUsuariosRest;
import java.util.Optional;


/**
 *
 * @author Fernando Garcia
 */
public interface AdUsuariosSvc {
     Optional<AdUsuarios> getUsuariosById(Long userId);   
}
