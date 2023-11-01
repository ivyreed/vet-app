package com.sprinkles.sdv.service;

import com.sprinkles.sdv.datatransferobject.PetDTO;
import com.sprinkles.sdv.models.Pet;
import com.sprinkles.sdv.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PetService {
    private final PetRepository storage;

    public PetService(PetRepository storage) {
        this.storage = storage;
    }

    public List<PetDTO> getStuff(){
        var pets = storage.findAll();
        final List<PetDTO> petdtos= new ArrayList<>();
        for (var i = 0 ; i < pets.size() ; i++) {
//            get pet out, convert it to pet dto, replace return
            var pet = new PetDTO(pets.get(i).id(), pets.get(i).name());
            petdtos.add(pet);
        }


        return petdtos;
    }
    public List<PetDTO> addStuff(PetDTO petdto){
        var pet = new Pet(petdto.id(),petdto.name());
        storage.save(pet);
        return getStuff();
//        take pet dto param add to list in storage then return list of pets

    }
}

//get pet controller to use pet service to get list ofpets.
