package com.project.SQLandAPI.Controller.Query;

import com.project.SQLandAPI.Repository.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping(value = "getIdNamePoint")
public class QueryStudentIdNamePoints {
    @GetMapping
    public static Object get() throws SQLException {
        Repository repository = Repository.getRepository();
        return repository.queryIdNamePoint();
    }
}
