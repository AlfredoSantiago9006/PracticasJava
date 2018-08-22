package convert;

public class Mesure {
	private String name;
	private int minValue;
	private int maxValue;
	private int waterFrezze;
	
	public Mesure(String name, int minValue, int maxValue, int waterFrezze) {
		this.name = name;
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.waterFrezze = waterFrezze;
	}
	
}
