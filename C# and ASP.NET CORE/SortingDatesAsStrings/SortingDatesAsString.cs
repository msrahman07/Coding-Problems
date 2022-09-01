// Online C# Editor for free
// Write, Edit and Run your C# code using C# Online Compiler

using System;
using System.Collections.Generic;
using System.Globalization;
public class HelloWorld
{
    public static void Main(string[] args)
    {   
        List<string> dates = new List<string>() {
            "20 Jan 2020",
            "20 Jan 2021",
            "20 Jan 2022",
            "23 Jan 2023",
            "20 Jan 2023",
            "27 Jan 2023",
            "31 Jan 2023",
            "29 Jul 1999",
            "20 Jul 1999",
            "19 Mar 1999",
            "02 May 1999",
            "20 Feb 1998",
            "29 Jan 1997",
            "19 Jan 1996",
            "02 Feb 1995",
            "02 Jan 1995",
        };
        
        //dates.Sort();
        dates.Sort(CompareDates);
        foreach(string date in dates){
            Console.WriteLine(date+"\n");
        }
    }
    public static int CompareDates(string comparingDate, string comparedToDate){
        string[] comparingDateArray = comparingDate.Split(' ');
        string[] comparedToDateArray = comparedToDate.Split(' ');
        int comparingYear = Int32.Parse(comparingDateArray[2]);
        int comparedYear = Int32.Parse(comparedToDateArray[2]);
        
        if(comparingYear > comparedYear){
            return 1;
        }
        else if(comparingYear == comparedYear){
            Enum.TryParse(comparingDateArray[1], out Months month1);
            Enum.TryParse(comparedToDateArray[1], out Months month2);
            if(month1 > month2){
                return 1;
            }
            else if(month1 == month2){
                Int32.TryParse(comparingDateArray[0], out int day1);
                Int32.TryParse(comparedToDateArray[0], out int day2);
                if(day1 > day2){
                    return 1;
                } else{
                    return -1;
                }
            }
            else{
                return -1;
            }
        }
        else{
            return -1;
        }
        
        return 1;
    }
}

public enum Months {
    Jan=1,
    Feb=2,
    Mar=3,
    Apr=4,
    May=5,
    Jun=6,
    Jul=7,
    Aug=8,
    Sep=9,
    Oct=10,
    Nov=11,
    Dec=12,
}

















