package com.lamkirich.comptecqrseventsourcing.CommonApi.commands;

public class CreditAccountCommand extends BaseCommand<String>{

    private double amount ;
    private String currency ;

    public CreditAccountCommand(String id, double amount, String curr) {
        super(id);
        this.amount = amount ;
        this.currency = curr ;
    }
}
