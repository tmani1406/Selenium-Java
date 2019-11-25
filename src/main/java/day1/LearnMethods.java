package day1;

public class LearnMethods {
	
	public int add(int a, int b) {
		return a+b;
	}
	public void mul(int a, int b) {
		System.out.println(a*b);
	}
		public int sub(int j, int k) {
			//System.out.println(subresult);
			return j-k;
		}
	public static void main(String[] args) {
		LearnMethods cal = new LearnMethods();
		int result = cal.add(5, 10);
		System.out.println(result);
		cal.mul(5, 10);
		//LearnMethods subcal = new LearnMethods();
		int subresult = cal.sub(100, 50);
		System.out.println(subresult);
	}

}
