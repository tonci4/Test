package com.buddy.util;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.jdbc.core.RowMapper;

import com.buddy.model.User;
  
  
public class UserRowMapper implements RowMapper<User> 
{  
  
 @Override  
 public User mapRow(ResultSet resultSet, int line) throws SQLException {  
  UserExtractor userExtractor = new UserExtractor();  
  return userExtractor.extractData(resultSet);  
 }  
  

}  