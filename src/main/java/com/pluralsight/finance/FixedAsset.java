package com.pluralsight.finance;

import java.math.BigDecimal;

public abstract class FixedAsset {
     private String name;

     public String fixedAssetName (String name){
         return name;
     }
     public abstract BigDecimal getValue();
}

