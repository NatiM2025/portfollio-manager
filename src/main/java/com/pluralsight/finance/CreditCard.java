package com.pluralsight.finance;

import com.pluralsight.Valuable;

import java.math.BigDecimal;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private BigDecimal balance;
    public String creditCard (String name,String accountNumber,BigDecimal balance){
        return null;
    }
    public void charge (BigDecimal amount){

    }
    public void pay (BigDecimal amount){

    }

    @Override
    public void getValue() {

    }
}
