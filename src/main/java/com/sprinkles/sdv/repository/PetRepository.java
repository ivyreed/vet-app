package com.sprinkles.sdv.repository;

import com.sprinkles.sdv.config.DatabaseConfig;
import com.sprinkles.sdv.datatransferobject.PetDTO;
import com.sprinkles.sdv.models.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {


}
