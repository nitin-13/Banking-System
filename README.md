# *Banking System*  

### This project is about a basic banking system project in Java, emphasizing Object-Oriented Programming (OOP) principles like encapsulation, inheritance, polymorphism, and abstraction.

### *Project Structure:*
``` 
BankingSystem/
├── Account.java
├── SavingsAccount.java
├── CurrentAccount.java
├── Customer.java
├── Bank.java
├── Transaction.java
├── Main.java
├── Exceptions/
│   ├── InsufficientFundsException.java
│   └── InvalidAmountException.java
```  

### *Classes:*

1. Account.java - Represents a general bank account.
- Fields: accountNumber, balance, customer
- Methods: deposit, withdraw, getBalance, getAccountNumber, getCustomer
- OOPS Principles: Encapsulation, Abstraction

2. SavingsAccount.java - Represents a savings account with interest.
- Fields: interestRate, inherited from Account
- Methods: addInterest, inherited from Account
- OOPS Principles: Inheritance, Polymorphism

3. CurrentAccount.java - Represents a current account with overdraft limit.
- Fields: overdraftLimit, inherited from Account
- Methods: inherited from Account
- OOPS Principles: Inheritance, Polymorphism

4. Customer.java - Represents a bank customer.
- Fields: name, address, phoneNumber
- Methods: getName, getAddress, getPhoneNumber, setName, setAddress, setPhoneNumber
- OOPS Principles: Encapsulation, Abstraction

5. Bank.java - Represents a bank with a list of customers and accounts.
- Fields: customers, accounts
- Methods: addCustomer, removeCustomer, findCustomer, addAccount, removeAccount, findAccount, performTransaction
- OOPS Principles: Encapsulation, Abstraction

6. Transaction.java - Represents a transaction between two accounts.
- Fields: accountNumber, type, amount

7. Exceptions - Contains custom exception classes.
- InsufficientBalanceException.java - Thrown when a withdrawal is attempted with insufficient funds.
- InvalidAmountException.java - Thrown when an invalid amount is used in a transaction.

8. Main.java - Contains the main method to run the program.  

### *OOPS Principles Demonstrated:*
1. Encapsulation - Data hiding and abstraction.
2. Inheritance - Reuse of code and polymorphism.
3. Polymorphism - Ability to take multiple forms.
4. Abstraction - Hiding the implementation details.

### *Improvements which can be made:*
- Database Integration: Store data in a database.
- User Interface: Create a GUI or CLI.
- Transaction History: Implement transaction logging.
- Security: Add authentication and authorization.
- Concurrency: Handle multiple users concurrently.
- Error Handling: Implement robust error handling.
- Unit Tests: Write unit tests for all classes.
- Interest Calculation: Implement more complex interest calculations.
- Account Fees: Add account fees.
- ATM Functionality: Simulate ATM operations.
- Online Banking: Simulate online banking.