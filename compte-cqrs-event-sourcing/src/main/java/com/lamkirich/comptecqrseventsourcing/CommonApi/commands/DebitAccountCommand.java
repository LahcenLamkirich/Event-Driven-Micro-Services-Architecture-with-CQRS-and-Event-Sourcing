package com.lamkirich.comptecqrseventsourcing.CommonApi.commands;

public class DebitAccountCommand extends BaseCommand<String>{

    private double amount ;
    private String currency ;

    public DebitAccountCommand(String id, double amount, String curr) {
        super(id);
        this.amount = amount ;
        this.currency = curr ;
    }
}
