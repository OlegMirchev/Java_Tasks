package javaTask;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private Shop instance;
    private List<SalesConsultant> saleWorkers;
    private List<MarketingSpecialist> marketingWorkers;

    public Shop(Shop instance) {
        this.instance = instance;
        this.saleWorkers = new ArrayList<>();
        this.marketingWorkers = new ArrayList<>();
    }

    public void addWorker(Object worker) {
        if (worker.getClass().getSimpleName().equals("java.SalesConsultant")) {
            this.saleWorkers.add((SalesConsultant) worker);
        }else if (worker.getClass().getSimpleName().equals("java.MarketingSpecialist")) {
            this.marketingWorkers.add((MarketingSpecialist) worker);
        }
    }

    public float getTurnover() {
        float turnOver = 0;

        for (SalesConsultant worker : this.saleWorkers) {
            turnOver += worker.getMoney();
        }

        for (MarketingSpecialist worker : this.marketingWorkers) {
            turnOver += worker.getBudget();
        }

        return turnOver;
    }

    public Shop getInstance() {
        return instance;
    }

    public void setInstance(Shop instance) {
        if (instance == null) {
            throw new IllegalArgumentException("Invalid instance");
        }

        this.instance = instance;
    }

    public List<SalesConsultant> getSaleWorkers() {
        return saleWorkers;
    }

    public void setSaleWorkers(List<SalesConsultant> saleWorkers) {
        this.saleWorkers = saleWorkers;
    }

    public List<MarketingSpecialist> getMarketingWorkers() {
        return marketingWorkers;
    }

    public void setMarketingWorkers(List<MarketingSpecialist> marketingWorkers) {
        this.marketingWorkers = marketingWorkers;
    }
}

class SalesConsultant {

    private Shop workingShop;
    private double earnedMoney;

    public SalesConsultant() {

    }

    public void sellProduct(double price) {
        this.earnedMoney += Math.max(price, 0);
    }

    public double getMoney() {
        return this.earnedMoney;
    }

    public void setMoney(double earnedMoney) {
        this.earnedMoney = earnedMoney;
    }

    public Shop getWorkingShop() {
        return workingShop;
    }

    public void setWorkingShop(Shop workingShop) {
        this.workingShop = workingShop;
    }
}

class MarketingSpecialist {

    private Shop workingShop;
    private double budget = 5000.00;

    public MarketingSpecialist() {

    }

    public void spendMoney(double marketingCampaignCost) {
        this.budget -= Math.max(marketingCampaignCost, 0);
    }

    public double getBudget() {
        return this.budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Shop getWorkingShop() {
        return workingShop;
    }

    public void setWorkingShop(Shop workingShop) {
        this.workingShop = workingShop;
    }
}
