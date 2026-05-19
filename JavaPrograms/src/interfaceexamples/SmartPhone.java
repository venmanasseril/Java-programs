package interfaceexamples;

public class SmartPhone implements Camera,Music {
	
	public void photo() {
		System.out.println("Photo captured");
	}
	public void playmusic() {
		System.out.println("Music played");
	}
	
	
	public static void main(String[] args) {
		SmartPhone smartphone =new SmartPhone();
		smartphone.photo();
		smartphone.playmusic();

	}

}
