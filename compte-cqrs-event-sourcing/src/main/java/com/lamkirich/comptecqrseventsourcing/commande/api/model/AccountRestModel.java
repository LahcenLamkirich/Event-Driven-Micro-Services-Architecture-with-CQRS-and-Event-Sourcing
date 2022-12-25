package com.lamkirich.comptecqrseventsourcing.commande.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountRestModel {
    private String currency ;
    private double initialBalance ;
}
