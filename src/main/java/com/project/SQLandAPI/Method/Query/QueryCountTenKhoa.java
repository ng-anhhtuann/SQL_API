package com.project.SQLandAPI.Method.Query;

import com.project.SQLandAPI.Repository.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping(value = "getCountTenKhoa")
public class QueryCountTenKhoa {
    @GetMapping
    public static Object getCountTenKhoa() throws SQLException {
        Repository repository = Repository.getRepository();
        return repository.queryCountTenKhoa();
    }
}