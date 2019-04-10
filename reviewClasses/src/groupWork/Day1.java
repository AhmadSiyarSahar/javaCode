package groupWork;

public class Day1 {

	public static void main(String[] args) {
		String name="Hello Dreamers!"; 
		System.out.println(name);

		int a=20; 
		int b=10; 
		int c=a/b; 
		System.out.println(a/b);
		System.out.println(c); 
		
		int []p= {1, 2, 3, 4, 5, 7, 9, 44, 0};
		 int max=p[0]; 
		 for (int i=0; i<p.length; i++) {
			if (p[i]>max) max=p[i];
		 }
		 System.out.println("Max is "+max);
		 
		 int []s= {1,5,3,9,0,3,22};
		 int maxim=s[0];
		 for (int i=0; i<s.length; i++) {
			 if (s[i]>maxim)maxim=s[i];
		 }System.out.println(maxim);

		 
		 double[]g= {1.2, 2.3, 3.4, 4.5};
		 double maxi=g[0];
		 for (int i=0; i<g.length; i++) {
			 if (g [i]>maxi) maxi=g[i];
			
		 }  
		 System.out.println("The max numb is " +maxi );
		 
		 double[]y= {1.2, 2.3, 3.4, 4.5};
		 double min=g[0];
		 for (int i=0; i<y.length; i++) {
			 if (y[i]<min) min=y[i];
		 } System.out.println(min);
	}

}
