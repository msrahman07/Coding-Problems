package programming.problems;

public class MaxPopulationYear {
    // Brute force: from 1950 to 2050, count all years with number of alive people and get maxAlive and max alive in year
    // public int maximumPopulation(int[][] logs) {
    //     int minYear = 1950;
    //     int maxYear = 2050;
    //     int maxAlive = 0;
    //     int maxAliveYear = 1950;

    //     for(int year=minYear; year<=maxYear; year++) {
    //         int alive = 0;
    //         for(int[] person: logs) {
    //             if(year >= person[0] && year < person[1]) {
    //                 alive++;
    //             }
    //         }
    //         if(alive > maxAlive) {
    //             maxAlive = alive;
    //             maxAliveYear = year;
    //         }
    //     }
    //     return maxAliveYear;
    // }

    // Slight better brute force
    public int maximumPopulation(int[][] logs) {
        int minYear = 1950;
        int maxYear = 2050;
        int[] years = getYearsMap(logs, minYear, maxYear);

        return getMaxYear(years) + minYear;
    }

    private int[] getYearsMap(int[][] logs, int minYear, int maxYear) {
        int[] years = new int[maxYear-minYear+1];

        for(int[] person : logs) {
            incrementYear(years, person[0]-minYear, person[1]-minYear);
        }
        return years;
    }

    private void incrementYear(int[] values, int left, int right) {
        for(int i=left; i<right; i++) {
            values[i]++;
        }
    }
    private int getMaxYear(int[] years) {
        int maxYearIndex = 0;
        for(int i=0; i<years.length; i++) {
            if(years[i] > years[maxYearIndex]) {
                maxYearIndex = i;
            }
        }
        return maxYearIndex;
    }
}
