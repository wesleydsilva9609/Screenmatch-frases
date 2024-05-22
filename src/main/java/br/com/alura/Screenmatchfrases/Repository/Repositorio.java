package br.com.alura.Screenmatchfrases.Repository;

import br.com.alura.Screenmatchfrases.dto.SerieDTO;
import br.com.alura.Screenmatchfrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Repositorio extends JpaRepository<Frase,Long>{

    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Frase obterfrase();
}
