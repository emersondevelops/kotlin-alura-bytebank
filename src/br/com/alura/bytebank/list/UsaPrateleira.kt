package br.com.alura.bytebank.list

import br.com.alura.bytebank.list.Prateleira
import br.com.alura.bytebank.list.imprimeComMarcadores
import br.com.alura.bytebank.list.listaDeLivros

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()
}