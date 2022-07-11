package com.example.hello;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Employee{
    private String employeeId;
    private String employeeName;
    private int employeeAge;
}