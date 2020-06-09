package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Topico;

public class TopicoDTO {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public Long getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public TopicoDTO(Topico topico){
        this.id = topico.getId();
        this.mensagem =  topico.getMensagem();
        this.titulo = topico.getTitulo();
        this.dataCriacao = topico.getDataCriacao();

    }

	public static List<TopicoDTO> converter(List<Topico> topicos) {
        return topicos.stream()
            .map(TopicoDTO::new)
            .collect(Collectors.toList());
	}

}
