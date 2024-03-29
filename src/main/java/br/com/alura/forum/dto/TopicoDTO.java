package br.com.alura.forum.dto;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;

import br.com.alura.forum.modelo.Topico;

public class TopicoDTO {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;

	public TopicoDTO(Topico topico) {

		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();

	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	
	public static Page<TopicoDTO> toTopicoDTO(Page<Topico> topicos) {
		
		// Metodo de converter uma page de Topico em TopicoDTO
		// Para cada topico chamamos o new da classe TopicoDTO
		return topicos.map(TopicoDTO::new);
		
	}

}
