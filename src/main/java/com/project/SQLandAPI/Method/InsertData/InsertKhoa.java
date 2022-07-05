package com.project.SQLandAPI.Method.InsertData;

import com.project.SQLandAPI.Model.Insert.Khoa;
import com.project.SQLandAPI.Repository.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping(value = "insertKhoa")
public class InsertKhoa {
    @PostMapping
    public static Object insert(@RequestBody Khoa khoa) throws SQLException {
        Repository repository = Repository.getRepository();
        return repository.insert(khoa);
    }

}
