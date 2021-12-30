package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Phuong trinh tinh so nguyen chan tu 1 - n
		 int a = 0;
		 System.out.println("Nhap n: ");
		 int n =sc.nextInt();
	        for (int i = 1; i <= n; i++) {
	            a += i;
	        }
	    System.out.println("Tong so chan 1 den n: " + n);
	    //Phuong trinh tinh so nguyen le tu 1-n
	    a = 0;
	    System.out.println("Nhap n: ");
		 n =sc.nextInt();
	        for (int i = 1; i <= n; i --) {
	            a += i;
	        }
	   
    System.out.println("Tong so le 1 den n: " + n);
    //viet chuong trinh tinh tong
    System.out.println("Nhap n: ");
    n =sc.nextInt();
	        
    float s = 0;
    for(int i=1; i <= n; i++) {
    	s += 1.0f / i;
    }
    System.out.println("Tong s =" + s);
    //viet chuong trinh tinh tong
    System.out.println("Nhap n: ");
    n =sc.nextInt();
	        
    s = 0;
    for(int i=1; i <= n; i++) {
    	s += 1.0f / i * 2;
    }
    //viet phuong trinh de tinh tong s cac so nguyen chia het cho 3
    System.out.println("Nhap n: ");
    n = sc.nextInt();
    for(int i=1; i <= n; i++) {
    	s += 1.0f / i % 3;
    }
    //viet phuong trinh de tinh tong s cac so nguyen chia het cho 5
    System.out.println("Nhap n: ");
    n = sc.nextInt();
    for(int i=1; i <= n; i++) {
    	s += 1.0f / i % 5;
    }
    
    }
	
}

