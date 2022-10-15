import java.io.*;

class testreturn{
	void returnstat(){
		for(int i=1;i<=3;i++){
			System.out.println("x is: "+i);
			for(int y=1;y<=3;y++){
				System.out.println("y is: "+y);
				for(int z=1;z<=10;z++){
					System.out.println("z is: "+z);
					if(z==3){
						//break;
						return;
					}
				}
			}	
		}
	}
}

class eh{
	public static void main(String[] args){
		String len = null;

		try{
			if (len.equals("hello"))
				System.out.println("Same length");
			else
				System.out.println("Not same");
		}
		catch(NullPointerException e){
			System.out.println("\nNullPointerException found !!!\n");
		}

		finally{
			System.out.println("Display inspite of NullPointerException !!!");
		}

		//code for explicit return 
		testreturn obj = new testreturn();

		obj.returnstat();
		System.out.println("Execution is now returned to main()");
	}
}

//an explicit return statement followed by a finally block that displays "display inspite of return"