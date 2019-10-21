package practice;
import java.util.ArrayList;
import java.util.List;
public class Fibnacci {

	   static void checkPrime(int num)
		{
			int m=0;
			boolean flag= false;
			
			m=num/2;
			if (num==0 || num==1) {
				//System.out.println("Not a Prime Number");
			}
			else {
				for (int i = 2; i < m; i++) {
					if (num%i==0) {
					//	System.out.println("Not a Prime Number");
						flag = true;
						break;
					}
					
				}
				
				if (!flag) {
					//System.out.println("Prime Number");
					System.out.println(num);
				}
			}
			
			
		}
		
	public static void main(String[] args) {
	int a=0, b=1,c = 0;
	int n=50;
	List<Integer> series = new ArrayList<Integer>();
	series.add(a);
	series.add(b);
	//System.out.println(a);
	//System.out.println(b);
	while (c<n) {
		
		c=a+b;
		series.add(c);
		//System.out.println(c);
		a=b;
		b=c;
		
	}

	System.out.println(series);

	for (int i = 0; i < series.size(); i++) {
		Fibnacci .checkPrime(series.get(i));
	}
		}

	}


