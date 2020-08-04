package com.listaFuncionarios.listaFuncionarios.controller.mapper

import com.listaFuncionarios.listaFuncionarios.controller.entity.FuncionarioEntity
import com.listaFuncionarios.listaFuncionarios.controller.jsons.FuncionarioJson
import com.listaFuncionarios.listaFuncionarios.controller.model.FuncionarioModel
import org.mapstruct.Mapper

@Mapper
interface FuncionarioMapper {


    fun mapToModel(funcionarioJson: FuncionarioJson): FuncionarioModel

    fun mapToEntity(funcionarioModel: FuncionarioModel): FuncionarioEntity

    fun mapEntityToModel(funcionarioEntity: FuncionarioEntity): FuncionarioModel

    fun mapToJson(funcionarioModel: FuncionarioModel): FuncionarioJson
}