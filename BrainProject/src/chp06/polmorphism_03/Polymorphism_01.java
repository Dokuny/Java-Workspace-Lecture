package chp06.polmorphism_03;

class Father{
	public void play() {
		System.out.println("father:swimming");
	}
	public void study() {
		System.out.println("father:java programming");
	}
}

class Johnharu extends Father{
	public void study() {
		System.out.println("johnharu:C# programming");
	}
}

class Gracedew extends Father{
	public void paly() {
		System.out.println("gracedew:BaseBall");
	}
}

class Moon extends Father{
	public void play() {
		System.out.println("moon:BasketBall");
	}
	public void study() {
		System.out.println("moon:Visual Basic,Visual C++");
	}
}


public class Polymorphism_01 {

	public static void main(String[] args) {
	Father daddy = new Father();

	Johnharu john = new Johnharu();
	john.study();
	john.play();
	
	
	Father jd = new Johnharu();
	jd.play();
	jd.study();
	
	}

}
