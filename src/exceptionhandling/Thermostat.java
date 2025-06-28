package exceptionhandling;

class TemperatureTooHighException extends Exception {
    public TemperatureTooHighException(String message) {
        super(message);
    }
}
class TemperatureTooLowException extends Exception {
    public TemperatureTooLowException(String message) {
        super(message);
    }
}
public class Thermostat {
    private static int MIN_TEMP = 50;
    private static int MAX_TEMP = 90;
    public void setTemperature(int temp) throws TemperatureTooHighException, TemperatureTooLowException {
        if (temp > MAX_TEMP) {
            throw new TemperatureTooHighException("Temperature " + temp + " is too high (max " + MAX_TEMP + ")");
        } else if (temp < MIN_TEMP) {
            throw new TemperatureTooLowException("Temperature " + temp + " is too low (min " + MIN_TEMP + ")");
        } else {
            System.out.println("Temperature set to " + temp);
        }
    }
    public static void changeTemperatureLimits(int minTemp, int maxTemp) {
        if(minTemp < maxTemp) {
            MIN_TEMP = minTemp;
            MAX_TEMP = maxTemp;
        }
    }
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        try {
            thermostat.setTemperature(95);
        } catch (TemperatureTooHighException | TemperatureTooLowException e) {
            System.out.println(e.getMessage());
        }
        try {
            thermostat.setTemperature(45);
        } catch (TemperatureTooHighException | TemperatureTooLowException e) {
            System.out.println(e.getMessage());
        }
        try {
            thermostat.setTemperature(75);
        } catch (TemperatureTooHighException | TemperatureTooLowException e) {
            System.out.println(e.getMessage());
        }

        changeTemperatureLimits(0, 100);
        try {
            thermostat.setTemperature(95);
        } catch (TemperatureTooHighException | TemperatureTooLowException e) {
            System.out.println(e.getMessage());
        }
        try {
            thermostat.setTemperature(45);
        } catch (TemperatureTooHighException | TemperatureTooLowException e) {
            System.out.println(e.getMessage());
        }
        try {
            thermostat.setTemperature(75);
        } catch (TemperatureTooHighException | TemperatureTooLowException e) {
            System.out.println(e.getMessage());
        }
    } }