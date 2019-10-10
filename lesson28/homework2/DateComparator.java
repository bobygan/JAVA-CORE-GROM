package lesson28.homework2;

import java.util.Comparator;

public class DateComparator implements Comparator<Capability> {

    @Override
    public int compare(Capability o1, Capability o2) {

        if (o1.getDateCreated().getTime()<o2.getDateCreated().getTime())
            return 1;
        if (o1.getDateCreated().getTime()==o2.getDateCreated().getTime())
            return 0;
        else
        return -1;
    }
}
