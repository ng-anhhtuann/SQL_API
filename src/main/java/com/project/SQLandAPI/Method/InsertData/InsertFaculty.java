package com.project.SQLandAPI.Method.InsertData;

import com.project.SQLandAPI.Model.Insert.Faculty;
import com.project.SQLandAPI.Repository.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping(value = "insertKhoa")
public class InsertFaculty {
    @PostMapping
    public static Object insert(@RequestBody Faculty faculty) throws SQLException {
        Repository repository = Repository.getRepository();
        return repository.insert(faculty);
    }

}
