package KlassRodin._15_04_2025Klass;

public class Main {
    public static void main(String[] args) {
        var optional = new DynamicArray<Integer>();
        for (int i = 0; i <= 100 ; i++) {
           optional.add(i);
           if (i%10==0){
               System.out.println(optional);
           }
        }
    }
}
