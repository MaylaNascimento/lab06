package edu.ifma.lpweb.musicbook.service;

import edu.ifma.lpweb.musicbook.model.Album;
import edu.ifma.lpweb.musicbook.repository.AlbumRepository;
import edu.ifma.lpweb.musicbook.repository.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class AlbumService extends BaseService<Album, Integer>{

    public AlbumService(AlbumRepository repository) {
        super(repository);
    }
}
