package com.project.SQLandAPI.Method.InsertData;

import com.project.SQLandAPI.Model.Insert.Title;
import com.project.SQLandAPI.Repository.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping(value = "insertDeTai")
public class InsertTitle {
    @PostMapping
    public static Object insertDeTai(@RequestBody Title title) throws SQLException {
        Repository repository = Repository.getRepository();
        return repository.insert(title);
    }
}
