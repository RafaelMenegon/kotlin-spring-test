package com.listaFuncionarios.listaFuncionarios.controller.jsons

import com.fasterxml.jackson.annotation.JsonProperty

data class FuncionarioJson(
        @JsonProperty("nome_completo") var nomeCompleto: String?,
        var idade: Int?,
        var cpf: String?,
        var salario: Double?
)