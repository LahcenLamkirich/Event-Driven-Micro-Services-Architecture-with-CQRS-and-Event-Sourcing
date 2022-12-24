package com.lamkirich.comptecqrseventsourcing.CommonApi.commands;

public class CreateAccountCommand extends BaseCommand<String>{

    private double initialBalance ;
    private String currency ;

    public CreateAccountCommand(String id, double balance, String curr) {
        super(id);
        this.initialBalance = balance ;
        this.currency = curr ;
    }
}
