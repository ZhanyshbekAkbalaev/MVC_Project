package org.example.controllers;

import org.example.models.Department;
import org.example.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    @GetMapping("{hospitalId}")
    String getAllDepartments(@PathVariable("hospitalId")Long hospitalId, Model model){
        model.addAttribute("department",departmentService.getAllDepartments(hospitalId));
        model.addAttribute("hospitalId",hospitalId);
        return "department/main";
    }

    @GetMapping("/new/{hospitalId}")
    String save(@PathVariable("hospitalId") Long id,Model model){
        model.addAttribute("department",new Department());
        model.addAttribute("hospitalId",id);
        return "department/saveDepartments";
    }

    @PostMapping("/save/{hospitalId}")
    String create(@PathVariable("hospitalId") Long hospitalId ,Department department){
        departmentService.saveDepartment(hospitalId,department);
        return "redirect:/departments/"+hospitalId;
    }
}
