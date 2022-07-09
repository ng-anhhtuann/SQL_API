package com.project.SQLandAPI.Method.Query;

import com.project.SQLandAPI.Repository.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping(value = "getDetaiHavingTwoColab")
public class QueryTitleHavingTwoColabs {
    @GetMapping
    public static Object getGiangVienInfoHelpingThree() throws SQLException {
        Repository repository = Repository.getRepository();
        return repository.queryDeTaiInfoHavingTwoColab();
    }
}
