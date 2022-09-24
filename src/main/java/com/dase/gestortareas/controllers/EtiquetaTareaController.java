/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestortareas.controllers;

import com.dase.gestortareas.commons.CommonController;
import com.dase.gestortareas.entities.EtiquetaTarea;
import com.dase.gestortareas.services.EtiquetaTareaSvc;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexander Elias
 */
@RestController
@RequestMapping(path = "/etiqueta-tarea")
public class EtiquetaTareaController extends CommonController<EtiquetaTarea, EtiquetaTareaSvc>{
    
}
