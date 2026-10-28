package OOPS;
class grandparent
{
	int netWorth=10000;
}
class parents extends grandparent
{
		
}
class childs extends parent
{
	void display()
	{
		System.out.println(netWorth);
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		
		childs c=new childs();
		c.display();
		

	}

}


