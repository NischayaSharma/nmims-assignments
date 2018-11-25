#include <stdio.h>
//Q1: WAP to print employee details like employee number, name, address and phone number.
//Q1 in python: http://tpcg.io/DuV3sx
void ques1() {
    //printing output
    printf("Employee Number: \t12345\nEmployee Name: \t\tNischaya\nEmployee address: \tJuhu\nEmployee Phone Number: \t8160332475");
}

//Q2: WAP to calculate the area of circle, rectangle and triangle.
//
void ques2() {
    //init varables
    int choice=0, radius=0, length=0, height=0;
    float area=0.0;

    //take inputs
    printf("Press the respective number:\n1. Circle\n2. Rectangle\n3. Triangle\n");
    scanf("%d",&choice);

    //Logic
    switch(choice) {
        case 1:
            printf("Enter the radius of the circle :\n");
            scanf("%d",&radius);
            area=3.14*radius*radius;
            break;
        case 2:
            printf("Enter the length and the breadth :\n");
            scanf("%d%d",&length,&height);
            area=length*height;
            break;
        case 3:
            printf("Enter the Length of base and height :\n");
            scanf("%d%d",&length,&height);
            area=0.5*length*height;
            break;
        default:
            printf("Wrong choice !!!!!!");
            break;
    }

    //Print output
    printf("The area is %f.",area);
}

//Q3: WAP to calculate the following expressions:
//      1.  2x^3 + x^2 + 2x + 3
//      2.  x + y^2 + z^3
void ques3() {
    //init variables
    int x=0, y=0, z=0, result1=0, result2=0;

    //take input
    printf("Enter the values of x, y and z:\n");
    scanf("%d%d%d",&x,&y,&z);

    //Calculate
    result1 = 2*x*x*x + x*x + 2*x + 3;
    result2 = x + y*y + z*z*z;

    //Print result
    printf("Result 1 = %d\nResult 2 = %d\n",result1,result2);
}

//Q4: WAP to swap two numbers
void ques4() {
    //init varibles
    int x=0, y=0;

    //take input
    printf("Enter 2 numbers : \n");
    scanf("%d%d",&x,&y);

    //calculate
    printf("Before Swapping:\nx = %d\ny = %d\n",x,y);
    x=x+y;
    y=x-y;
    x=x-y;

    //print output
    printf("After Swapping:\nx = %d\ny = %d\n",x,y);
}

//Q5: WAP to print the size of int, float, char double

int main(){
    //init variable
    bool iterate=true, correctChoice=false;
    char choice;

    while(iterate) {
        //Take input
        printf("\nEnter the question number (from 1 to 5) or X to end: ");
        scanf(" %c",&choice);

        //calculate
        switch(choice) {
            case '1':
                printf("\n************Question 1************\n");
                ques1();
                break;
            case '2':
                printf("\n************Question 2************\n");
                ques2();
                break;
            case '3':
                printf("\n************Question 3************\n");
                ques3();
                break;
            case '4':
                printf("\n************Question 4************\n");
                ques4();
                break;
            case '5':
                printf("\n************Question 5************\n");
                ques5();
                break;
            case 'X':
            case 'x':
                printf ("Thanks ... bye !\n");
                iterate = false;
                break;
            default:
                printf("\nWrong choice !!!!!!\n");
                break;
        }
    }
    return 0;
}
