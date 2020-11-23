package observer_pattern;

public class WeatherStation {

	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		
		CurrentCondition currentCondition = new CurrentCondition(weatherData);
		
		weatherData.setMeasurments(28.5f, 50.2f, 66.5f);
		weatherData.setMeasurments(29.5f, 53.2f, 60.5f);
		weatherData.setMeasurments(30.5f, 54.4f, 66.5f);
		
	}

}
