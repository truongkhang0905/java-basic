package Day5;

import java.util.ArrayList;
public class ArrayExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("monday");
        arrayList.add("Tuesday");
        arrayList.add("Wed");
        arrayList.add("Thurs");

//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(arrayList.size()-1));
//
//        arrayList.remove(0);
//        int i = 0;
//        while (i<arrayList.size()) {
//            System.out.println(i);
//            arrayList.remove(0);
//        }
        ArrayList<String> deleteAll = new ArrayList<>();
        deleteAll.add("monday");
        deleteAll.add("Wed");
        //System.out.println(arrayList.get(0));
       // System.out.println(arrayList.get(arrayList.size()-1));
       arrayList.removeAll(deleteAll);
        //int count = 0;
        for ( int i = 0; i< arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
            }
        for (String str : arrayList) {
            System.out.println(str);
        }
        }
       // System.out.println("monday: " + count);
    }


