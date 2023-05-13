package com.binance.api.client.domain.account;

public class MarginInterestRate {
    /**
     * Symbol.
     */
    private String asset;

    /**
     * Next hour interest rate.
     */
    private String nextHourlyInterestRate;


    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getNextHourlyInterestRate() {
        return nextHourlyInterestRate;
    }

    public void setNextHourlyInterestRate(String nextHourlyInterestRate) {
        this.nextHourlyInterestRate = nextHourlyInterestRate;
    }

    @Override
    public String toString() {
        return "MarginInterestRate [asset=" + asset + ", nextHourlyInterestRate=" + nextHourlyInterestRate + "]";
    }
}
