package com.lamkirich.comptecqrseventsourcing.commande.api.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountCreatedEvent {

    private String AccountId;
    private String currency;
    private double initialBalance;

}
