package convert;

public class FahrenheitConvert implements Convert {

	@Override
	public double convertTo(double source, Mesure m) {
		if (m instanceof FahrenheitMesure) {
			return source;
		}else {
			double r = (source *1.8)+32;
			return r;
		}
	}
}
