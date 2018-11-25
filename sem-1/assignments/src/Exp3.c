#include<stdio.h>
#include<stdbool.h>
//Q1: WAP to print the integer part of float number
void ques1(){
    //init variables
    int num1I=0;
    float num1F=0.0;

    //Taking input
    printf("Enter a decimal number:\n");
    scanf("%f",&num1F);

    //Converting
    num1I=(int)num1F;

    //Printing output
    printf("The integer part of %f is %d.\n",num1F,num1I);
}

//Q2: WAP to accept two num and display their and or not and exor results
void ques2(){
    //init variables
    int num1=0, num2=0;

    //taking input
    printf("Enter two numbers:\n");
    scanf("%d%d", &num1, &num2);

    //Printing Output
    printf("%d and %d = %d\n%d or %d = %d\n%d exor %d = %d\nNot %d = %d\nNot %d = %d\n",num1,num2,num1&num2,num1,num2,num1|num2,num1,num2,num1^num2,num1,!num1,num2,!num2);
}

//Q3: WAP to find the largest of 3 nums using conditional operator
void ques3(){
    //init variables
    int num1=0, num2=0, num3=0, max=0;

    //taking input
    printf("Enter three numbers:\n");
    scanf("%d%d%d", &num1, &num2, &num3);

    //calculating
    max=(num1>num2)? (num1>num3)? num1:num3 : (num2>num3)? num2:num3;

    //printing output
    printf("The maximum number of %d, %d and %d is %d",num1, num2, num3, max);
}

//Q4: WAP to input marks and differentiate them on the basis of nmarks out of 100
// Approach - We will use 3x3 array to take inputs and process result.
void ques4(int studentCount, int subjectCount) {
    //init variables
    int arr[studentCount][subjectCount][2];
    const int DISTINCTION = 4;
    const int FIRST_DIVISION = 3;
    const int SECOND_DIVISION = 2;
    const int PASS_CLASS = 1;
    const int FAIL = 0;

    for(int i=0 ; i<studentCount ; i++) {
        for(int j=0 ; j<subjectCount ; j++) {
            printf("Enter marks of student %d subject %d - ",i+1,j+1);
            scanf("%d",&arr[i][j][0]);

            //logic of result
            if(arr[i][j][0]>=70)
                arr[i][j][1]=DISTINCTION;
            else if(arr[i][j][0]>=60)
                arr[i][j][1]=FIRST_DIVISION;
            else if(arr[i][j][0]>=50)
                arr[i][j][1]=SECOND_DIVISION;
            else if(arr[i][j][0]>=40)
                arr[i][j][1]=PASS_CLASS;
            else
                arr[i][j][1]=FAIL;

        }
    }

    //printing output
    printf("Student\tSubject\tMarks\tDivision\n");
    for(int i=0 ; i<studentCount ; i++) {
        for(int j=0 ; j<subjectCount ; j++) {
            printf("%d\t%d\t%d\t",i+1,j+1,arr[i][j][0]);
            switch (arr[i][j][1]){
                case DISTINCTION:
                    printf("Distinction\n");
                    break;
                case FIRST_DIVISION:
                    printf("First Division\n");
                    break;
                case SECOND_DIVISION:
                    printf("Second Division\n");
                    break;
                case PASS_CLASS:
                    printf("Pass\n");
                    break;
                case FAIL:
                    printf("Fail\n");
                    break;
            }
        }
    }
}


int main(){
    //init variable
    bool iterate=true, correctChoice=false;
    char choice;

    while(iterate) {
        //Take input
        printf("\nEnter the question number (from 1 to 4) or X to end: ");
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
                ques4(3,3);
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
