package com.project.SQLandAPI.Method.InsertData;

import com.project.SQLandAPI.Model.Insert.DeTai;
import com.project.SQLandAPI.Repository.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping(value = "insertDeTai")
public class InsertDetai {
    @PostMapping
    public static Object insertDeTai(@RequestBody DeTai deTai) throws SQLException {
        Repository repository = Repository.getRepository();
        return repository.insert(deTai);
    }
}
