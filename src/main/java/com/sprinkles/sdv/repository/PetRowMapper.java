package com.sprinkles.sdv.repository;

import com.sprinkles.sdv.datatransferobject.PetDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PetRowMapper implements RowMapper<PetDTO> {

    @Override
    public PetDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        var name = rs.getString("name");
        return new PetDTO(name);
    }
}
