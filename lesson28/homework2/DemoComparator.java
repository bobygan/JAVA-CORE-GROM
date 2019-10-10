package lesson28.homework2;


import Lesson19.homework.File;

import java.util.*;

public class DemoComparator {
    public static void main(String[] args) {
        Capability capability1 = new Capability(101, "AS", "AS", false, new Date());
        for(int i=0;i<100000000; i++){
            int f=0;
        }
        Capability capability2 = new Capability(106, "ASdf", "AS", true, new Date());
        for(int i=0;i<100000000; i++){
            int f=0;
        }

        Capability capability3 = new Capability(10, "AS", "ASASD", true, new Date());

        for(int i=0;i<100000000; i++){
            int f=0;
        }

        Capability capability4 = new Capability(1000, "AS", "AS", false, new Date());
        for(int i=0;i<100000000; i++){
            int f=0;
        }
        Capability capability5 = new Capability(103, "DFG", "AS", true, new Date());
        for(int i=0;i<100000000; i++){
            int f=0;
        }

        ArrayList<Capability> capabilities = new ArrayList<>();
        capabilities.add(capability1);
        capabilities.add(capability2);
        capabilities.add(capability3);
        capabilities.add(capability4);
        capabilities.add(capability5);


        System.out.println(capabilities);

        capabilities.sort(new IsActiveComparator());

        System.out.println(capabilities);

        capabilities.sort(new DateComparator());

        System.out.println(capabilities);

        capabilities.sort(new FullComparator());

        System.out.println(capabilities);

       // Comparator<Capability> comparator = new Comparator<Capability>() {
     //       @Override
   //         public int compare(Capability o1, Capability o2) {
          //      if (!o1.getChannelName().equals(o2.getChannelName())) {
        //            return o1.getChannelName().compareTo(o2.getChannelName());
      //          }
    //            else if (!o1.getFingerprint().equals(o2.getFingerprint()))
  //                  return o1.getFingerprint().compareTo(o2.getFingerprint());
//
              // else if (!o1.getDateCreated().equals(o2.getDateCreated()))
            //        return o1.getFingerprint().compareTo(o2.getFingerprint());
          //      return 0;
        //    }
      //  };


    }
}
