package edu.ifma.lpweb.musicbook.repository;

import edu.ifma.lpweb.musicbook.model.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<T extends BaseModel, I extends Number> extends JpaRepository<T, I> {}
