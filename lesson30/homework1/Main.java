package lesson30.homework1;

public class Main {
    public static void main(String[] args) {

        Bank euBank1 = new EUBank(1222, "Poland", Currency.EUR, 100, 1400, 4, 1111111);
        Bank euBank2 = new EUBank(1222, "Poland", Currency.EUR, 100, 1400, 4, 1111111);
        Bank usBank1 = new USBank(1222, "Poland", Currency.EUR, 100, 1400, 4, 1111111);
        Bank usBank2 = new USBank(1222, "Poland", Currency.EUR, 100, 1400, 4, 1111111);
        Bank chinaBank1 = new ChinaBank(1222, "Poland", Currency.EUR, 100, 1400, 4, 1111111);
        Bank chinaBank2 = new ChinaBank(1222, "Poland", Currency.EUR, 100, 1400, 4, 1111111);




        User user1 = new User(111, "Andrii", 1000, 4, "BSF", 100, euBank1);
        User user2 = new User(112, "Andrii", 1000, 4, "BSF", 100, euBank1);
        User user3 = new User(113, "Andrii", 2345, 4, "BSF", 100, usBank1);
        User user4 = new User(114, "Andrii", 2345, 4, "BSF", 100, usBank2);
        User user5 = new User(115, "Andrii", 2345, 4, "BSF", 100, chinaBank1);
        User user6 = new User(116, "Andrii", 2345, 4, "BSF", 100, chinaBank2);




        BankSystem bankSystem = new UkrainianBankSystem();

        //Sys.out.println(user1.getBalance());
       // bankSystem.withdraw(user1, 100);
       // Sys.out.println(user1.getBalance());
      //  bankSystem.fund(user1, 100);
        System.out.println(user1.getBalance());
        System.out.println(user2.getBalance());
        bankSystem.transferMoney(user1, user2,100);
        System.out.println(user1.getBalance());
        System.out.println(user2.getBalance());
    }
}
