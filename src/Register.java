import java.util.Scanner;

public class Register {
    Scanner inputUserData = new Scanner(System.in);
    String fName;
    String lName;
    String Email;
    int numberTelephone;
    int PESEL;
    
    public Register(String firstName, String lastName, String Email, int numbetTelUser, int PESELUSER){
        fName = firstName;
        lName = lastName;
        this.Email = Email;
        PESEL = PESELUSER;
    }

    public void setUserFirstName(){
        System.out.println("Prosze podaj Imie:");
        String nameUser = inputUserData.nextLine();
        this.fName = nameUser;
    }

    public void setUserLastName(){
        System.out.println("Prosze podaj Nazwisko:");
        String nameFUser = inputUserData.nextLine();
        this.fName = nameFUser;
    }

    public void setEmailUser(){
        System.out.println("Prosze podaj Email:");
        String emailUser = inputUserData.nextLine();
        this.Email = emailUser;
    }

    public void setUserNrTel(){
        System.out.println("Prosze podaj numer telefonu:");
        int userNrTel = inputUserData.nextInt();
        this.numberTelephone = userNrTel;
    }




}