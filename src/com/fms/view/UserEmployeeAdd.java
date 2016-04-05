package com.fms.view;

import com.fms.model.maintenance.IssueType;
import com.fms.model.service.UserService;
import com.fms.model.users.Employees;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tyler on 4/4/16.
 */
public class UserEmployeeAdd {
    public static void main (String args[]) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("*#*#*#*#*#*#*# CONTEXT CREATED #*#*#*#*#*#*#*");
        UserService userService = (UserService) context.getBean("userService");

        System.out.println("*#*#*#*#*#*#*# CREATING EMPLOYEE #*#*#*#*#*#*#*");
        Employees employees = (Employees) context.getBean("employees");
        IssueType issueType1 = (IssueType) context.getBean("issueType");
        issueType1.setId(1);
        issueType1.setDescription("Carpenter");
        employees.setID(1);
        employees.setSpecialty1(issueType1);

        userService.addEmployee(employees);
    }
}
