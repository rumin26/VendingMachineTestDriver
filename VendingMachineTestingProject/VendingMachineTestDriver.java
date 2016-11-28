import java.util.Scanner;


public class VendingMachineTestDriver {

	public static void main(String[] args) {
		int userOption = 0;
		
		   int ret=-1;

		  VendingMachine obj=new VendingMachine();
		  Scanner in = new Scanner(System.in);
		  
		 
		 while(userOption!=10){
			 
			 System.out.println("Please choose from below options");
			 System.out.println("0. coin()");
			 System.out.println("1. small_cup()");
			 System.out.println("2. large_cup()");
			 System.out.println("3. sugar()");
			 System.out.println("4. tea()");
			 System.out.println("5. insert_large_cups(int n)");
			 System.out.println("6. insert_small_cups(int n)");
			 System.out.println("7. set_price(int p)");
			 System.out.println("8. cancel()");
			 System.out.println("9. dispose()");
			
			 System.out.println("");
			 
			 System.out.println("10. Quit");
			 
			 System.out.println("");
			 
			 System.out.println("********Testing Oriented Methods********");
			 System.out.println("11.show_state()");
			 System.out.println("12.show_all_variables()");
			 
			 System.out.println("");
			 userOption=in.nextInt();
			 
			 switch(userOption){
			 case 0:
				 System.out.println("coin()");
				 ret=obj.coin();
				 System.out.println("The return value="+ret);
				 obj.show_t();
				 obj.show_x();
				 break;
			 case 1:
				 System.out.println("small_cup()");
				 ret=obj.small_cup();
				 System.out.println("The return value="+ret);
				 obj.show_s();
				 obj.show_x();
				 break;
			 case 2:
				 System.out.println("large_cup()");
				 ret=obj.large_cup();
				 System.out.println("The return value="+ret);
				 obj.show_s();
				 obj.show_x();
				 break;
			 case 3:
				 System.out.println("sugar()");
				 ret=obj.sugar();
				 System.out.println("The return value="+ret);
				 obj.show_x();
				 break;
			 case 4:
				 System.out.println("tea()");
				 ret=obj.tea();
				 System.out.println("The return value="+ret);
				 obj.show_x();
				 break;
			 case 5:
				 int large_cups;
				 System.out.println("insert_large_cups(int n)");
				 System.out.println("Enter value of n:");
				 large_cups=in.nextInt();
				 ret=obj.insert_large_cups(large_cups);
				 System.out.println("The return value="+ret);
				 obj.show_k();
				 obj.show_x();
				 break;
			 case 6:
				 int small_cups;
				 System.out.println("insert_small_cups(int n)");
				 System.out.println("Enter value of n:");
				 small_cups=in.nextInt();
				 ret=obj.insert_small_cups(small_cups);
				 System.out.println("The return value="+ret);
				 obj.show_k1();
				 obj.show_x();
				 break;
			 case 7:
				 int set_price;
				 System.out.println("set_price(int p)");
				 System.out.println("Enter value of p:");
				 set_price=in.nextInt();
				 ret=obj.set_price(set_price);
				 System.out.println("The return value="+ret);
				 obj.show_price();
				 obj.show_x();
				 break;
			 case 8:
				 System.out.println("cancel()");
				 ret=obj.cancel();
				 System.out.println("The return value="+ret);
				 obj.show_x();
				 break;
			 case 9:
				 System.out.println("dispose()");
				 ret=obj.dispose();
				 System.out.println("The return value="+ret);
				 obj.show_x();
				 break;
			 case 10:
				 System.out.println("Test Driver is Stopped");
				 System.exit(0);

			 case 11:
				 System.out.println("show_state()");
				 obj.show_state();
				 break;
			 case 12:
				 System.out.println("show_all_variables()");
				 obj.show_all_variables();
				 break;
	
			 default:
				 {
				 System.out.println("Please choose only from the given options!!");
				 System.out.println("Else Enter 10 to quit");
				 }
					 break;
			 }
			 System.out.println("");
			 System.out.println("");
							 
		 }
		 
		 
		 in.close();


	}

}
