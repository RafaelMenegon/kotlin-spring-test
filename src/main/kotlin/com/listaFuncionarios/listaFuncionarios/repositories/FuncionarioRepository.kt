package com.listaFuncionarios.listaFuncionarios.repositories

import com.listaFuncionarios.listaFuncionarios.controller.entity.FuncionarioEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface FuncionarioRepository : CrudRepository<FuncionarioEntity, Long> {
}