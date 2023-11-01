package com.sprinkles.sdv.service;

import com.sprinkles.sdv.datatransferobject.PetDTO;
import com.sprinkles.sdv.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PetService {
    private final PetRepository storage;

    public PetService(PetRepository storage) {
        this.storage = storage;
    }

    public List<PetDTO> getStuff(){
        return storage.listPets();
    }
    public List<PetDTO> addStuff(PetDTO petdto){
        storage.enter(petdto);
        return getStuff();
//        take pet dto param add to list in storage then return list of pets

    }
}

//get pet controller to use pet service to get list ofpets.
