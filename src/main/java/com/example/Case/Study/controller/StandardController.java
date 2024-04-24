package com.example.Case.Study.controller;

import com.example.Case.Study.model.Standard;
import com.example.Case.Study.repository.StandardRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class StandardController {

    private final StandardRepository standardRepository;

    public StandardController(StandardRepository standardRepository) {
        this.standardRepository = standardRepository;
    }

    @GetMapping("/")
    public String showStandards(Model model) {
        List<Standard> standards = standardRepository.findAllByOrderByIssueDateDesc();
        model.addAttribute("standards", standards);
        return "standards";
    }



}
