package edu.ifma.lpweb.musicbook.controller;

import edu.ifma.lpweb.musicbook.model.Artista;
import edu.ifma.lpweb.musicbook.service.ArtistaService;
import edu.ifma.lpweb.musicbook.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

public class ArtistaController extends BaseController<ArtistaService, Artista, Integer>{

    @Autowired
    public ArtistaController(ArtistaService service) {
        super(service);
    }
}
