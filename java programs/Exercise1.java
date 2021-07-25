package practice1;

public class Exercise1 {
		int a=9;
		int b=18;
		void m1() {
			a=10;
			b=20;
		}
	}
	class test{
		static void m1(Exercise1[]e) {
			e[1].m1();
		}
	}
		class Array{

		public static void main(String[] args) {
			Exercise1[]ex= {new Exercise1(),new Exercise1(),new Exercise1()};
			test.m1(ex);
			for(int i=0;i<ex.length;i++) {
				System.out.println(ex[i].a + "\t");
				System.out.println(ex[i].b + "\n");
			}

		}

		}
	