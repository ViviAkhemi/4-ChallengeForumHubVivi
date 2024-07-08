package com.forum.hub.topicos;

public record DadosDetalhamentoTopico(Long id, String titulo, String mensagem) {

    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getId(),topico.getTitulo(),topico.getMensagem());
    }


}
