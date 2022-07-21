package com.project.SQLandAPI.Controller.Insert;

import com.project.SQLandAPI.Model.Insert.Teacher;
import com.project.SQLandAPI.Repository.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping(value = "insertTeacher")
public class InsertTeacher {
    @PostMapping
    public static Object insert(@RequestBody Teacher teacher) throws SQLException {
        Repository repository = Repository.getRepository();
        return repository.insert(teacher);
    }
}
