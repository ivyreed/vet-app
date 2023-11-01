package com.sprinkles.sdv.dto;


import com.sprinkles.sdv.datatransferobject.PetDTO;
import org.junit.jupiter.api.Test;

public class PetDTOTest {
    @Test
    void test(){
        var mixtape = new PetDTO("null");
        System.out.println(mixtape.name().length());
        var nullname = new PetDTO(null);
        System.out.println(nullname.name().length());
    }
}
