package com.day1.practice1;

public class TheaterDemo {

    public static void main(String args[]){
        //Calling the method calculateProfit with the provided values
        System.out.println("Profit Earned is: "+calculateProfit(500, 8, 5, 200));

    }

    public static double calculateProfit(double theaterCost,double ticketCostPerAttendee,double movieCostPerAttendee,int numberOfAttendees){
        //declaring variable profit double
        double profit;
        //Calculation of the profit as per the formula
        profit=(ticketCostPerAttendee*numberOfAttendees)-(movieCostPerAttendee*numberOfAttendees)-theaterCost;
        // returning the profit as the method needs to return the double 
        return profit;

    }
    
}