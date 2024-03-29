package br.com.alura.forum.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.forum.modelo.Topico;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long>{

	// Underline para mostrar que eh um relacionamento e nao um atributo (facultativo)
	Page<Topico> findByCurso_Nome(String curso, Pageable pageable);
	
}
