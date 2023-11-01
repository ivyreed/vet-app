package com.sprinkles.sdv.controller;

import com.sprinkles.sdv.datatransferobject.PetDTO;
import com.sprinkles.sdv.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetController {


    private final PetService petServer;

    public PetController(PetService petServer) {
        this.petServer = petServer;
    }


    @GetMapping("/Pet")
    public List<PetDTO> servicer(){
        return petServer.getStuff();
    }
    @PostMapping("/receptionist")
    public List<PetDTO> enter(@RequestBody PetDTO petdto){
        return petServer.addStuff(petdto);
    }
}
