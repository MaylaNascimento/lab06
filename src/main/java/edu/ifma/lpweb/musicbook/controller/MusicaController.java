package edu.ifma.lpweb.musicbook.controller;

import edu.ifma.lpweb.musicbook.model.Musica;
import edu.ifma.lpweb.musicbook.service.BaseService;
import edu.ifma.lpweb.musicbook.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="musica")
public class MusicaController extends BaseController<MusicaService, Musica, Integer>{

    @Autowired
    public MusicaController(MusicaService service) {
        super(service);
    }
}
