package edu.ifma.lpweb.musicbook.controller;

import edu.ifma.lpweb.musicbook.model.BaseModel;
import edu.ifma.lpweb.musicbook.repository.BaseRepository;
import edu.ifma.lpweb.musicbook.service.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class BaseController<S extends BaseService, M extends BaseModel, I extends Integer> {

    private final BaseService service;

    public BaseController(BaseService service) {
        this.service = service;
    }

    @GetMapping
    public List<M> todos() {
        return this.service.todos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<M> buscarPor(@PathVariable I id) {
        Optional<M> result = this.service.buscarPorId(id);

        if (result.isPresent()) {
            return ResponseEntity.ok(result.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public M cadastro(@RequestBody @Valid M entity) {
        return (M) this.service.salva(entity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<M> atualiza(@PathVariable Integer id,
                                           @RequestBody @Valid M entity) {
        Optional<M> optional = service.buscarPorId(id);

        if (optional.isPresent()) {
            entity.setId(id);
            M entityUpdated = (M) service.salva(entity);
            return ResponseEntity.ok(entityUpdated);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping
    public ResponseEntity<?> removePelo(@PathVariable I id) {
        Optional<M> optional = service.buscarPorId(id);

        if (optional.isPresent()) {
            service.removePelo(id);
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }

}
