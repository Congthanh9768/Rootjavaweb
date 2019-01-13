// Nhập số liệu cho dãy số thực a0, a1,..., an-1. Hãy liệt kê các phần tử xuất hiện trong dãy đúng 2 lần.
package bai15;

import java.util.Scanner;

public class Bai15 {
 public static int nhap(){
        Scanner input = new Scanner(System.in);
        boolean check  = false;
        int n = 0;
        while(!check){
            System.out.println(" ");
            try{
                n = input.nextInt();
                check = true;
            }catch(Exception e){
                System.out.println("Nhap so khong nhap chu cai,Moi ban nhap lai");
                input.nextLine();
            }
        }
        return (n);
    }
    public static int countElement(int a[],int n,int i){
        int j;
        int count = 0;
        for(j=0; j<n; j++){
            if(a[j] == i)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int i;
        System.out.println("Nhap so ph tu cua mang n: ");
        int n = nhap();
        int [] a =  new int[n+1];
        for(i = 0;i< n; i++){
            System.out.println("Nhap phan tu thu " +(i+1)+" = ");
            a[i] = nhap();
        }
        //tim phan tu xuat hien 2 lan trong day
        System.out.println("Cac phan tu xuat hien 2 lan trong day la: ");
        for(i=0; i< n ;i++)
        {
            if(countElement(a , i , a[i])==0)
                  System.out.println("Phan tu "+a[i]+ " xuat hien "+countElement(a, n, a[i])+" lan");
        }
    }
    
}
