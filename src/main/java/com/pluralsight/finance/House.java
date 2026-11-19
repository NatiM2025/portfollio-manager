package com.pluralsight.finance;

import java.math.BigDecimal;

public class House extends FixedAsset{
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public int  house (int yearBuilt,int squareFeet,int bedrooms){
        return 0;
    }

    @Override
    public BigDecimal getValue() {
        return null;
    }
}
