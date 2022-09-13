package com.dase.gestortareas.controllers;

import com.dase.gestortareas.services.AdUsuariosSvc;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins="https://analisis-sistemas.herokuapp.com")
@RestController

@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    AdUsuariosSvc usuarioSvc;    
    
    @GetMapping("/usuarioById/{id}")
    @ApiOperation(value = "Consulta el usuario por id")
    public ResponseEntity<?> findAllSolicitudesByIdUser(@PathVariable(required = true) @ApiParam(value = "id") Long id, @RequestHeader(name = "Accept-Languaje", required = false) Locale locale){
        return ResponseEntity.ok().body(usuarioSvc.getUsuariosById(id));
    }

}
