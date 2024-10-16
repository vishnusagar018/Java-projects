package MethodOverloading;

public class Addition {
	int add(int x, int y) {
		return x+y;
		
	}
	float add(float x,float y) {
		return x+y;
	}
	double add(double x, double y) {
		return x+y;
	}
	float add(int x, float y) {
		return x+y;
	}
	float add(float x, int y ) {
		return x+y;
	}
   int add(int x, int y, int z) {
	   return x+y+z;
	   
   }
   float add(float x, float y, float z) {
	   return x+y+z;
   }
   double add(double x, double y, double z) {
	   return x+y+z;
   }
   float add(int x, float y, float z) {
	   return x+y+z;
   }
   public static void main(String[] args) {
	int a=10, b=20, c=30;
	float p=1,q=3,r=3;
	double x=11, y=22, z=33;
	Addition m=new Addition();
	System.out.println(m.add(a,b));
	
}
   
}

