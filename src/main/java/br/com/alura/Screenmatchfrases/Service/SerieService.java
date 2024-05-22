package br.com.alura.Screenmatchfrases.Service;

import br.com.alura.Screenmatchfrases.Repository.Repositorio;
import br.com.alura.Screenmatchfrases.dto.SerieDTO;
import br.com.alura.Screenmatchfrases.model.Frase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {
    @Autowired
    private Repositorio repositorio;

    public SerieDTO obterfrase() {
         Frase f = repositorio.obterfrase();
        return new SerieDTO(f.getTitulo(), f.getFrase(),f.getPersonagem(),f.getPoster());
    }
}
