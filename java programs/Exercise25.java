package practice1;
interface Emp1{
int eid = 2101;
void geteid();
}
public class Exercise25{
public static void main( String[] arg ){
	Emp1 ob=new Emp1() {
		@Override
		public void geteid() {
			System.out.println("Employee id is" +eid);
		}
};
ob.geteid();
}
}