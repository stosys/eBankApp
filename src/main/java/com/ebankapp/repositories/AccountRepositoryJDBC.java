package com.ebankapp.repositories;


import com.ebankapp.models.Cont;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class AccountRepositoryJDBC implements AccountRepository {

    private JdbcTemplate jdbc;
    @Autowired
    public AccountRepositoryJDBC(DataSource ds) {
        this.jdbc=new JdbcTemplate(ds);
    }

    @Override
    public Cont create(Cont cont) {
        return jdbc.queryForObject("INSERT INTO CONTURI VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                new Object[]{cont.getNrCard(),cont.getNume(),cont.getPrenume(),cont.getCnp(),cont.getCi(),cont.getDomiciliu(),cont.getMail(),
                        cont.getTip(),cont.getDataCr(),cont.getTelefon(),cont.getSold(),cont.getBcode(),cont.getNrCont(),cont.getIdc()},
                new ContRowMapper());
    }

    @Override
    public Cont getById(long id) {
        return null;
    }

    @Override
    public Cont update(Cont cont) {
        return null;
    }

    @Override
    public void delete(Cont cont) {

    }

    class ContRowMapper implements RowMapper<Cont>{

        @Override
        public Cont mapRow(ResultSet resultSet, int i) throws SQLException {
            Cont cont=new Cont();
            cont.setIdc(resultSet.getLong("IDC"));
            cont.setBcode(resultSet.getString("BCODE"));
            cont.setCi(resultSet.getString("CI"));
            cont.setCnp(resultSet.getString("CNP"));
            cont.setDataCr(resultSet.getDate("DATA_CR"));
            cont.setDomiciliu(resultSet.getString("ADRESA"));
            cont.setMail(resultSet.getString("MAIL"));
            cont.setNrCard(resultSet.getString("NR_CARD"));
            cont.setNrCont(resultSet.getString("NR_CONT"));
            cont.setNume(resultSet.getString("NUME"));
            cont.setPrenume(resultSet.getString("PRENUME"));
            cont.setSold(resultSet.getDouble("SOLD"));
            cont.setTelefon(resultSet.getString("TELEFON"));
            cont.setTip(resultSet.getInt("TIP"));
            return cont;
        }
    }
}
