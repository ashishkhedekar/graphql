package co.ak.graphql.graphqlendpoint;

import co.ak.graphql.graphqlendpoint.resolver.Query;
import co.ak.graphql.graphqlendpoint.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlendpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlendpointApplication.class, args);
	}

	@Bean
	public Query query(final UserService userService) {
		return new Query(userService);
	}
}
