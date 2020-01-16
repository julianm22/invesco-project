package com.invesco.pmi.services;

import com.invesco.pmi.dao.PMIRepository;
import com.invesco.pmi.entities.PrivateMarketInvestment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PMIService {

    @Autowired
    private PMIRepository pmiRepo;

    public List<PrivateMarketInvestment> getAllPrivateMarketInvestments() {
        return pmiRepo.findAll();
    }

}
