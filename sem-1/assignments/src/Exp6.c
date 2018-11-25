#include <stdio.h>
//`Q1: WAP to print binary equivalent of a decimal number using an array.
void Ques1(){
    int binNum[100],c=0,decNum,r;
    printf("enter number :");
    scanf("%d",&decNum);
    while(decNum>0) {
        binNum[c]=decNum%2;
        decNum=decNum/2;
        c++;
    }
    for(int i=c-1;i>=0;i--) {
        printf("%d",binNum[i]);
    }
}

int main(){
    Ques1();
    return 0;
}
