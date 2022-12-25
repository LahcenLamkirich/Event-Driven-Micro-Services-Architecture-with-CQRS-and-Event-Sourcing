package com.lamkirich.comptecqrseventsourcing.commande.api.controller;

import com.lamkirich.comptecqrseventsourcing.commande.api.commands.CreateAccountCommand;
import com.lamkirich.comptecqrseventsourcing.commande.api.model.AccountRestModel;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/accounts")
public class AccountCommandController {
    private CommandGateway commandGateway ;

    public AccountCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping
    public String addAccount(@RequestBody AccountRestModel accountRestModel){

        CreateAccountCommand createAccountCommand =
                CreateAccountCommand.builder()
                    .AccountId(UUID.randomUUID().toString())
                    .initialBalance(accountRestModel.getInitialBalance())
                    .currency(accountRestModel.getCurrency())
                    .build();

        String response = commandGateway.sendAndWait(createAccountCommand);

        return response;
    }
}
