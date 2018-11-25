//do an atm transaction
//last program of experiment 5
#include<stdio.h>
int main() {
    int choice=0, balance=500000, cashWithdrawn=0, cashDeposited=0, pin=0, counter=0;
    iWantToRunAgain:
    incorrectPin:
    printf("Enter your PIN:\n");
    scanf("%d",&pin);
    if(pin==1703) {
        printf("Your current balance is %d\n",balance);
        invalidChoice:
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
                    printf("You have to maintain a minimum of Rs.500 in your account.\nThe maximum you can withdraw right now is %d\n",balance-500);\
                    goto invalidChoice;
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
                return 0;
                break;
            default:
                printf("Invalid Choice!!!!\n");
                goto invalidChoice;
                break;
        }
        enterValidChoice:
        printf("Do you want to run this code again ?(Enter 1 for yes and 0 for no) \n");
        scanf("%d",&choice);
        if(choice==1) {
           goto iWantToRunAgain;
        }
        else if(choice==0) {
            return 0;
        }
        else{
            printf("Invalid Choice!!!!!\n");
            goto enterValidChoice;
        }
    }
    else {
        counter++;
        printf("Wrong PIN !!!!!\n");
        if(counter>=4){
            printf("You have entered your PIN wrong 3 times. This program is terminating.");
            return 0;
        }
         goto incorrectPin;
    }
}
