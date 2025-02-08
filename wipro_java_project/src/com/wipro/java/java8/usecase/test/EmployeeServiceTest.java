package com.wipro.java.java8.usecase.test;

import com.wipro.java.java8.usecase.Employee;
import com.wipro.java.java8.usecase.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {
    private EmployeeService service;

    @BeforeEach
    void setUp() {
        service = new EmployeeService();
        service.addEmployee(new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10)));
        service.addEmployee(new Employee(2, "Bob", "HR", 45000, LocalDate.of(2019, 3, 15)));
    }

    @Test
    void testAddEmployee() {
        service.addEmployee(new Employee(3, "Charlie", "Finance", 60000, LocalDate.of(2021, 8, 22)));
        assertNotNull(service.searchEmployee(3));
    }

    @Test
    void testRemoveEmployee() {
        service.removeEmployee(2);
        assertFalse(service.searchEmployee(2).isPresent());
    }

    @Test
    void testSpecificEmployeeData() {
        Employee employee = service.searchEmployee(1).orElse(null);
        assertNotNull(employee);
        assertEquals("Alice", employee.getName());
        assertEquals("IT", employee.getDepartment());
        assertEquals(50000, employee.getSalary());
    }
}
