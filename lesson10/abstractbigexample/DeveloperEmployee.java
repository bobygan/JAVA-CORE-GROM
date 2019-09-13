package lesson10.abstractbigexample;

public class DeveloperEmployee extends Employee {
    private String[] frameworks = new String[10];


    @Override
    void paySalary() {
        if (getBankAccount()!=null){
        int newBalance = getBankAccount().getBalance() + getSalaryPerMonth() + 1000;
        getBankAccount().setBalance(newBalance);}
        else {
            System.out.println("Cant pay salary Bank Account ");
        }

            }
    }

