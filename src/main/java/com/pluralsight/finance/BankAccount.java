package com.pluralsight.finance;

import com.pluralsight.Valuable;

import java.math.BigDecimal;

public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private BigDecimal balance;

    public String bankAccount (String name,String accountNumber,BigDecimal balance){
        return null;
    }
    public void withdraw (BigDecimal amount){

    }
    public void deposit (BigDecimal amount){

    }

    @Override
    public void getValue() {

    }
}
