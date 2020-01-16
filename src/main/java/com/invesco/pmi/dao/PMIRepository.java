package com.invesco.pmi.dao;

import com.invesco.pmi.entities.PrivateMarketInvestment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PMIRepository extends CrudRepository<PrivateMarketInvestment, Long> {

    public List<PrivateMarketInvestment> findAll();
}
