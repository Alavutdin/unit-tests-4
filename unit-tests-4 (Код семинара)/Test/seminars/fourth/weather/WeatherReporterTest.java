package seminars.fourth.weather;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class WeatherReporterTest {


    @Test
    void testWeatherReporterReportTest(){
        WeatherService weatherService = mock(WeatherService.class);
        WeatherReporter weatherReporter = new WeatherReporter(weatherService);
        when(weatherService.getCurrentTemperature()).thenReturn(10);

        String temp = weatherReporter.generateReport();

        assertThat(temp).isEqualTo("Текущая температура: " + 10 + " градусов.");

        // сколько раз выполнялся метод
        verify(weatherService,times(1)).getCurrentTemperature();


    }

}