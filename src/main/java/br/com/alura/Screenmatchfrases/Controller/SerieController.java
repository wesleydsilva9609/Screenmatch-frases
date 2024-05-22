package br.com.alura.Screenmatchfrases.Controller;

import br.com.alura.Screenmatchfrases.Service.SerieService;
import br.com.alura.Screenmatchfrases.dto.SerieDTO;
import br.com.alura.Screenmatchfrases.model.Frase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SerieController {
    @Autowired
   private SerieService service;

    @GetMapping("/series/frases")
    public SerieDTO obterfrase(){
        return service.obterfrase();
    }
}
