package com.listaFuncionarios.listaFuncionarios.controller

import com.listaFuncionarios.listaFuncionarios.controller.jsons.FuncionarioJson
import com.listaFuncionarios.listaFuncionarios.controller.mapper.FuncionarioMapper
import com.listaFuncionarios.listaFuncionarios.facade.FuncionarioFacade
import org.mapstruct.factory.Mappers
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("funcionario")
class FruncionariosController @Autowired constructor(private val funcionarioFacade: FuncionarioFacade) {

    val mapper: FuncionarioMapper = Mappers.getMapper(FuncionarioMapper::class.java)

    @PostMapping
    fun adicionarFuncionario(@RequestBody funcionario: FuncionarioJson): ResponseEntity<FuncionarioJson> {

        ResponseEntity.ok().body(funcionarioFacade.adicionarFuncionario(mapper.mapToModel(funcionario)))

    }
}