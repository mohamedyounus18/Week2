package week2;


		public class School{
			//Two things
			//1. Properties - Variables
			int i=10;
			//2. Behaviours - Methods
			void admission() {//a void method without parameter
				System.out.println("admission done...");
			}
			int feesPayment(int money) {//a returnable method with parameter
				System.out.println("accepts money from you as fees");
				System.out.println("he returns the change....");
				if(money>500) {
					return money-200;
				}
				else if(money==500) {
					return money-150;
				}
				else {
					return money-100;
				}
			}
			int askDonation() {//a returnable method without parameter
				
				return 100;
			}
			public static void main(String[] args) {
				School obj=new School();
				int money=obj.feesPayment(1000);
				System.out.println("The balance is...:"+money);
				
				Human shoiab=new Human();
				shoiab.smile();
				
				School narayana;
				Human taqi=null;
				//taqi.smile();
				
				new Human();//nameless object or anonymous object
				new Human().smile();
			}
		}
		class Human {
			public void smile() {
				System.out.println("smiling is a noble act");
			}
		}
		class Doctor{
			
		}
		// TODO Auto-generated method stub

	


