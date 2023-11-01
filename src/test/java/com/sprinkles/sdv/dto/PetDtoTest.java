package com.sprinkles.sdv.dto;


import com.sprinkles.sdv.datatransferobject.PetDTO;
import org.junit.jupiter.api.Test;

public class PetDtoTest {
    @Test
    void test(){
        var mixtape = new PetDTO(1,"null");
        System.out.println(mixtape.name().length());
        var nullname = new PetDTO(0,null);
        System.out.println(nullname.name().length());
    }
}
