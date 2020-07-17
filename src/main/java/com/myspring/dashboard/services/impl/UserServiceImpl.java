package com.myspring.dashboard.services.impl;

import com.myspring.dashboard.pojo.User;
import com.myspring.dashboard.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String getAllUsers() {
        return null;
    }

    @Override
    public User getUser(Long id) {

        String sql = "select * from user where id=?";
        List<User> list =  jdbcTemplate.query(sql,new Object[]{id},new UserRowMapper());
        User user = null;
        if(list!=null){
            user = list.get(0);
        }
        return user;
    }

    @Override
    public int addUser(User user) {
        String sql = "insert into user(id,name,department_id,create_time) values (null,?,?,?)";
        int resRow = jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql,new String[]{"id"});
                ps.setString(1,user.getName());
                ps.setInt(2,user.getDepartmentId());
                ps.setDate(3,  new java.sql.Date(user.getCreateTime().getTime()));
                return ps;
            }
        });
        return 0;
    }

    @Override
    public int deleteUser(Long id) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    static class UserRowMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet rs, int i) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setDepartmentId(rs.getInt("department_id"));
            user.setCreateTime(rs.getDate("create_time"));
            return user;
        }

    }
}
