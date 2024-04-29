import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Random rand = new Random();
    List<Integer> nums1 = new ArrayList<>(); // İlk listemizi olusturdum.
    for(int x=0;x<100;x++) {
        int exp1 = rand.nextInt(); // Rastgele olarak 100 adet sayı olusturup 1.listeye ekledim.
        nums1.add(exp1);
    }
    System.out.println("Birinci liste: " + nums1);
    List<Integer> nums2 = new ArrayList<>(); // İkinci listemizi olusturdum.
    nums2.addAll(nums1);    // Birinci listedeki tüm elemanları ikinci listeye ekledim.
    System.out.println("Kopya liste: " + nums2);
    int exp2 = rand.nextInt(101); // 0-100 arasında sayı üretiyorum.
    nums2.remove(exp2); // Random ürettiğim sayının olduğu indeksteki değeri siliyorum.
    System.out.println("Silinen ikinci liste : " + nums2);
    for (Integer num : nums1) {
        if (!nums2.contains(num)) {
             System.out.println("Eksik Eleman: " + num);
             break;
            }
        }
    }
}