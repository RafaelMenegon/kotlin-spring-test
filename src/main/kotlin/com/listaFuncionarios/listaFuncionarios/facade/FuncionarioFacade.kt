package com.listaFuncionarios.listaFuncionarios.facade

import com.listaFuncionarios.listaFuncionarios.controller.mapper.FuncionarioMapper
import com.listaFuncionarios.listaFuncionarios.controller.model.FuncionarioModel
import com.listaFuncionarios.listaFuncionarios.repositories.FuncionarioRepository
import org.mapstruct.factory.Mappers
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class FuncionarioFacade @Autowired constructor(private val funcionarioRepository: FuncionarioRepository) {

    private val mapper: FuncionarioMapper = Mappers.getMapper(FuncionarioMapper::class.java)

    fun adicionarFuncionario(funcionario: FuncionarioModel): FuncionarioModel {
        val funcionarioEntity = funcionarioRepository.save(mapper.mapToEntity(funcionario))
        return mapper.mapEntityToModel(funcionarioEntity)
    }
}