package com.fms.view;

import com.fms.model.maintenance.Issues;
import com.fms.model.service.MaintenanceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tyler on 4/5/16.
 */
public class MaintenanceIssueRm {
    public static void main (String args[]) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("*#*#*#*#*#*#*# CONTEXT CREATED #*#*#*#*#*#*#*");
        MaintenanceService maintenanceService = (MaintenanceService) context.getBean("maintenanceService");

        System.out.println("*#*#*#*#*#*#*# DELETING ISSUE #*#*#*#*#*#*#*");
        Issues issues = maintenanceService.findIssueById(1);
        maintenanceService.deleteIssue(issues);
    }
}
