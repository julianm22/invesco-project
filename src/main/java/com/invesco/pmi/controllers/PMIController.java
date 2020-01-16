package com.invesco.pmi.controllers;

import com.invesco.pmi.entities.PrivateMarketInvestment;
import com.invesco.pmi.services.PMIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("pmi")
public class PMIController {

    @Autowired
    private PMIService pmiService;

    @GetMapping
    public String getAllPrivateMarketInvestments(Model model) {
        List<PrivateMarketInvestment> pmiList = pmiService.getAllPrivateMarketInvestments();
        model.addAttribute("pmiList", pmiList);
        return "index";
    }

    @GetMapping("/new")
    public String displayPmiForm(Model model) {
        PrivateMarketInvestment pmi = new PrivateMarketInvestment();
        model.addAttribute("pmi", pmi);
        return "new-pmi";
    }

    @PostMapping("/save")
    public String createPmi(PrivateMarketInvestment pmi, Model model) {
//        pmiService.saveNewPmi(pmi);
        return "redirect:/pmi";
    }

}
