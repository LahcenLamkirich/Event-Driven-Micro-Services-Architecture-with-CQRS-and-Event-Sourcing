package com.lamkirich.comptecqrseventsourcing.commande.api.aggregate;

import com.lamkirich.comptecqrseventsourcing.commande.api.commands.CreateAccountCommand;
import com.lamkirich.comptecqrseventsourcing.commande.api.events.AccountCreatedEvent;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

@Aggregate
public class AccountAggregate {

    @AggregateIdentifier
    private String AccountId;
    private String currency;
    private double initialBalance;

    // Constructor that will inject the CreateAccountCommand
    public AccountAggregate(CreateAccountCommand createAccountCommand) {
        // Perform validations:
        AccountCreatedEvent accountCreatedEvent = new AccountCreatedEvent();

        BeanUtils.copyProperties(createAccountCommand, accountCreatedEvent);

        AggregateLifecycle.apply(accountCreatedEvent);
    }

    // default Constructor
    public AccountAggregate() {}

    @EventSourcingHandler
    public void on(AccountCreatedEvent accountCreatedEvent){
        this.AccountId = accountCreatedEvent.getAccountId();
        this.currency = accountCreatedEvent.getCurrency();
        this.initialBalance = accountCreatedEvent.getInitialBalance();
    }
}
