//Write a program to check if a year is a leap year or not
//The year is normally of 365 days but earth takes 365.242199 days
//hence to average it out they made it to 365.25 days
//to reach more closer to the above mentioned time every 100 year is not
//a leap year but every 400 year is a leap year
#include <stdio.h>
int main() {
    int year=0;
    printf("Enter a year to check if it is a leap year or not:");
    scanf("%d",&year);
    if((year%4==0&&year%400==0)||(year%4==0&&year%100!=0)) {
        printf("The year is a leap year.");
    }
    else {
        printf("The year is not a leap year.");
    }
}
