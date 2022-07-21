package edu.ifma.lpweb.musicbook.repository;

import edu.ifma.lpweb.musicbook.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRepository extends BaseRepository<Musica, Integer> {
}
