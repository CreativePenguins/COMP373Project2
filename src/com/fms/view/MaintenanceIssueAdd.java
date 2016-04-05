package com.fms.view;

import com.fms.model.maintenance.Issues;
import com.fms.model.service.MaintenanceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tyler on 4/5/16.
 */
public class MaintenanceIssueAdd {
    public static void main (String args[]) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("*#*#*#*#*#*#*# CONTEXT CREATED #*#*#*#*#*#*#*");
        MaintenanceService maintenanceService = (MaintenanceService) context.getBean("maintenanceService");

        System.out.println("*#*#*#*#*#*#*# CREATING ISSUE #*#*#*#*#*#*#*");
        Issues issues = (Issues) context.getBean("issues");
        issues.setComments("The building is on fire");
        issues.setCost(99999);
        issues.setIssueId(1);
        issues.setResolved(false);

        maintenanceService.addIssue(issues);
    }
}
