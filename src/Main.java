import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while(true){
            ArrayList<String> listA = new ArrayList<String>();
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
                listA.add(scanner.next());
            }

            System.out.println(listA);
            ArrayList<String> listB = new ArrayList<String>();
            for (int i = 0; i < 5; i++) {
                listB.add(scanner.next());
            }
            System.out.println(listB);
            ArrayList<String> listC = new ArrayList<String>();
            for (int f = 0; f < listB.size(); f++) {
//                A1,B5,А2,Б4,А3,Б3,A4,B2,A5,B1
                listC.add(listA.get(0));
                listC.add(listB.get(4));
                listC.add(listA.get(1));
                listC.add(listB.get(3));
                listC.add(listA.get(2));
                listC.add(listB.get(2));
                listC.add(listA.get(3));
                listC.add(listB.get(1));
                listC.add(listA.get(4));
                listC.add(listB.get(0));

            }
            System.out.println(listC);
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < listC.size(); j++) {
                    try {
                        if (listC.get(j).length() > listC.get(j + 1).length()) {
                            String nextValue = listC.get(j + 1);
                            String previusValue = listC.get(j);
                            listC.set(j, nextValue);
                            listC.set(j+1, previusValue);
                        }
                    } catch (IndexOutOfBoundsException e) {}
                }
            }
            System.out.println(listC);
        }
    }
}