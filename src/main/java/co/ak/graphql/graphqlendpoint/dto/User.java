package co.ak.graphql.graphqlendpoint.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
public class User
{
   private Long id;
   private String name;
   private String city;
   private Account account;

   //Balance of all accounts
   private BigDecimal totalBalance;
}
