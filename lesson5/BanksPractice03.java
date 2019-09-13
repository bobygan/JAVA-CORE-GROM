package lesson5;

import java.util.Arrays;

public class BanksPractice03 {
    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 150};
      //  withdraw(names, balances, "Jack", -1400);
        System.out.println(Arrays.toString(balances));
        System.out.println( withdraw(names, balances, "Jack", -199));
    }

    public static int faindClientIndexByName(String[] clients, String client) {
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }


    public static int withdraw(String[] clients, int[] balances, String client, int amount) {
        if (amount<0) amount=amount*-1;

        int index = faindClientIndexByName(clients, client);
        if ((balances[index])<0) return -1;
        return  (balances[index]-amount)<0 ? -1:(balances[index]-amount);
    }
}
