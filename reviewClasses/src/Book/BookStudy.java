package Book;

public class BookStudy {
	
String b1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Siyar";
		
		int a=-21;
		if (a%2!=0) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}
		
		char ch[]={'s','t','r','i','n','g','s'};
		String s2=new String(ch);
		System.out.println(ch);
		
BookStudy num=new BookStudy();
System.out.println(num.VAR(40));//=20
name ="mehmet";
num.b1 ="kk";
	}
	

	double VAR(int a) {
		int b=a/2; 
		return b; 
		
	}
	void hi ()
			{
				b1="boy";
				b1="girl";
			}
}
