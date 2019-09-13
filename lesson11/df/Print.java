package lesson11.df;

public class Print{

    public void printing(Room[] roomprint) {
        if (roomprint==null){
            System.out.println("нет совпадений");
            return;
        }
        for (Room print : roomprint) {
            if (print==null){
                System.out.println("якась херня");
                return;}
            System.out.println("/Гостиница-" + print.getHotelName() + "  /Город-" + print.getCityName()
                    + "  /Количество гостей- " + print.getPersons()+ "  /Цена- "+ print.getPrice());
        }
        System.out.println();
    }
    public void printing(Room print) {
        if (print==null){
            System.out.println("нет совпадений");
            return;}

            System.out.println("/Гостиница-" + print.getHotelName() + "  /Город-" + print.getCityName()
                    + "  /Количество гостей- " + print.getPersons()+ "  /Цена- "+ print.getPrice());

        System.out.println();
    }
}
