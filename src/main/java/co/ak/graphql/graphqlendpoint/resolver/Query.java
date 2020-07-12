package co.ak.graphql.graphqlendpoint.resolver;

import co.ak.graphql.graphqlendpoint.dto.User;
import co.ak.graphql.graphqlendpoint.service.UserService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.List;

public class Query implements GraphQLQueryResolver
{
   private final UserService service;

   public Query(UserService userService) {
      this.service = userService;
   }

   public List<User> userDetails(final Long id)
   {
      // will only retrieve user specific information from UserService
      return service.getUserDetails(id);
   }
}
