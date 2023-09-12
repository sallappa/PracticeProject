package practiceProjects;

public class AccessModifier {
	private int privatevar = 10; 
    int defalutvar = 20; 
    protected int protectedvar = 30; 
    public int publicvar = 40; 

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();

        // Accessing private data member
        // This can access only with in the class
         System.out.println(obj.privatevar);

        // Accessing default data member
        System.out.println(obj.defalutvar);

        // Accessing protected data member
        System.out.println(obj.protectedvar);

        // Accessing public data member
        System.out.println(obj.publicvar);
    }

}
class icon{
	public static void main(String[] args) {
		AccessModifier acc=new AccessModifier();
		System.out.println(acc.defalutvar);
		System.out.println(acc.protectedvar);
		System.out.println(acc.publicvar);
		//private variable cannot access outside of the class
		//System.out.println(acc.privatevar);
	}
}
