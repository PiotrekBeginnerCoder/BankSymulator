import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BankAccount {
    public Scanner inputUserData = new Scanner(System.in);
    
    String fName;
    String lName;
    String Email;
    int numberTelephone;
    int PESEL;
    LocalDate localDate = LocalDate.parse("yyyy-MM-dd");
    String accountNumber;
    double balanceAccounts = 0;
    
    public BankAccount(String firstname, String lastName, String emailUser, int numberTelephoneUser, int peselUser, String accountNumberUsers, double balanceAccounts){
        fName = firstname;
        lName = lastName;
        Email = emailUser;
        numberTelephone = numberTelephoneUser;
        PESEL = peselUser;
        accountNumber = accountNumberUsers;
        this.balanceAccounts = balanceAccounts;
    }

    

    public void setUserFirstName(){
        System.out.println("Podaj swoje Imie:");
        String firstNameInput = inputUserData.nextLine();
        this.fName = firstNameInput;
    }

    
    public void setUserLastName(){
        System.out.println("Prosze podaj Nazwisko:");
        String lastNameInput = inputUserData.nextLine();
        this.fName = lastNameInput;
    }

    
    



    


    
}