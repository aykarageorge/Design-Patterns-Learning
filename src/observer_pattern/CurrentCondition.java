package observer_pattern;

public class CurrentCondition implements Observer, DisplayElement {

	private float currentTemperatue;
	private float currentHumidity;
	private float currentPressure;
	
	Subject weatherData;
		
	public CurrentCondition(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("temperature : " + currentTemperatue);
		System.out.println("humidity : " + currentHumidity);
		System.out.println("pressure : " + currentPressure);

	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.currentHumidity = humidity;
		this.currentPressure = pressure;
		this.currentTemperatue = temp;
		display();
	}

}
