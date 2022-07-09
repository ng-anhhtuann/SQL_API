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
        String insert = "INSERT INTO SQLAPI.Khoa(makhoa,tenkhoa,dienthoai) VALUES (?,?,?)";
        String check = "SELECT * FROM SQLAPI.Khoa WHERE tenkhoa = '" + faculty.getTenkhoa() + "';";

        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = connection.prepareStatement(check);
        ResultSet resultSet = ps.executeQuery();

        try (PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            if (resultSet.next()) {
                object = new Error(false, "Tenkhoa is already existed");
            } else {
                preparedStatement.setString(1, faculty.getMakhoa());
                preparedStatement.setString(2, faculty.getTenkhoa());
                preparedStatement.setString(3, faculty.getDienthoai());
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
        String insert = "INSERT INTO SQLAPI.giangVien(magv,hotengv,luong,makhoa) VALUES (?,?,?,?)";
        String check = "SELECT * FROM SQLAPI.GiangVien WHERE magv = '" + teacher.getMagv() + "';";
        PreparedStatement ps = connection.prepareStatement(check);
        ResultSet resultSet = ps.executeQuery();
        try (PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            if (resultSet.next()) {
                object = new Error(false, "Magv is already existed");
            } else {
                preparedStatement.setInt(1, teacher.getMagv());
                preparedStatement.setString(2, teacher.getHotengv());
                preparedStatement.setDouble(3, teacher.getLuong());
                preparedStatement.setString(4, teacher.getMakhoa());
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
        String insert = "INSERT INTO SQLAPI.SinhVien(masv,hotensv,makhoa,namsinh,quequan) VALUES (?,?,?,?,?)";
        String check = "SELECT * FROM SQLAPI.SinhVien WHERE masv = '" + student.getMasv() + "';";
        PreparedStatement ps = connection.prepareStatement(check);
        ResultSet resultSet = ps.executeQuery();
        try (PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            if (resultSet.next()) {
                object = new Error(false, "Masv is already existed");
            } else {
                preparedStatement.setInt(1, student.getMasv());
                preparedStatement.setString(2, student.getHotensv());
                preparedStatement.setString(3, student.getMakhoa());
                preparedStatement.setInt(4, student.getNamsinh());
                preparedStatement.setString(5, student.getQuequan());
                preparedStatement.executeUpdate();
                object = new Success(true, student.toString());
            }
        } catch (Exception e) {
            object = new Error(false, e.getMessage());
        }
        return object;
    }

    public Object insert(Title title) throws SQLException {
        Object object = null;
        if (title == null) {
            object = new Error(false, "We dont accept null information here");
        }
        Connection connection = DriverManager.getConnection(url, username, password);
        String insert = "INSERT INTO SQLAPI.DeTai(madt,tendt,kinhphi,noithuctap) VALUES (?,?,?,?)";
        String check = "SELECT * FROM SQLAPI.DeTai WHERE madt = '" + title.getMadt() + "';";
        PreparedStatement ps = connection.prepareStatement(check);
        ResultSet resultSet = ps.executeQuery();
        try (PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            if (resultSet.next()) {
                object = new Error(false, "Madt is already existed");
            } else {
                preparedStatement.setString(1, title.getMadt());
                preparedStatement.setString(2, title.getTendt());
                preparedStatement.setInt(3, title.getKinhphi());
                preparedStatement.setString(4, title.getNoithuctap());
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
        String insert = "INSERT INTO SQLAPI.HuongDan(masv,madt,magv,ketqua) VALUES (?,?,?,?)";
        String check = "SELECT * FROM SQLAPI.HuongDan WHERE masv = '" + compilation.getMasv() + "';";
        PreparedStatement ps = connection.prepareStatement(check);
        ResultSet resultSet = ps.executeQuery();
        try (PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            if (resultSet.next()) {
                object = new Error(false, "Masv is already existed");
            } else {
                preparedStatement.setInt(1, compilation.getMasv());
                preparedStatement.setString(2, compilation.getMadt());
                preparedStatement.setInt(3, compilation.getMagv());
                preparedStatement.setDouble(4, compilation.getKetqua());
                preparedStatement.executeUpdate();
                object = new Success(true, compilation.toString());
            }
        } catch (Exception e) {
            object = new Error(false, e.getMessage());
        }
        return object;
    }

    /*
    This method is to return tenkhoa, tengv, magv of GiangVien
     */
    public Object queryGiangVienInfo() throws SQLException {
        Object toReturn = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        List<Object> objectList = new ArrayList<>();
        String query = " SELECT magv, hotengv, tenkhoa\n" +
                "FROM SQLAPI.GiangVien\n" +
                "INNER JOIN SQLAPI.Khoa\n" +
                "ON SQLAPI.Khoa.makhoa = SQLAPI.GiangVien.makhoa;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                TeacherInfo teacherInfo = new TeacherInfo(resultSet.getInt("magv"),
                        resultSet.getString("hotengv"),
                        resultSet.getString("tenkhoa"));
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

    public Object queryGiangVienInfoByCounting() throws SQLException {
        Object toReturn = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        List<Object> objectList = new ArrayList<>();
        String query = "SELECT magv, hotengv, tenkhoa \n" +
                "FROM SQLAPI.GiangVien\n" +
                "INNER JOIN SQLAPI.Khoa\n" +
                "ON SQLAPI.Khoa.makhoa = SQLAPI.GiangVien.makhoa\n" +
                "WHERE SQLAPI.GiangVien.magv IN ( SELECT SQLAPI.HuongDan.magv\n " +
                "FROM SQLAPI.HuongDan\n GROUP BY magv HAVING COUNT(DISTINCT magv) >= 3);";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                TeacherInfo teacherInfo = new TeacherInfo(resultSet.getInt("magv"),
                        resultSet.getString("hotengv"),
                        resultSet.getString("tenkhoa"));
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

    public Object querySinhVienNoPoints() throws SQLException {
        Object toReturn = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        List<Object> objectList = new ArrayList<>();
        String query = "SELECT masv, hotensv, makhoa, namsinh, quequan\n" +
                "FROM SQLAPI.SinhVien\n" +
                "JOIN SQLAPI.HuongDan\n" +
                "USING (masv)\n" +
                "WHERE SQLAPI.SinhVien.masv IN ( SELECT  SQLAPI.HuongDan.masv FROM SQLAPI.HuongDan WHERE ketqua IS NULL OR ketqua ='');";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Student student = new Student(resultSet.getInt("masv")
                        , resultSet.getString("hotensv")
                        , resultSet.getString("makhoa")
                        , resultSet.getInt("namsinh")
                        , resultSet.getString("quequan"));
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
        String sodienthoai = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "SELECT dienthoai\n" +
                "FROM SQLAPI.Khoa AS A \n" +
                "INNER JOIN SQLAPI.SinhVien AS B\n" +
                "ON A.makhoa = B.makhoa AND B.hotensv = 'Phan Thi E';";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                sodienthoai = "" + resultSet.getString("dienthoai");
            }
            if (sodienthoai.isEmpty()) {
                toReturn = new Error(false, "There is no one name Phan Thi E at all");
            } else {
                toReturn = new Success(true, "" + sodienthoai);
            }
        } catch (Exception e) {
            toReturn = new Error(false, e.getMessage());
        }
        return toReturn;
    }

    public Object queryDeTaiInfoHavingTwoColab() throws SQLException {
        Object toReturn = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        List<Object> objectList = new ArrayList<>();
        String query = "SELECT madt, tendt\n" +
                "FROM SQLAPI.DeTai AS A\n" +
                "JOIN SQLAPI.HuongDan AS B USING (madt)\n" +
                "WHERE madt IN (SELECT madt \n" +
                "FROM SQLAPI.HuongDan GROUP BY madt HAVING COUNT(distinct madt) >2);\n";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                TwoColabTitle twoColabTitle = new TwoColabTitle(resultSet.getInt("madt"), resultSet.getString("tendt"));
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

    public Object queryMaxKinhPhiInfo() throws SQLException {
        Object toReturn = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        List<Object> objectList = new ArrayList<>();
        String query = "select madt, tendt\n" +
                "from SQLAPI.DeTai\n" +
                "order by kinhphi desc limit 0,1;\n";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                MaxWorthTitle detai = new MaxWorthTitle(resultSet.getString("madt"), resultSet.getString("tendt"));
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

    public Object queryCountTenKhoa() throws SQLException {
        Object toReturn = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        List<Object> objectList = new ArrayList<>();
        String query = "select tenkhoa, count(distinct SQLAPI.SinhVien.makhoa) as \"soluongsv\"\n" +
                "from SQLAPI.Khoa \n" +
                "join SQLAPI.SinhVien using(makhoa)\n" +
                "group by makhoa;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                CountFacultyName countFacultyName = new CountFacultyName(resultSet.getString("tenkhoa"), resultSet.getInt("soluongsv"));
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

    public Object queryMaTenDiem() throws SQLException {
        Object toReturn = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        List<Object> objectList = new ArrayList<>();
        String query = "select a.masv, a.hotensv, b.ketqua\n" +
                "from SQLAPI.SinhVien as a\n" +
                "join SQLAPI.HuongDan as b using(masv)\n" +
                "where a.makhoa = 'VLHN' or a.makhoa = 'IT';";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                StudentIdNamePoint studentIdNamePoint = new StudentIdNamePoint(resultSet.getInt("masv"), resultSet.getString("hotensv"), resultSet.getDouble("ketqua"));
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

    public Object querySinhVienInfo() throws SQLException {
        Object toReturn = null;
        Connection connection = DriverManager.getConnection(url, username, password);
        List<Object> objectList = new ArrayList<>();
        String query = "select masv, hotensv, (2022-namsinh) as tuoi\n" +
                "from SQLAPI.SinhVien\n" +
                "where makhoa = 'DTV';";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                StudentSubInfo sinhVienInfo = new StudentSubInfo(resultSet.getInt("masv"), resultSet.getString("hotensv"), resultSet.getInt("tuoi"));
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
