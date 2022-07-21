package com.project.SQLandAPI.Controller.Insert;

import com.project.SQLandAPI.Model.Insert.Compilation;
import com.project.SQLandAPI.Repository.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping(value = "insertCompilation")

public class InsertCompilation {
    @PostMapping
    public static Object insert(@RequestBody Compilation compilation) throws SQLException {
        Repository repository = Repository.getRepository();
        return repository.insert(compilation);
    }
}
