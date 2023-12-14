class Solution {
    public double[] convertTemperature(double celsius) {
        double[] temps = new double[1];
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 1.80) + 32.00;
        temps[0] = kelvin;
        temps[1] = fahrenheit;

        return temps;
    }
}