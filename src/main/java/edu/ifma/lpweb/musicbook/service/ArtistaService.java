package edu.ifma.lpweb.musicbook.service;

import edu.ifma.lpweb.musicbook.model.Artista;
import edu.ifma.lpweb.musicbook.repository.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class ArtistaService extends BaseService<Artista, Integer> {

    public ArtistaService(BaseRepository<Artista, Integer> repository) {
        super(repository);
    }
}
