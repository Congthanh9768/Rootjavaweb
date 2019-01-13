

// Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ cơ số b bất kì (1< b≤ 36)
package bai2;

import java.util.Scanner;

public class Bai2 {

    public static int nhap(){
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0 ;
        while(!check){
            System.out.println(" ");
                try{
                    n = input.nextInt();
                    check = true;
                }
                catch(Exception e){
                      System.out.println("ban phai nhap la so,Moi ban nhap lai");
                      input.nextLine();
                }   
            }
        return (n);
    }
    
    
    public static void doicoso(int n,int base){
        if(n > base)
            doicoso(n/ base,base);
        if(n% base >9)
            System.out.printf("%c",n%base+55); 
        else 
            System.out.print((n %base)); 
    }
    
    
    public static void main(String[] args) {
       System.out.println("nhap n: ");
       int n = nhap();
       System.out.println("nhap  co so: ");
       int b = nhap();
       
       System.out.printf("So "+ n + " chuyen sang co so " + b +" la : ");
       doicoso(n,b);
       System.out.println("\n"); 
    }
}

