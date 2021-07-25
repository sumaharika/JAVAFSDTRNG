package practice1;

public class Exercise8 {

	private String formatnumber(int value) {
		return String.format("%d", value);
	}
private String formatnumber(float value) {
	return String.format("%.3f", value);
}
private String formatnumber(String value) {
	return String.format("%.3f", Double.parseDouble(value));
	
}
public static void main(String[] args) {
	Exercise8 h1=new Exercise8();
	System.out.println(h1.formatnumber(2500));
	System.out.println(h1.formatnumber(2500.34f));
	System.out.println(h1.formatnumber("550"));
}
}
