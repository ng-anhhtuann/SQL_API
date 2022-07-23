package com.project.SQLandAPI.Repository;

import com.project.SQLandAPI.Model.Insert.*;
import com.project.SQLandAPI.Model.Query.*;
import com.project.SQLandAPI.Model.Status.Error;
import com.project.SQLandAPI.Model.Status.Success;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    private static final String url = "jdbc:mysql://localhost:3306/QuickResponse";
    private static final String username = "root";
    private static final String password = "0944988947t";

    public static Repository repository;

    public static Repository getRepository() {
        if (repository == null) {
            repository = new Repository();
        }
        return repository;
    }

    public static void setRepository(Repository repository) {
        Repository.repository = repository;
    }

    /*
    Insert Data : Khoa, GiangVien, Sinh Vien, Huong Dan, DeTai
     */
    public Object insert(Faculty faculty) throws SQLException {
        Object object = null;
        if (faculty == null) {
            object = new Error(false, "We dont accept null information here");
        }
        String insert = "INSERT INTO SQLAPI.Faculty(idFaculty,nameFaculty,numberFaculty) VALUES (?,?,?)";
        String check = "SELECT * FROM SQLAPI.Faculty WHERE nameFaculty = '" + faculty.getNameFaculty() + "';";

        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = connection.prepareStatement(check);
        ResultSet resultSet = ps.executeQuery();

        try (PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            if (resultSet.next()) {
                object = new Error(false, "nameFaculty is already existed");
            } else {
                preparedStatement.setString(1, faculty.getIdFaculty());
                preparedStatement.setString(2, faculty.getNameFaculty());
                preparedStatement.setString(3, faculty.getNumberFaculty());
                preparedStatement.executeUpdate();
                object = new Success(true, faculty.toString());
            }
        } catch (Exception e) {
            object = new Error(false, e.getMessage());
        }
        return object;
    }

    public Object insert(Teacher teacher) throws SQLException {
        Object object = null;
        if (teacher == null) {
            object = new Error(false, "We dont accept null information here");
        }
        Connection connection = DriverManager.getConnection(url, username, password);
        String insert = "INSERT INTO SQLAPI.Teacher(idTeacher,nameTeacher,salaryTeacher,idFaculty) VALUES (?,?,?,?)";
        String check = "SELECT * FROM SQLAPI.Teacher WHERE idTeacher = '" + teacher.getIdTeacher() + "';";
        PreparedStatement ps = connection.prepareStatement(check);
        ResultSet resultSet = ps.executeQuery();
        try (PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            if (resultSet.next()) {
                object = new Error(false, "idTeacher is already existed");
            } else {
                preparedStatement.setInt(1, teacher.getIdTeacher());
                preparedStatement.setString(2, teacher.getNameTeacher());
                preparedStatement.setDouble(3, teacher.getSalaryTeacher());
                preparedStatement.setString(4, teacher.getIdFaculty());
                preparedStatement.executeUpdate();
                object = new Success(true, teacher.toString());
            }
        } catch (Exception e) {
            object = new Error(false, e.getMessage());
        }
        return object;
    }

    public Object insert(Student student) throws SQLException {
        Object object = null;
        if (student == null) {
            object = new Error(false, "We dont accept null information here");
        }
        Connection connection = DriverManager.getConnection(url, username, password);
        String insert = "INSERT INTO SQLAPI.Student(idStudent,nameStudent,idFaculty,bornYear,addressStudent) VALUES (?,?,?,?,?)";
        String check = "SELECT * FROM SQLAPI.Student WHERE idStudent = '" + student.getIdStudent() + "';";
        PreparedStatement ps = connection.prepareStatement(check);
        ResultSet resultSet = ps.executeQuery();
        try (PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            if (resultSet.next()) {
                object = new Error(false, "idStudent is already existed");
            } else {
                preparedStatement.setInt(1, student.getIdStudent());
                preparedStatement.setString(2, student.getNameStudent());
                preparedStatement.setString(3, student.getIdFaculty());
                preparedStatement.setInt(4, student.getYearStudent());
                preparedStatement.setString(5, student.getAddressStudent());
                preparedStatement.executeUpdate();
                object = new Success(true, student.toString());
            }
        } catch (Exception e) {
            object = new Error(false, e.getMessage());
        }
        return object.toString();
    }

    public Object insert(Title title) throws SQLException {
        Object object = null;
        if (title == null) {
            object = new Error(false, "We dont accept null information here");
        }
        Connection connection = DriverManager.getConnection(url, username, password);
        String insert = "INSERT INTO SQLAPI.Title(idTitle,nameTitle,feeTitle,siteTitle) VALUES (?,?,?,?)";
        String check = "SELECT * FROM SQLAPI.Title WHERE idTitle = '" + title.getIdTitle() + "';";
        PreparedStatement ps = connection.prepareStatement(check);
        ResultSet resultSet = ps.executeQuery();
        try (PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            if (resultSet.next()) {
                object = new Error(false, "idTitle is already existed");
            } else {
                preparedStatement.setString(1, title.getIdTitle());
                preparedStatement.setString(2, title.getNameTitle());
                preparedStatement.setInt(3, title.getFeeTitle());
                preparedStatement.setString(4, title.getSiteTitle());
                preparedStatement.executeUpdate();
                object = new Success(true, title.toString());
            }
        } catch (Exception e) {
            object = new Error(false, e.getMessage());
        }
        return object;
    }

    public Object insert(Compilation compilation) throws SQLException {
        Object object = null;
        if (compilation == null) {
            object = new Error(false, "We dont accept null information here");
        }
        Connection connection = DriverManager.getConnection(url, username, password);
        String insert = "INSERT INTO SQLAPI.Compilation(idStudent,idTitle,idTeacher,result) VALUES (?,?,?,?)";
        String check = "SELECT * FROM SQLAPI.Compilation WHERE idStudent = '" + compilation.getIdStudent() + "';";
        PreparedStatement ps = connection.prepareStatement(check);
        ResultSet resultSet = ps.executeQuery();
        try (PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            if (resultSet.next()) {
                object = new Error(false, "idStudent is already existed");
            } else {
                preparedStatement.setInt(1, compilation.getIdStudent());
                preparedStatement.setString(2, compilation.getIdTitle());
                preparedStatement.setInt(3, compilation.getIdTeacher());
                preparedStatement.setDouble(4, compilation.getResult());
                preparedStatement.executeUpdate();
                object = new Success(true, compilation.toString());
            }
        } catch (Exception e) {
            object = new Error(false, e.getMessage());
        }
        return object;
    }

    /*
    This method is to return nameFaculty, nameTeacher, idTeacher of GiangVien
     */
    public Object queryTeacherInfo() throws SQLException {
        Object toReturn = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        List<Object> objectList = new ArrayList<>();
        String query = " SELECT idTeacher, nameTeacher, nameFaculty\n" +
                "FROM SQLAPI.Teacher\n" +
                "INNER JOIN SQLAPI.Faculty\n" +
                "ON SQLAPI.Faculty.idFaculty = SQLAPI.Teacher.idFaculty;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                TeacherInfo teacherInfo = new TeacherInfo(resultSet.getInt("idTeacher"),
                        resultSet.getString("nameTeacher"),
                        resultSet.getString("nameFaculty"));
                objectList.add(teacherInfo);
            }
            if (objectList.isEmpty()) {
                toReturn = new Error(false, "There is no GiangVien at all");
            } else {
                toReturn = new Success(true, "" + objectList);
            }
        } catch (Exception e) {
            toReturn = new Error(false, e.getMessage());
        }
        return toReturn;
    }

    public Object queryTeacherInfoByCounting() throws SQLException {
        Object toReturn = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        List<Object> objectList = new ArrayList<>();
        String query = "SELECT idTeacher, nameTeacher, nameFaculty \n" +
                "FROM SQLAPI.Teacher\n" +
                "INNER JOIN SQLAPI.Faculty\n" +
                "ON SQLAPI.Faculty.idFaculty = SQLAPI.Teacher.idFaculty\n" +
                "WHERE SQLAPI.Teacher.idTeacher IN ( SELECT SQLAPI.Compilation.idTeacher\n " +
                "FROM SQLAPI.Compilation\n GROUP BY idTeacher HAVING COUNT(DISTINCT idTeacher) >= 3);";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                TeacherInfo teacherInfo = new TeacherInfo(resultSet.getInt("idTeacher"),
                        resultSet.getString("nameTeacher"),
                        resultSet.getString("nameFaculty"));
                objectList.add(teacherInfo);
            }
            if (objectList.isEmpty()) {
                toReturn = new Error(false, "There is no GiangVien helping 3 more students at all");
            } else {
                toReturn = new Success(true, "" + objectList);
            }
        } catch (Exception e) {
            toReturn = new Error(false, e.getMessage());
        }
        return toReturn;
    }

    public Object queryStudentNoPoints() throws SQLException {
        Object toReturn = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        List<Object> objectList = new ArrayList<>();
        String query = "SELECT idStudent, nameStudent, idFaculty, bornYear, addressStudent\n" +
                "FROM SQLAPI.Student\n" +
                "JOIN SQLAPI.Compilation\n" +
                "USING (idStudent)\n" +
                "WHERE SQLAPI.Student.idStudent IN ( SELECT  SQLAPI.Compilation.idStudent FROM SQLAPI.Compilation WHERE result IS NULL OR result ='');";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Student student = new Student(resultSet.getInt("idStudent")
                        , resultSet.getString("nameStudent")
                        , resultSet.getString("idFaculty")
                        , resultSet.getInt("bornYear")
                        , resultSet.getString("addressStudent"));
                objectList.add(student);
            }
            if (objectList.isEmpty()) {
                toReturn = new Error(false, "There is no SinhVien having no points at all");
            } else {
                toReturn = new Success(true, "" + objectList);
            }
        } catch (Exception e) {
            toReturn = new Error(false, e.getMessage());
        }
        return toReturn;
    }

    public Object getNumber() throws SQLException {
        Object toReturn = null;
        String sonumberFaculty = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "SELECT numberFaculty\n" +
                "FROM SQLAPI.Faculty AS A \n" +
                "INNER JOIN SQLAPI.Student AS B\n" +
                "ON A.idFaculty = B.idFaculty AND B.nameStudent = 'Phan Thi E';";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                sonumberFaculty = "" + resultSet.getString("numberFaculty");
            }
            if (sonumberFaculty.isEmpty()) {
                toReturn = new Error(false, "There is no one name Phan Thi E at all");
            } else {
                toReturn = new Success(true, "" + sonumberFaculty);
            }
        } catch (Exception e) {
            toReturn = new Error(false, e.getMessage());
        }
        return toReturn;
    }

    public Object queryTitleInfoHavingTwoColab() throws SQLException {
        Object toReturn = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        List<Object> objectList = new ArrayList<>();
        String query = "SELECT idTitle, nameTitle\n" +
                "FROM SQLAPI.Title AS A\n" +
                "JOIN SQLAPI.Compilation AS B USING (idTitle)\n" +
                "WHERE idTitle IN (SELECT idTitle \n" +
                "FROM SQLAPI.Compilation GROUP BY idTitle HAVING COUNT(distinct idTitle) >2);\n";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                TwoColabTitle twoColabTitle = new TwoColabTitle(resultSet.getInt("idTitle"), resultSet.getString("nameTitle"));
                objectList.add(twoColabTitle);
            }
            if (objectList.isEmpty()) {
                toReturn = new Error(false, "There is no Detai having more than 2 colab at all");
            } else {
                toReturn = new Success(true, "" + objectList);
            }
        } catch (Exception e) {
            toReturn = new Error(false, e.getMessage());
        }
        return toReturn;
    }

    public Object queryMaxFeeInfo() throws SQLException {
        Object toReturn = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        List<Object> objectList = new ArrayList<>();
        String query = "select idTitle, nameTitle\n" +
                "from SQLAPI.Title\n" +
                "order by feeTitle desc limit 0,1;\n";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                MaxWorthTitle detai = new MaxWorthTitle(resultSet.getString("idTitle"), resultSet.getString("nameTitle"));
                objectList.add(detai);
            }
            if (objectList.isEmpty()) {
                toReturn = new Error(false, "There is nothing to query at all");
            } else {
                toReturn = new Success(true, "" + objectList);
            }
        } catch (Exception e) {
            toReturn = new Error(false, e.getMessage());
        }
        return toReturn;
    }

    public Object queryCountNameFaculty() throws SQLException {
        Object toReturn = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        List<Object> objectList = new ArrayList<>();
        String query = "select nameFaculty, count(distinct SQLAPI.Student.idFaculty) as \"sosalaryTeachersv\"\n" +
                "from SQLAPI.Faculty \n" +
                "join SQLAPI.Student using(idFaculty)\n" +
                "group by idFaculty;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                CountFacultyName countFacultyName = new CountFacultyName(resultSet.getString("nameFaculty"), resultSet.getInt("sosalaryTeachersv"));
                objectList.add(countFacultyName);
            }
            if (objectList.isEmpty()) {
                toReturn = new Error(false, "There is nothing to query at all");
            } else {
                toReturn = new Success(true, "" + objectList);
            }
        } catch (Exception e) {
            toReturn = new Error(false, e.getMessage());
        }
        return toReturn;
    }

    public Object queryIdNamePoint() throws SQLException {
        Object toReturn = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        List<Object> objectList = new ArrayList<>();
        String query = "select a.idStudent, a.nameStudent, b.result\n" +
                "from SQLAPI.Student as a\n" +
                "join SQLAPI.Compilation as b using(idStudent)\n" +
                "where a.idFaculty = 'VLHN' or a.idFaculty = 'IT';";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                StudentIdNamePoint studentIdNamePoint = new StudentIdNamePoint(resultSet.getInt("idStudent"), resultSet.getString("nameStudent"), resultSet.getDouble("result"));
                objectList.add(studentIdNamePoint);
            }
            if (objectList.isEmpty()) {
                toReturn = new Error(false, "There is no one at khoa IT or VLHN");
            } else {
                toReturn = new Success(true, "" + objectList);
            }
        } catch (Exception e) {
            toReturn = new Error(false, e.getMessage());
        }
        return toReturn;
    }

    public Object queryStudentInfo() throws SQLException {
        Object toReturn = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        List<Object> objectList = new ArrayList<>();
        String query = "select idStudent, nameStudent, (2022-bornYear) as tuoi\n" +
                "from SQLAPI.Student\n" +
                "where idFaculty = 'DTV';";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                StudentSubInfo sinhVienInfo = new StudentSubInfo(resultSet.getInt("idStudent"), resultSet.getString("nameStudent"), resultSet.getInt("tuoi"));
                objectList.add(sinhVienInfo);
            }
            if (objectList.isEmpty()) {
                toReturn = new Error(false, "There is no one at khoa DTV");
            } else {
                toReturn = new Success(true, "" + objectList);
            }
        } catch (Exception e) {
            toReturn = new Error(false, e.getMessage());
        }
        return toReturn;
    }
}
