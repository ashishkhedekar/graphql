# Setup

1. Just run main class from intellij GraphqlendpointApplication
    * OR from command line run ` ./mvnw spring-boot:run
` 
2. Go to GraphQL Query Screen at http://localhost:9090/graphiql?query

### Few demo queries 

* Query to get User details for id = 6 
```
{
  userDetails(id: 6)
  {
    name
    city
  }
}
 ```

* Query to get total Balance for user - Account service will be only - will use TotalBalanceResolver
```
{
  userDetails(id: 6)
  {
    name
    totalBalance
  }
}
 ```
* Query to get account details - Account service will be used - will use AccountResolver
```
{

  userDetails(id: 6)
  {
    name
    account {
      accountType
      balance
      dues
    }
  }
}
```
