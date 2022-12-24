package com.lamkirich.comptecqrseventsourcing.Commands.controllers;

import com.lamkirich.comptecqrseventsourcing.CommonApi.dtos.CreateAccountRequestDTO;
import org.axonframework.commandhandling.CommandBus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commands/account")
public class AccountCommandController {
    private CommandBus commandBus ;

    public AccountCommandController(CommandBus commandBus) {
        this.commandBus = commandBus;
    }


    @PostMapping("/create")
    public String createAccount(@RequestBody CreateAccountRequestDTO request){
        return "Test";
    }

}
