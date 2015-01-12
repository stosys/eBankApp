package com.ebankapp.repositories;

import com.ebankapp.models.Angajat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class EmployeeRepositoryJDBC implements EmployeeRepository{

    private JdbcTemplate jdbc;

    @Autowired
    public EmployeeRepositoryJDBC(DataSource ds) {
        this.jdbc=new JdbcTemplate(ds);
    }

    @Override
    public Angajat create(Angajat angajat) {
        return jdbc.queryForObject("INSERT INTO ANGAJATI VALUES(?,?,?,?,?,?) RETURN *",
                new Object[] {angajat.getNume(),angajat.getPrenume(),angajat.getRang(),angajat.getSalar(),angajat.getParola(),angajat.getMail()},
                new EmployeeRowMapper());
    }

    @Override
    public Angajat update(Angajat angajat) {
        return null;
    }

    @Override
    public void delete(Angajat angajat) {

    }

    class EmployeeRowMapper implements RowMapper<Angajat>{

        @Override
        public Angajat mapRow(ResultSet resultSet,int i) throws SQLException {
            Angajat angajat = new Angajat();
            angajat.setMail(resultSet.getString("MAIL"));
            angajat.setSalar(resultSet.getDouble("SALARIU"));
            angajat.setNume(resultSet.getString("NUME"));
            angajat.setPrenume(resultSet.getString("PRENUME"));
            angajat.setParola(resultSet.getString("PAROLA"));
            angajat.setRang(resultSet.getInt("RANG"));
            return angajat;
        }
    }
}
