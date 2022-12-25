package com.lamkirich.comptecqrseventsourcing.commande.api.events;

import com.lamkirich.comptecqrseventsourcing.commande.api.data.Account;
import com.lamkirich.comptecqrseventsourcing.commande.api.data.AccountRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountEventHandler {

    private AccountRepository accountRepository;

    public AccountEventHandler(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @EventHandler
    public void on(AccountCreatedEvent event){
        Account account = new Account();
        BeanUtils.copyProperties(event,account);
        accountRepository.save(account);
    }
}
