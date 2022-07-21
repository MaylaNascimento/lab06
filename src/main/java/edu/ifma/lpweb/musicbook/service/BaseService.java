package edu.ifma.lpweb.musicbook.service;

import edu.ifma.lpweb.musicbook.model.BaseModel;
import edu.ifma.lpweb.musicbook.repository.BaseRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public  class BaseService<T extends BaseModel, I extends Integer> {
    private final BaseRepository<T, I> repository;

    public BaseService(BaseRepository<T, I> repository) {
        this.repository = repository;
    }

    public List<T> todos() {
        return this.repository.findAll();
    }

    public Optional<T> buscarPorId(I id) {
        return this.repository.findById(id);
    }

    @Transactional
    public T salva(T entity) {
        return this.repository.save(entity);
    }

    @Transactional
    public void removePelo(I id) {
        this.repository.deleteById(id);
    }
}
