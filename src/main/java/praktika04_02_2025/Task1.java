package praktika04_02_2025;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            arrayList.add(random.nextInt(50));
        }
        System.out.println(arrayList);
        System.out.println("________________");

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        ArrayList arrayList1 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            int o = (int) arrayList.get(i);
            if (o < 20) {
                arrayList1.add(o);
            }
//            var o = arrayList.get(0);
        }
        System.out.println(arrayList1);

        int sum = 0;
        for (int i = 0; i < arrayList1.size(); i++) {
            int o = (int) arrayList1.get(i);
            sum += o;
        }
        System.out.println("summa" + sum);

        for (int i = 0; i < arrayList1.size(); i = i + 3) {
            System.out.println(arrayList1.get(i));
        }
        System.out.println();
        for (int i = 0; i < arrayList1.size() / 2; i++) {
            System.out.println(arrayList1.get(i) + " , " + arrayList1.get(arrayList1.size() - 1 - i) + " ");
        }

        }
    }

