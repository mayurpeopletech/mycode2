package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Shop 
{ static Scanner sc= new Scanner(System.in);
    static double total=0;
    static double bal=0;
    static void display()
    {
    	System.out.println("==============>* WELCOME TO PEOPLETECH STORE * <==============\n");
    	System.out.println("               [ Available Products In The Store ]          ");
		System.out.println("------------------------------------------------------------");
		System.out.println(" [1] Electronics \n [2] Bath \n [3] Kitchen \n [4]Cloths \n [5] Others \n"
				+ "-------------------------------------------------------------");
		System.out.println("Please Enter your choice..?");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			boolean invalid;
			int choice4;
			do { invalid= false;
				System.out.println(" 125------Samsung-----  ₹Price = 25000 \n 126------Apple-------  ₹Price = 50000 \n "
						+ "127------Mi----------  ₹Price = 15000 ");
				System.out.println(" Enter your code:->....");
				choice4 = sc.nextInt();
				 if(!(choice4==125||choice4==126||choice4==127))
				 { System.out.println("Invalid Input Please Try Again ");
					 invalid=true;
			     }
			    }while(invalid);
			meth1(choice4);	
			          }
		switch(choice)
		{ case 2:
			boolean invalid;
			int choice3;
			do {invalid= false;
				System.out.println(" 225--------santoor-------₹:40.00 \n 226--------Fair & Lovely------₹:90.00 "
						+ " \n 227--------Dove shampoo-----₹:50.00 ");
	 			System.out.println("Enter your code:->....");
	 			choice3 = sc.nextInt();
	 			try
	 			{
	 				 Class.forName("com.mysql.cj.jdbc.Driver");
	 		    	 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info","root","root");
	 		    	Statement statement=connection.createStatement();
                    ResultSet set=statement.executeQuery("Select * from product_info.electronic where code='"+choice+"'");
	 			 if(!(choice3==225||choice3==226||choice3==227))
				 {
					 System.out.println("Invalid Input Please Try Again ");
					 invalid=true;
				 }
			    }
	 			catch(Exception e)
	 			{
	 				System.out.println(e);
	 			}}
	 				while(invalid);
	 			
			
	       meth2(choice3);}
		switch(choice){
	case 3:
			boolean invalid;
	        int choice2;
			do {invalid= false;
				System.out.println(" 325------------Spoon ------- = 70.00 \n 326------------Container---- = 400.00 \n "
						+ "327------------Knife-------- = 90.00 ");
				System.out.println("Enter your code:->....");
				choice2=sc.nextInt();
				if(!(choice2==325||choice2==326||choice2==327)){
					 System.out.println("Invalid Input Please Try Again ");
					 invalid=true;}
			}while(invalid);
			meth3(choice2);}
		switch(choice)
		{
			case 4:
				boolean invalid;
				int choice1;
				do {
					invalid=false;
					System.out.println("425-------Jeans ----₹: = 900.00 \n 426-------Trouger--₹: = 1200.00 \n 427-------Kurta_Pajama ₹: = 1500.00");
		 			System.out.println(" Enter your code:->....");
		 			choice1 = sc.nextInt();
		 			if(!(choice1==425||choice1==426||choice1==427)){
						 System.out.println("Invalid Input Please Try Again ");
						 invalid=true;
					 }
				}while(invalid);
				meth4(choice1);}
    }
    public static void meth1(int a)
	 {
		 if(a==125)
		 {System.out.println(" Description : Samsung LED is good choice.... \n  Enter how much peace : ");
			 int p=sc.nextInt();
			 total =total+(p*25000.00); }
		 if(a==126){
			System.out.println(" Description : Apple LED is good choice.... \n  Enter how much peace : ");
			int p=sc.nextInt();
			total=total+(p*50000.00);}
		 if(a==127){
			 System.out.println(" Description : Mi LED is good choice.... \n  Enter how much peace : ");
			 int p=sc.nextInt();
			 total=total+(p*15000.00);}
	     }
    static void meth2(int a){
		 if(a==225){
			 System.out.println("Description:  santoor Is A Good Choice....\n Enter A how much you wants : ");
			 int peace=sc.nextInt();	  
			 total=total+(peace*40.00);  }
		 if(a==226){
			 System.out.println("Description:  Fair & Lovely  Is A Good Choice....\n Enter A how much you wants :");
			 int peace=sc.nextInt();
			 total=total+(peace*90.00); }
		 if(a==227){
			 System.out.println("Description: Dove shampoo Is A Good Choice....\n Enter A how much you wants :");
			 int peace=sc.nextInt();
			 total=total+(peace*50.00);  }
    }
    static void meth3(int a){
		 if(a==325) {
			 System.out.println("Description: Spoon Is A Good Choice....\n Enter A how much you wants :");
				 int q= sc.nextInt();
				 total=total+(q*70.00);  }
		 if(a==326) {
			 System.out.println("Description: Container Is A Good Choice....\n Enter A how much you wants :");
				 int q = sc.nextInt();
				 total=total+(q*400.00);}
		 if(a==327) {
			 System.out.println("Description: Knife Is A Good Choice....\n Enter A how much you wants :");
				 int q= sc.nextInt();
				 total=total+(q*90.00);   }
		 }
    static void meth4(int a){
		 if(a==425) {
			 System.out.println("Description: Jeans Is A Good Choice....\n Enter A how much jeans  you wants :");
				 int p = sc.nextInt();
				 total=total+(p*900.00);}
		 if(a==426) {
			 System.out.println("Description: Trouger Is A Good Choice....\n Enter A how much trouger  you wants :");
			 int p=sc.nextInt();
			 total=total+(p*1200.00);}
		 if(a==427){
			 System.out.println("Description: Kurta_Pajama Is A Good Choice....\n Enter A how much Kurta_Pajama  you wants :");
			 int p=sc.nextInt();
			 total=total+(p*1500.00);  }
		 }    
    public static void main(String[] args) {
		int choice;
		Shop aobj= new Shop();
		System.out.println(" Please Enter your Available Balance Or Your Fixed Budget :");
		bal=sc.nextDouble();
		do { display();		
			boolean invalid;
			{  do {
				invalid=false; 
				System.out.println("Do You Want To Purchase More");
				System.out.println("Continue Press 1\nPress 2 for Exit");
				choice=aobj.sc.nextInt();
				if(!(choice==1||choice==2)){
					System.out.println("Invalid Input Please Try Again  ");
					invalid=true;  }
			} while(invalid);	}
		}while(choice==1);
		if(bal>total) {		
		System.out.println("-----------------------------------------------------");
		System.out.println("    Before Disscount Your Total Bill :- "+aobj.total);
		System.out.println("======THANK YOU FOR SHOPPING YOU HAVE SAVED MONEY===== " );	
		if(aobj.total>=5000) {
			double dis =(aobj.total/100)*10;
			aobj.total=aobj.total-dis;	
			System.out.println("_______Your Disscount %10 is :-    "+dis +" \n------After Disscount Final Total Bill :- " +aobj.total);
			System.out.println("\n======THANK YOU FOR SHOPPING YOU HAVE SAVED MONEY " +dis+"....");
			bal=bal-total;
			System.out.println("\n======Available Balance is your : "+bal);
		                     }	
           }else {
			       System.out.println("  Sorry Your Balance is not sufficient For your bill \n Thank You For Came to Our Shop :\n");aobj.display();
                 }
       }
}
