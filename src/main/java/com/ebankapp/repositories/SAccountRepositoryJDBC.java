package com.ebankapp.repositories;


import com.ebankapp.models.Cont;
import com.ebankapp.models.ContSpecial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class SAccountRepositoryJDBC implements SAccountRepository{

    private JdbcTemplate jdbc;

    @Autowired
    public SAccountRepositoryJDBC(DataSource dataSource){
        this.jdbc = new JdbcTemplate(dataSource);
    }

    @Override
    public ContSpecial create(ContSpecial contSpecial) {

        return jdbc.queryForObject("INSERT INTO CONTURI_SPECIALE VALUES(?,?,?,?,?,?)",
                new Object[] {contSpecial.getNrCont(),contSpecial.getNumeFirma(),contSpecial.getAdresa(),contSpecial.getTel(),contSpecial.getMail(),contSpecial.getSold()},
                new SAccountRowMapper());
    }

    @Override
    public ContSpecial update(ContSpecial contSpecial) {
        return null;
    }

    @Override
    public void delete(ContSpecial contSpecial) {

    }

    class SAccountRowMapper implements RowMapper <ContSpecial>{

        @Override
        public ContSpecial mapRow(ResultSet resultSet,int i) throws SQLException {
            ContSpecial contSpecial=new ContSpecial();
            contSpecial.setAdresa(resultSet.getString("ADRESA"));
            contSpecial.setIdcs(resultSet.getLong("IDCS"));
            contSpecial.setMail(resultSet.getString("EMAIL"));
            contSpecial.setNrCont(resultSet.getString("NR_CONT"));
            contSpecial.setNumeFirma(resultSet.getString("NUME_FIRMA"));
            contSpecial.setSold(resultSet.getDouble("SOLD"));
            contSpecial.setTel(resultSet.getString("TELEFON"));
            return contSpecial;
        }

    }
}
