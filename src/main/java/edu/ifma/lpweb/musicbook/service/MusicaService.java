package edu.ifma.lpweb.musicbook.service;

import edu.ifma.lpweb.musicbook.model.Musica;
import edu.ifma.lpweb.musicbook.repository.MusicaRepository;
import org.springframework.stereotype.Service;

@Service
public class MusicaService extends BaseService<Musica, Integer> {

    public MusicaService(MusicaRepository repository) {
        super(repository);
    }
}
