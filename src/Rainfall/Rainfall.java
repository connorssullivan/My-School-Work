package Rainfall;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rainfall {
    public double[] year;


    public Rainfall(double[] array) {
        double[] thisyear = Arrays.copyOf(array, array.length);
        this.year = thisyear;
    }

    public void printArray() {
        System.out.println(Arrays.toString(this.year));
    }

    public int getHighestMonth() {
        double[] year = Arrays.copyOf(this.year, this.year.length);
        int high = 0;
        for(int i = 0; i < year.length;i++) {
            if(Array.getDouble(year, i) > high) {
                high = i;
            }
        }return high;
    }

    public int getLowestMonth() {
        double[] year = Arrays.copyOf(this.year, this.year.length);
        int low = Integer.MAX_VALUE;
        for(int i = 0; i < year.length;i++) {
            if(year[i] < low) {
                low = i;
            }
        }return low;
    }

    public double getTotalRainFall() {
        double[] year = Arrays.copyOf(this.year,this.year.length);
        int yearLength = year.length;
        double totalRain = 0;

        for(int i=0;i<yearLength;i++) {
            totalRain += year[i];
        }return totalRain;
    }

    public double getAverageRainFall() {
        double[] year = Arrays.copyOf(this.year,this.year.length);
        double yearLength = year.length;
        double average = 0;
        for(int i=0;i<yearLength;i++) {
            average+=year[i];
        }return average/yearLength;
    }

    public double getRainAt(int index) {
        double[] year = Arrays.copyOf(this.year,this.year.length);
        double rain = year[index];
        return rain;
    }



}
