package TDB.MSegurity.services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TDB.MSegurity.repository.microRepository;
import TDB.MSegurity.models.UsuarioModel;

@Service
public class microService {
    public microService(){
        
    }

    @Autowired
    microRepository _microRepository;

    public List<UsuarioModel> getAll(){
        return (List<UsuarioModel>) _microRepository.findAll();
    }

   
}
