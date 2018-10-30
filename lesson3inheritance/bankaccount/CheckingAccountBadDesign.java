package lesson3inheritance.bankaccount;

public class CheckingAccountBadDesign extends BankAccount {

    //// ----- DO NOT WRITE EMPTY CLASS LIKE THIS
    public CheckingAccountBadDesign(String type) {
        //super(type);
        type = "Checking";
    }
}
