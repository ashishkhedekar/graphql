package co.ak.graphql.graphqlendpoint.resolver;

import co.ak.graphql.graphqlendpoint.dto.Account;
import co.ak.graphql.graphqlendpoint.dto.User;
import co.ak.graphql.graphqlendpoint.service.AccountService;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Service;

@Service
public class AccountResolver implements GraphQLResolver<User>
{
   private AccountService accountService;

   public AccountResolver(final AccountService accountService)
   {

      this.accountService = accountService;
   }

   public Account getAccount(final User user)
   {
      return accountService.getAccount(user.getId());
   }
}
