package com.pluralsight.finance;

import java.math.BigDecimal;

public class Gold extends FixedAsset{
    private double weight;
    public double weight (double weight){
        return weight;
    }
    @Override
    public BigDecimal getValue() {
        return null;
    }
}
