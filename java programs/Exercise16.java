package practice1;
class car{
	private String carName;
	private String carType;//assign values using constructor
	public car(String name, String type) {
		this.carName=name;
		this.carType =type;
		}
	//private method
	private String getCarName() {
		return this.carName;
		}
	//inner class
	class Engine{
		String engineType;
		void setEngine()
		{
			if(car.this.carType .equals("4WD"))
			{
				if(car.this.getCarName().equals("Crysler")) {
                this.engineType = "Smaller";
            } else {
                this.engineType = "Bigger";
            }

        }else{
            this.engineType = "Bigger";
        }
    }
    String getEngineType(){
        return this.engineType;
    }
}

}
	public class Exercise16 {
	    public static void main(String[] args) {

	// create an object of the outer class Car
	        car car1 = new car("Mazda", "8WD");

	        // create an object of inner class using the outer class
	        car.Engine engine = car1.new Engine();
	        engine.setEngine();
	        System.out.println("Engine Type for 8WD= " + engine.getEngineType());

	        car car2 = new car("Crysler", "4WD");
	        car.Engine c2engine = car2.new Engine();
	        c2engine.setEngine();
	        System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
	    }
	    
	}


