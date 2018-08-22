package convert;

public class CelciusConvert implements Convert{

	@Override
	public double convertTo(double source, Mesure m) {
		if(m instanceof CelciusMesure) {
			return source;
		}else {
			double r = (source - 32)/1.8;
			return r;	
		}
	}

}
