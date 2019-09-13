package lesson10.abstractbigexample;

public class Demo {
    public static void main(String[] args) {
        //проверка методов
        Company company = new Company("QWE");
        Company company1 = new Company("");
        Company company2 = new Company(null);

        System.out.println(company.getName());
        System.out.println(company1.getName());
        System.out.println(company2.getName());


        DeveloperEmployee developerEmployee = new DeveloperEmployee();
        developerEmployee.setName("andrii");

        BankAccount bankAccount = new BankAccount(developerEmployee, 23);
        developerEmployee.setBankAccount(bankAccount);
        System.out.println(developerEmployee.getBalance());

        developerEmployee.paySalary();
        System.out.println(developerEmployee.getBalance());


    }
}
