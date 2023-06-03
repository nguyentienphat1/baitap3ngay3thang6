import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong phan tu");
        n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap gia tri phan tu : " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("nhap x");
        x= scanner.nextInt();
        int dem=0;
        for (int i=0;i<n;i++){
            if (x==array[i]){
                dem++;
                System.out.println("gia tri x o vi tri : "+i);
            }
        }
        if (dem==0){
            System.out.println("gia tri x khong dung");
        }
    }
}