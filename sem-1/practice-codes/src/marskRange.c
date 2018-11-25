//Write a program to display the class according to
//marks scored by students. The marks scored is taken
//as input and class is displayed according to the range :
//70-100    Distinction(A)
//60-69     First Class(B)
//50-59     Second Class(C)
//40-49     Pass Class(D)
//0-39      Fail(F)
//Subjects are :
//Physics
//Maths
//Biology
//Chemistry
//Computer
#include <stdio.h>
int main() {
    float phy=0,chem=0,math=0,bio=0, comp=0, total=0, percent=0;
    printf("Enter the marks of:\n");
    printf("1.Physics\n");
    scanf("%f",&phy);
    printf("2.Chemistry\n");
    scanf("%f",&chem);
    printf("3.Maths\n");
    scanf("%f",&math);
    printf("4.Computer\n");
    scanf("%f",&comp);
    printf("5.Biology\n");
    scanf("%f",&bio);
    total = phy+chem+math+comp+bio;
    percent=total/5;
    if(percent>=70) {
        printf("Class: Distinction\n");
        printf("Grade: A\n");
    }
    else if(percent<70&&percent>=60) {
        printf("Class: First Class\n");
        printf("Grade: B\n");
    }
    else if(percent<60&&percent>=50) {
        printf("Class: Second Class\n");
        printf("Grade: C\n");
    }
    else if(percent<50&&percent>=40) {
        printf("Class: Pass\n");
        printf("Grade: D\n");
    }
    else {
        printf("Class: Fail\n");
        printf("Grade: F\n");
    }
    printf("%f", percent);
}
