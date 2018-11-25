//write a program to accept 3 integer values and apply int typecasting operator and print the answer.
#include<stdio.h>
int main() {
    int a=0, b=0, c=0;
    float d=0.00;
    printf("Enter 3 numbers: \n");
    scanf("%d%d%d",&a,&b,&c);
    d=(a+b+c)/3;
    printf("The average is: %d",(int)d);
}
