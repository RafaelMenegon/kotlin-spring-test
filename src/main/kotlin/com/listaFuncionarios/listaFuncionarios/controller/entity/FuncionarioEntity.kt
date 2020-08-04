package com.listaFuncionarios.listaFuncionarios.controller.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class FuncionarioEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long,
        var nomeCompleto: String?,
        var idade: Int?,
        var cpf: String?,
        var salario: Double?
) {
}