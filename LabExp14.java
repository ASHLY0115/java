
import java.util.*;

class Table
{   
	synchronized void printTable(int n)
      { 
    	  for(int i=1;i<=5;i++)
           {  
	           System.out.println(n+"*"+i+"="+n*i);  
	       try
		  	{  
	           Thread.sleep(1000);  
	        }
	        catch(Exception e)
	        {
	        	System.out.println(e);
		  	}  
		         } 
			   } 
			
		        
		      }//end of the method  
		 
		class MyTaba extends Thread
		{
		  int d ;  
			Table t; 
			int g;
		   MyTaba(Table t,int g)
		   {
			   this.t=t;
			   d=g;
			     
			   }  
		   public void run( )
		   {  
			   
			    t.printTable(d);  
		   }       
		} 
		 class MyTabn extends Thread
		{  
			 int e;
			 
			 Table t;  
		   MyTabn(Table t,int f)
		   { 
			   this.t=t;
			   e=f;
			   }  
		   public void run()
		   {
			   t.printTable(e);  
		   }  
		} 
		 class MyTab3 extends Thread
		 {  
		 	 int p;
		 	 
		 	 Table t;  
		    MyTab3(Table t,int q)
		    { 
		 	   this.t=t;
		 	   p=q;
		 	   }  
		    public void run()
		    {
		 	   t.printTable(p);  
		    }  
		 }
			
		 public class LabExp14 {

				public static void main(String[] args) {
				
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the table to be found first");
				int c =sc.nextInt();
				System.out.println("Enter the table to be found second");
				int n =sc.nextInt();
				System.out.println("Enter the table to be found third");
				int m =sc.nextInt();
				Table obj = new Table();//only one object  
				 MyTaba s = new MyTaba(obj,c); 
				  MyTabn t=new    MyTabn(obj,n);  
				  MyTab3 o =new    MyTab3(obj,m);
				   s.start();
				 // o.start();
				   t.start(); 
				  o.start();
				  sc.close();
				   
			}

		

	}