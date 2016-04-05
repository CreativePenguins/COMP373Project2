package com.fms.view;

import com.fms.model.service.UserService;
import com.fms.model.users.Tenants;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tyler on 4/4/16.
 */
public class UserTenantRm {
    public static void main (String args[]) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("*#*#*#*#*#*#*# CONTEXT CREATED #*#*#*#*#*#*#*");
        UserService userService = (UserService) context.getBean("userService");

        System.out.println("*#*#*#*#*#*#*# DELETING TENANT #*#*#*#*#*#*#*");
        Tenants tenant = userService.findTenantById(1);

        System.out.println("*#*#*#*#*#*#*# TENANT TO BE DELETED #*#*#*#*#*#*#*");
        System.out.println("\t NAME: \t\t: " + tenant.getFirstName());

        userService.deleteTenantbyID(tenant);

    }
}
