
public class OOPs {

		int model;
		String make;
		int kmsdriven;
		
		OOPs(int model,String make,int kmsdriven)
		{
			
			this.model = model;
			this.make = make;
			this.kmsdriven= kmsdriven;
		
		System.out.println("the model number of the car is " +model);
		
		}
			
		public static void main(String[] args) {
			
		OOPs C1 = new OOPs(2013,"hyundai",35000);

		}

}
