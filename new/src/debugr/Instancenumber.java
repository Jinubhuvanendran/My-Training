package debugr;

public class Instancenumber
{
	public void numberprint()
	{
	int i=0;
    
	while(i<=10)
{	
	System.out.println(i);
	i++;
}
}
	public static void main(String[] args) {
		
		Instancenumber obj=new Instancenumber();
		System.out.println("start");
			obj.numberprint();
			System.out.println("end");
	}
}



