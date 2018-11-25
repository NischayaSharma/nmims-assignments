#include <stdio.h>
int main() {
    int amt = 0, numOfNotes = 0, totalNumOfNotes = 0;
    printf("Enter the amount : \n");
    scanf("%d",&amt);
    if(amt>=2000) {
        numOfNotes = amt/2000;
        totalNumOfNotes += numOfNotes;
        printf("Number of 2000 notes : %d\n",numOfNotes);
        amt = amt - (numOfNotes*2000);
    }
    if(amt>=500) {
        numOfNotes = amt/500;
        totalNumOfNotes += numOfNotes;
        printf("Number of 500 notes : %d\n",numOfNotes);
        amt = amt - numOfNotes*500;
    }
    if(amt>=200) {
        numOfNotes = amt/200;
        totalNumOfNotes += numOfNotes;
        printf("Number of 200 notes : %d\n",numOfNotes);
        amt = amt - numOfNotes*200;
    }
    if(amt>=100) {
        numOfNotes = amt/100;
        totalNumOfNotes += numOfNotes;
        printf("Number of 100 notes : %d\n",numOfNotes);
        amt = amt - numOfNotes*100;
    }
    if(amt>=50) {
        numOfNotes = amt/50;
        totalNumOfNotes += numOfNotes;
        printf("Number of 50 notes : %d\n",numOfNotes);
        amt = amt - numOfNotes*50;
    }
    if(amt>=20) {
        numOfNotes = amt/20;
        totalNumOfNotes += numOfNotes;
        printf("Number of 20 notes : %d\n",numOfNotes);
        amt = amt - numOfNotes*20;
    }
    if(amt>=10) {
        numOfNotes = amt/10;
        totalNumOfNotes += numOfNotes;
        printf("Number of 10 notes : %d\n",numOfNotes);
        amt = amt - numOfNotes*10;
    }
    if(amt>=5) {
        numOfNotes = amt/5;
        totalNumOfNotes += numOfNotes;
        printf("Number of 5 coins : %d\n",numOfNotes);
        amt = amt - numOfNotes*5;
    }
    if(amt>=2) {
        numOfNotes = amt/2;
        totalNumOfNotes += numOfNotes;
        printf("Number of 2 coins : %d\n",numOfNotes);
        amt = amt - numOfNotes*2;
    }
    if(amt>=1) {
        numOfNotes = amt/1;
        totalNumOfNotes += numOfNotes;
        printf("Number of 1 coins : %d\n",numOfNotes);
        amt = amt - numOfNotes*1;
    }
    printf("\nTotal number of notes used : %d\n",totalNumOfNotes);
    return 0;
}
