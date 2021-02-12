package com.iu.j3;

import com.iu.j4.Student;

public class WeatherInput {
	public Weather[] printAll() { //1번 누르면 오는것.
	Weather [] weather = new Weather[5];
	//for문 돌려서 지역,날씨,기온,강수량,풍향을 입력?
	for(int i=0; i<weather.length; i++) {
	Weather weather1 = new Weather(); //반복될때마다 새 객체생성 후 그안에 정보저장, array각 칸에 저장됨.
	weather1.place = "서울";
	weather1.currentWeather = "맑음";
	weather1.degree = 25.0;
	weather1.rain = 60 +"%";
	weather1.wind = 7+"m/s";
	weather[0] = weather1;
	System.out.println(weather[0]);
	}
	
		return students; //주소를 찾을 수 있게 주소를 return
}
	
	
}
