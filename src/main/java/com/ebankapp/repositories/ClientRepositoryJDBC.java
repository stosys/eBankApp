package com.ebankapp.repositories;

import com.ebankapp.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class ClientRepositoryJDBC implements  ClientRepository{

    private JdbcTemplate jdbc;

    @Autowired
    public ClientRepositoryJDBC(DataSource dataSource) {
        this.jdbc=new JdbcTemplate(dataSource);
    }

    @Override
    public Client create(Client client){
        return jdbc.queryForObject("INSERT INTO CLIENTI VALUES(?,?,?,?)",
                new Object[] {client.getId(),client.getMail(),client.getPass(),client.getBcode()},
                new ClientRowMapper());
    }

    @Override
    public Client update(Client client) {
        return null;
    }

    @Override
    public void delete(Client client) {

    }

    class ClientRowMapper implements RowMapper<Client>{

        @Override
        public Client mapRow(ResultSet resultSet,int i) throws SQLException{
            Client client=new Client();
            client.setIdc(resultSet.getLong("IDC"));
            client.setBcode(resultSet.getLong("BCODE"));
            client.setMail(resultSet.getString("MAIL"));
            client.setId(resultSet.getString("ID_USER"));
            client.setPass(resultSet.getString("PAROLA"));
            return client;
        }
    }

}
