package co.ak.graphql.graphqlendpoint.service;

import co.ak.graphql.graphqlendpoint.dto.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountService
{
   private final Logger LOG = LoggerFactory.getLogger(AccountService.class);

   public Account getAccount(final Long id)
   {
      LOG.info("Fetching account details from accountService , for userId [{}] ", id);
      return Account.builder().accountType("current").balance(20.20).dues(0.00).build();
   }

   public BigDecimal getTotalBalance(final Long id)
   {
      LOG.info("Fetching total balance from accountService , for userId [{}] ", id);
      //Optionally call total balance service - Some random logic
      return BigDecimal.valueOf(id*100);
   }
}
