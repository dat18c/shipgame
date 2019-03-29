package dk.kea.shipgame.Model;

public class Weather {
    private int windDirection;
    private int windSpeed;

    public Weather() {
    }

    public Weather(int windDirection, int windSpeed) {
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
    }

    public int getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(int windDirection) {
        this.windDirection = windDirection;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }
}
