package edu.ifma.lpweb.musicbook.repository;

import edu.ifma.lpweb.musicbook.model.Album;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends BaseRepository<Album, Integer> {
}
