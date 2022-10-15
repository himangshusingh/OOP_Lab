import java.util.*;

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

class test{
	public static void main(String[] args){
		testreturn obj = new testreturn();

		obj.returnstat();
		System.out.println("Execution is now returned to main()");
	}
}