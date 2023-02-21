package org.example.controllers;

import org.example.models.Hospital;
import org.example.services.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hospitals")
public class HospitalController {
    private final HospitalService hospitalService;

    @Autowired
    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @GetMapping
    String getAllHospitals(Model model) {
        model.addAttribute("hospitals",hospitalService.getAllHospitals());
        return "hos/mainPage";
    }

    @GetMapping("/new")
    String save(Model model) {
        model.addAttribute("hospital", new Hospital());
        return "hos/hospitals";
    }

    @PostMapping("/save")
    String create(@ModelAttribute("hospital") Hospital hospital) {
        hospitalService.saveHospital(hospital);
        return "redirect:/hospitals";
    }
    @DeleteMapping("/delete/{id}")
    String deleteHospital(@PathVariable("id") Long id){
        hospitalService.deleteByIdHospital(id);
        return "redirect:/hospitals";
    }

    @GetMapping("/update/{id}")
    public String updateHospital(@PathVariable("id") Long id,Model model){
        model.addAttribute("hospital",hospitalService.getByIdHospital(id));
        return "hos/updateHospital";
    }

    @PostMapping("{id}/updateHospital")
    String saveUpdateHospital(@PathVariable("id") Long id,@ModelAttribute("hospital") Hospital hospital){
        hospitalService.updateHospital(id,hospital);
        return "redirect:/hospitals";
    }

}
