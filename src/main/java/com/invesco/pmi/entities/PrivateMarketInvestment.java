package com.invesco.pmi.entities;

import javax.persistence.*;

@Entity
public class PrivateMarketInvestment {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long investmentId;
    private String region;
    private String office;
    private String registrationReceived;
    private String investmentName;
    private String dealStatus;
    private String city;
    private String state;
    private String dealSource;
    private String acquisitionOfficer;

    public PrivateMarketInvestment() {}

    public PrivateMarketInvestment(long investmentId,
                                   String region,
                                   String office,
                                   String registrationReceived,
                                   String investmentName,
                                   String dealStatus,
                                   String city,
                                   String state,
                                   String dealSource,
                                   String acquisitionOfficer) {
        this.investmentId = investmentId;
        this.region = region;
        this.office = office;
        this.registrationReceived = registrationReceived;
        this.investmentName = investmentName;
        this.dealStatus = dealStatus;
        this.city = city;
        this.state = state;
        this.dealSource = dealSource;
        this.acquisitionOfficer = acquisitionOfficer;
    }

    public long getInvestmentId() {
        return investmentId;
    }

    public void setInvestmentId(long investmentId) {
        this.investmentId = investmentId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getRegistrationReceived() {
        return registrationReceived;
    }

    public void setRegistrationReceived(String registrationReceived) {
        this.registrationReceived = registrationReceived;
    }

    public String getInvestmentName() {
        return investmentName;
    }

    public void setInvestmentName(String investmentName) {
        this.investmentName = investmentName;
    }

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDealSource() {
        return dealSource;
    }

    public void setDealSource(String dealSource) {
        this.dealSource = dealSource;
    }

    public String getAcquisitionOfficer() {
        return acquisitionOfficer;
    }

    public void setAcquisitionOfficer(String acquisitionOfficer) {
        this.acquisitionOfficer = acquisitionOfficer;
    }
}
