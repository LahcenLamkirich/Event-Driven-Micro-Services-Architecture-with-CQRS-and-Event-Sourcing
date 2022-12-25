package com.lamkirich.comptecqrseventsourcing.commande.api.commands;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@Builder
public class CreateAccountCommand {

    @TargetAggregateIdentifier
    private String AccountId;
    private String currency;
    private double initialBalance;
}
