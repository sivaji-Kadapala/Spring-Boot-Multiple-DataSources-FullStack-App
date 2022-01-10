package com.tony.md.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tony.md.model.User;





@Transactional
@Repository
public class UserDaoImpl {
 
 @Autowired
 @Qualifier("jdbcTemplate1")
 private JdbcTemplate jdbcTemplate1;
 
 @Autowired
 @Qualifier("jdbcTemplate2")
 private JdbcTemplate jdbcTemplate2;

 public List getAllUser() {
  String sql1 = "select * from user1";
  //get users list from db1
  List list1 = jdbcTemplate1.query(sql1, new UserRowMapper());
  
  String sql2 = "select * from user2";
  //get users list from db2
  List list2 = jdbcTemplate2.query(sql2, new UserRowMapper());
  
  List listAll = (List) Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
  return listAll;
 }
 
 class UserRowMapper implements RowMapper{

  @Override
  public User mapRow(ResultSet rs, int rowNum) throws SQLException {
   User user = new User();
   user.setId(rs.getInt("id"));
   user.setUsername(rs.getString("username"));
   user.setEmail(rs.getString("email"));
   user.setDbs(rs.getString("dbs"));
   return user;
  }
  
 }

}