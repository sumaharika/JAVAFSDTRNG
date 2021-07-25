package practice1;
interface Emp{
int id = 2101;
void getid();
}
class ImplClass implements Emp{
	@Override
public void getid()
{
System.out.println("Employee id is "+ id);

}
}
class Exercise24{
public static void main( String[] arg )
{
ImplClass ob=new ImplClass();
ob.getid();
}
}



