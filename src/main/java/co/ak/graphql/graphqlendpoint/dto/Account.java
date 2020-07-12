package co.ak.graphql.graphqlendpoint.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account
{
   private String accountType;
   private Double balance;
   private Double dues;
}
