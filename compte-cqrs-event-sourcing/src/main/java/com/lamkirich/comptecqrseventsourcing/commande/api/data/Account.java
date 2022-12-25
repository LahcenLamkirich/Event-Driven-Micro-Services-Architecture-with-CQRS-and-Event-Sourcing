package com.lamkirich.comptecqrseventsourcing.commande.api.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    private String AccountId;
    private String currency;
    private double initialBalance;
}
