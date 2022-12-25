package com.lamkirich.comptecqrseventsourcing.commande.api.events;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

@Component
public class AccountEventHandler {

    @EventHandler
    public void on(AccountCreatedEvent event){

    }
}
