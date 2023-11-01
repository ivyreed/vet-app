package com.sprinkles.sdv.repository;

import com.sprinkles.sdv.config.DatabaseConfig;
import com.sprinkles.sdv.datatransferobject.PetDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public class PetRepository {
    public void enter(PetDTO petdto){
        tempy.update("INSERT INTO PET(name) VALUES (?)", petdto.name());
    }


//    private final List<PetDTO> pets= new ArrayList<>();

    public  List<PetDTO> listPets(){
        return tempy.query("SELECT NAME FROM PET", new PetRowMapper());
    }
    @Autowired
    private JdbcTemplate tempy;
}
