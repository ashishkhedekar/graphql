package co.ak.graphql.graphqlendpoint.service;

import co.ak.graphql.graphqlendpoint.dto.User;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService
{
   public List<User> getUserDetails(Long id)
   {
      return Collections.singletonList(User.builder().id(id).name("Bob").city("Milton Keynes").build());
   }
}
