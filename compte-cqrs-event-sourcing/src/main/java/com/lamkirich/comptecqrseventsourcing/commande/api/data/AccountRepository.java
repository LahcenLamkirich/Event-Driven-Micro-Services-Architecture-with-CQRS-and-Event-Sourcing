package com.lamkirich.comptecqrseventsourcing.commande.api.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
}
