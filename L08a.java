public class L08a{
	public static void main (String[] args) {
		String a = "hello world";
		String b = "hello world";
		System.out.println("class ="+ a.getClass());
		System.out.println("a hashcode ="+ a.hashCode());
		System.out.println("b hashcode ="+ b.hashCode());
		System.out.println("a.equals(b): "+ a.equals(b));
		System.out.println("a==b: "+ (a==b));
	}
}