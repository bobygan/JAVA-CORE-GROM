package lesson10.abstractbigexample;

public abstract class Employee {
    private String name;
    private int age;
    private int yarsOfExperience;
    private String curPosition;
    private int salaryPerMonth;
    private BankAccount bankAccount;
    private Company[] companiesWorked = new Company[10];
    private String[] positionsWorked = new String[10];


    abstract void paySalary();

    void changePosition(String newPosition) {
        //сохранить текущую позицию в историю
        //поменять позцию
        saveCurPositionToHistory();
        curPosition = newPosition;
    }

    private void saveCurPositionToHistory() {
        int index = 0;
        for (String pos : positionsWorked) {
            if (pos == null) {
                positionsWorked[index] = curPosition;
                break;
            }
            index++;
        }
    }


    int getBalance() {
        if (bankAccount==null)
            return 0;   System.out.println("Счет еще не создан операция невозможна");
        return bankAccount.getBalance();
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYarsOfExperience(int yarsOfExperience) {
        this.yarsOfExperience = yarsOfExperience;
    }

    public void setCurPosition(String curPosition) {
        this.curPosition = curPosition;
    }

    public void setSalaryPerMonth(int salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setCompaniesWorked(Company[] companiesWorked) {
        this.companiesWorked = companiesWorked;
    }

    public void setPositionsWorked(String[] positionsWorked) {
        this.positionsWorked = positionsWorked;
    }
}
