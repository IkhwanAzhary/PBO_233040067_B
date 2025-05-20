package pertemuan9;

public class Main {
	public static void main(String[] args) {
		Mobil mobil = new Mobil("Toyota", 2020, 4);
		Motor motor = new Motor("Yamaha", 2021, true);
		
		System.out.println("Informasi Mobil:");
		mobil.infoMobil();
		System.out.println();
		
		System.out.println("Informasi Motor:");
		motor.infoMotor();
	}
}