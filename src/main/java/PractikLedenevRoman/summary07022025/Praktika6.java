//package summary07022025;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.ListIterator;
//
//public class Praktika6 {
//    public static void main(String[] args) {
//        removeNamesStartTfromList(names);
//        removeNamesStartTfromList(names);
//        System.out.println(names);
//    }
//
//    public static void removeNamesStartTfromList(List<String> stringList) {
//        ListIterator<String> listIterator = stringList.listIterator(stringList.size());
//        while (listIterator.hasPrevious()) {
//            String str = listIterator.previous();
//            if (str != null && str.startsWith("T")) {
//                listIterator.remove();
//            }
//        }
//    }
//}