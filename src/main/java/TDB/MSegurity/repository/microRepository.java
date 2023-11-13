package TDB.MSegurity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import TDB.MSegurity.models.UsuarioModel;

@Repository
public interface microRepository  extends CrudRepository<UsuarioModel, Integer>{

    
} 