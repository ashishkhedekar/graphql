package co.ak.graphql.graphqlendpoint.resolver;

import co.ak.graphql.graphqlendpoint.dto.User;
import co.ak.graphql.graphqlendpoint.service.AccountService;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TotalBalanceResolver implements GraphQLResolver<User>
{
   private AccountService accountService;

   public TotalBalanceResolver(AccountService accountService)
   {
      this.accountService = accountService;
   }

   public BigDecimal getTotalBalance(final User user)
   {
      return accountService.getTotalBalance(user.getId());
   }
}
