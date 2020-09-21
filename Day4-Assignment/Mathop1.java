class MathOperation{
	static void sum(int i,int j){
		int k=i+j;
		System.out.println(k);
	}static void sum1(int i,int j){
		int k=i-j;
		System.out.println(k);
	}
	static void sum2(int i,int j){
		int k=i*j;
		System.out.println(k);
	}
	 static void power(int x, int y){
		 double result = Math.pow(x,y);
		 System.out.println(result);
		 }
}
		 class Demo{
			 public static void main(String args[]){
				 MathOperation.sum(12,13);
				 MathOperation.sum1(25,12);
				 MathOperation.sum2(5,10);
				 MathOperation.power(2,3);
			 }
}
