package com.example.demo.controller;


import com.example.demo.dto.EmployeeDTO;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.WorkplaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("system/user/personnelManage/")
@CrossOrigin("http://localhost:3000")
public class WorkplaceController {
    @Autowired
    private WorkplaceService workplaceService;

}
