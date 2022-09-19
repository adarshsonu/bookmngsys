package com.bookmanagment;
 
import java.util.Scanner;
 

public class booKs {
 
    
    public static void main(String[] args)
    {
 
      
    	Bookmanagement hr= new Bookmanagement();
 
        Record record = new Record();
        
            
        record.setIdNumber(1);
        record.setBookCost(5000);
        record.setName("my world");
 
        hr.add(record);
 
      
        Scanner input = new Scanner(System.in);
 
 
        int option = 0;
 
      
        do {
            menu();
            option = input.nextInt();
 
        
            switch (option) {
 
       
            case 1:
 
            
                System.out.print(
                    "What is the Book id  ? ");
 
                int idNumber = input.nextInt();
 
              
                System.out.print(
                    "What is the Book cost ? ");
 
                int contactNumber = input.nextInt();
                input.nextLine();
 
          
                System.out.print(
                    "What is the Book Name ? ");
 
                String name = input.nextLine();
 
                
                record = new Record(name, idNumber,
                                    contactNumber);
        
                hr.add(record);
                System.out.println(record.toString());
 
              
                break;
 
       
            case 2:
 
            
                System.out.print(
                    "What is the Book id number ? ");
                int rId = input.nextInt();
 
            
                hr.delete(rId);
 
                break;
 
      
            case 3:
 
             
                System.out.print(
                    "What is the Book id number? ");
 
                int rIdNo = input.nextInt();
                hr.update(rIdNo, input);
 
                break;
 
              case 4:
 
              
                System.out.print(
                    "Book id ? ");
                int bookId = input.nextInt();
 
                if (!hr.find(bookId)) {
                    System.out.println(
                        "Book id does not exist\n");
                }
 
                break;
 
       
            case 5:
                hr.display();
                break;
 
         
            case 9:
 
             
                System.out.println(
                    "\nThank you for using the program. Goodbye!\n");
                System.exit(0);
 
                break;
 
         
            default:
 
            
                System.out.println("\nInvalid input\n");
                break;
            }
        }
 
        
        while (option != 9);
    }
 
    public static void menu()
    {
 
     
        System.out.println("MENU");
        System.out.println("1: Add Book");
        System.out.println("2: Delete Book");
        System.out.println("3: Update Book");
        System.out.println("4: Search Book");
        System.out.println("5: Display Book");
        System.out.println("9: Exit program");
        System.out.print("Enter your selection : ");
    }
}