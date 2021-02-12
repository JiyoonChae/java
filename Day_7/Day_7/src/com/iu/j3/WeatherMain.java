
public class WeatherMain {
	public static void main(String[] args) {
		Weather weather = new Weather();
		weather.place = "서울";
		
		Weather weather2 = new Weather();
		weather2.place = "부산";
		
		weather.info();
		System.out.println(weather);
		weather2.info();
		System.out.println(weather2);
}
