#include<stdio.h>
#include<math.h>
//Q1: WAP to print the powers of 2 table upto 10
void ques1(){
    for(int i=-10 ; i<=10 ; i++) {
        printf("2 to the power %d is %f\n", i, pow(2,i));
    }
}

//Q2: WAP to ead the number of students in a PPS lecture
//    and take their quiz 1 marks as input and calculate the average
void ques2(){
    //init variables
    int i=0, n=0, mark=0, max=0, min=0, sum=0, avg=0, maxPoss=0;

    //taking inputs
    printf("Enter the number of students in your class: ");
    scanf(" %d", &n);
    printf("Enet ther maximum marks possible: ");
    scanf(" %d", &min);
    maxPoss=min;

    //Logic
    for(i=1 ; i<=n ; i++) {
        printf("Enter the marks of student %d:- ",i);
        scanf(" %d", &mark);
        if(mark>maxPoss){
            printf("You can't score %d out of %d\n", mark, maxPoss);
            i--;
            continue;
        }
        max=(max>mark)? max:mark;
        min=(min<mark)? min:mark;
        sum+=mark;
    }
    avg=sum/n;

    //Printing output
    printf("The maximum marks are %d.\nThe minimum marks are %d.\nThe average is %d.",max,min,avg);
}

//Q3: WAP to

void ques3() {
    //init variables
    int choice=0, balance=500000, cashWithdrawn=0, cashDeposited=0, pin=0, counter=0;

incorrectPin:
    //taking input
    printf("Enter your PIN:\n");
    scanf("%d",&pin);

    //The logic and printing outputs
    if(pin==1703) {
        printf("Your current balance is %d\n",balance);
        printf("Enter your choice:\n1. Check Your Balance\n2. Withdraw Money\n3. Deposit money\n4. Quit\n");
        scanf("%d",&choice);
        switch(choice) {
            case 1:
                printf("Your balance is %d",balance);
                break;
            case 2:
                printf("Enter the amount you want to withdraw:\n");
                scanf("%d",&cashWithdrawn);
                if(balance-cashWithdrawn>=500){
                    printf("Your transaction was successful.\n");
                    printf("Your previous balance was %d\n",balance);
                    balance-=cashWithdrawn;
                    printf("Your current balance is %d\n",balance);
                }
                else {
                    printf("You have to maintain a minimum of Rs.500 in your account.\nThe maximum you can withdraw right now is %d\n",balance-500);
                }
                break;
            case 3:
                printf("Enter the amount you want to deposit in your account:\n");
                scanf("%d",&cashDeposited);
                printf("Your transaction was successful.\n");
                printf("Your previous balance was %d\n",balance);
                balance+=cashDeposited;
                printf("Your current balance is %d\n",balance);
                break;
            case 4:
                break;
            default:
               printf("Invalid Choice!!!!\n");
        }
    }
    else {
        counter++;
        printf("Wrong PIN !!!!!\n");
        if(counter>=4){
            printf("You have entered your PIN wrong 3 times. This program is terminating.");
        }
        else {
            goto incorrectPin;
        }
    }
}

//Q4: Print triangles with * upstraight and up side down
void ques4() {
    //init vriables
    int choiceOfDirection=2, numOfRows=0;

    //Taking input
    printf("Enter the number of rows: ");
    scanf(" %d", &numOfRows);
    printf("Enter 0 for straight triangle and 1 for inverted: ");
    scanf(" %d", &choiceOfDirection);

    //Logic and printing of output
    switch(choiceOfDirection){
        case 0:
            for(int i=1 ; i<=numOfRows ; i++) {
                for(int j=0 ; j<i ; j++) {
                    printf("* ");
                }
                printf("\n");
            }
            break;
        case 1:
            for(int i=numOfRows ; i>=1 ; i--) {
                for(int j=0 ; j<i ; j++) {
                    printf("* ");
                }
                printf("\n");
            }
            break;
        default:
            printf("!!!!!!!!!Wrong Choice!!!!!!!!!");
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
