package com.dase.gestortareas.controllers;

import com.dase.gestortareas.commons.CommonController;
import com.dase.gestortareas.entities.Usuarios;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.Locale;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import com.dase.gestortareas.services.UsuariosSvc;

@RestController

@RequestMapping(path = "/user")
public class UsuariosController extends CommonController<Usuarios, UsuariosSvc>{
    

    @GetMapping(path = "/byUserAndPassword/{user}/{pass}")
    @ApiOperation(value = "Consulta usuarios por medio de su username y password")
    public ResponseEntity<?> findUserByUsernameAndPass(@PathVariable(required = true) @ApiParam(value = "user") String user, @PathVariable(required = true) @ApiParam(value = "pass") String pass, @RequestHeader(name = "Accept-Languaje", required = false) Locale locale) {
        return ResponseEntity.ok().body(service.findUserByUsernameAndPass(user, pass));
    }

}
