public class Counter{
	public static void main(String[] args){
		long i=0;
		while(true){
			i++;
			if (i%1000000==0){
				System.out.println(i);
			}
		}
	}
}