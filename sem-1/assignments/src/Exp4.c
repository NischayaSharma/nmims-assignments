#include<stdio.h>
//Q1: WAP to check if the entered character is a vowel or a consonant
void ques1() {
    //init variable
    char ch;

    //Taking input
    printf("Enter a character:\n");
    scanf(" %c", &ch);

    //Logic
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        //printing result
        printf("%c is a vowel.\n",ch);
    else
        //printing result
        printf("%c is a consonant.\n",ch);
}

//Q2: WAP to check the validity of triangle and then classify it on the basis of its sides
void ques2() {
    //init variables
    int x=0, y=0, z=0;

    //Taking inputs
    printf("Enter the values of the sides of the triangle:\n");
    scanf("%d%d%d",&x,&y,&z);

    //Logic
    if (x+y>z&&y+z>x&&x+z>y) {
        printf("The Triangle exists.\n");
        if(x==y&&y==z) {
            printf("The triangle is equilateral.");
        }
        else if(x==y||y==z||z==x) {
            printf("The triangle is isosceles.");
        }
        else {
            printf("The triangle is scalene.");
        }
    }
    else {
        printf("The triangle does not exist.");
    }
}

//Q3: WAP to find the minimum number of notes or coins of different denominition
//    required for the give amount(Rs. 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1)
void ques3(){
    //int variables
    int amount=0, numOfNotes=0, totalNumOfNotes=0;
    int denominitions[10] = {2000,500,200,100,50,20,10,5,2,1};

    //taking input
    printf("Enter a amount to know its breakdown - ");
    scanf("%d", &amount);

    //logic
    for(int i=0 ; i<10 ; i++) {
        if(amount>=denominitions[i]){
            numOfNotes=amount/denominitions[i];
            printf("Number of %d's needed are %d.\n",denominitions[i],numOfNotes);
            amount=amount-numOfNotes*denominitions[i];
            totalNumOfNotes+=numOfNotes;
        }
    }
    printf("The total amount of notes needed are %d", totalNumOfNotes);
}

//Q4: WAP to perform operations such as multiply divide add subtract and modulus as per user's choice
void ques4() {
    //init variable
    int num1=0, num2=0, choiceOfOperator=0;

    //taking inputs
    printf("Enter two numbers: ");
    scanf("%d%d", &num1, &num2);
    printf("Enter \n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division\n5 for Remainder\n");
    scanf("%d", &choiceOfOperator);

    //Logic and Printing output
    switch(choiceOfOperator){
        case 1:
            printf("%d + %d = %d",num1,num2,num1+num2);
            break;
        case 2:
            printf("%d - %d = %d",num1,num2,num1-num2);
            break;
        case 3:
            printf("%d * %d = %d",num1,num2,num1*num2);
            break;
        case 4:
            printf("%d / %d = %d",num1,num2,num1/num2);
            break;
        case 5:
            printf("%d mod %d = %d",num1,num2,num1%num2);
            break;
        default:
            printf("!!!!!!!!!!!!!!Wrong choice!!!!!!!!!!!!!!");
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
                ques4();
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
