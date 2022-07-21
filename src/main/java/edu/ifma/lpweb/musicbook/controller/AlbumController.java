package edu.ifma.lpweb.musicbook.controller;

import edu.ifma.lpweb.musicbook.model.Album;
import edu.ifma.lpweb.musicbook.service.AlbumService;
import edu.ifma.lpweb.musicbook.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/album")
public class AlbumController extends BaseController<AlbumService, Album, Integer>{

    @Autowired
    public AlbumController(AlbumService service) {
        super(service);
    }

}
