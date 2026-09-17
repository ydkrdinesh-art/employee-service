package org.sumanth.employeeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
// dinesh
    @GetMapping
    public String getEmployees() {
        return "Employee service is working";
    }

    @GetMapping("/status")
    public String getStatus() {
        return "Employee service status: UP";
    }

    //comment on the files and
}

