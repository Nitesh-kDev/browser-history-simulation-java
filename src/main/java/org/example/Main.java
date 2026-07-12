package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       BrowserHistorySimulation browser=new BrowserHistorySimulation();
       Scanner scanner=new Scanner(System.in);
       System.out.println("******************************************");
       System.out.println("Mini project- Browser History Simulation");
       System.out.println("******************************************");

       while(true){
           System.out.println("\n----------Browser Menu----------");
           System.out.println("1. Visit new page");
           System.out.println("2. Go Back");
           System.out.println("3. Go Forward");
           System.out.println("4. Show Current Page");
           System.out.println("5. Exit");

           System.out.println("Enter your choice: ");
           int choice=scanner.nextInt();
           scanner.nextLine();
           switch(choice){
               case 1:
                   System.out.println("Enter URL: ");
                   String url=scanner.nextLine();
                   browser.visitPage(url);
                   break;
               case 2:
                   browser.goBack();
                   break;
               case 3:
                   browser.goForward();
                   break;
               case 4:
                   browser.showCurrentPage();
                   break;
               case 5:
                   System.out.println("Exiting Browser.....");
                   return;
               default:
                   System.out.println("Invalid choice- please try Again");
           }
       }
    }
}