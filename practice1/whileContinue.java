package practice1;

public class whileContinue {

	public static void main(String[] args) {
	int i=0;
	while(i++ <10) {
		if(i % 2 !=0) 
			continue;
		System.out.println(i);
	}

	}

}
