package loop;

public class continue1 {

	public static void main(String[] args) {
	Marlabs:	for(int i=0;i<6;i++)
		{
			System.out.println(i);
			if(i==4)
		    continue Marlabs;
		}

	}

}
