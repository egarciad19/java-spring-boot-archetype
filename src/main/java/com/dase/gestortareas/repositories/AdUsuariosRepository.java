/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestortareas.repositories;

import com.dase.gestortareas.entities.AdUsuarios;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Fernando Garcia
 */
public interface AdUsuariosRepository extends JpaRepository<AdUsuarios, Long> {

    Optional<AdUsuarios> findById(Long id);

}
