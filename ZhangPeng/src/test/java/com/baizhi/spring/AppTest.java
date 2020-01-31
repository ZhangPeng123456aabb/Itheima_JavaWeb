package com.baizhi.spring;

import com.baizhi.spring.entity.User;
import com.baizhi.spring.entity.person;
import com.baizhi.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static junit.framework.TestCase.assertTrue;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue(true);
    }
    public static void main(String []args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       /* User user = (User)context.getBean("properties");
        System.out.println(user);*/
       Connection connection =(Connection) context.getBean("myConnection");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from t_user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+"***"+resultSet.getString(2)+"***"+resultSet.getInt(3));
        }
    }
}
