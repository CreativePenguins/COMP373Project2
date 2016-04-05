package com.fms.view;

import com.fms.model.service.UserService;
import com.fms.model.users.Employees;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tyler on 4/4/16.
 */
public class UserEmployeeRm {
    public static void main (String args[]) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("*#*#*#*#*#*#*# CONTEXT CREATED #*#*#*#*#*#*#*");
        UserService userService = (UserService) context.getBean("userService");

        System.out.println("*#*#*#*#*#*#*# DELETING EMPLOYEE #*#*#*#*#*#*#*");

        Employees employees = userService.findEmployeeById(1);
        System.out.println("\t\t" + employees.getID());

        userService.deleteEmployee(employees);
    }
}
