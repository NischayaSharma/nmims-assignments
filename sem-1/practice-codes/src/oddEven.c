//
#include<stdio.h>
int main() {
    int num1;
    printf("Enter a number to check if its even or odd:\n");
    scanf("%d",&num1);
    if(num1%2==0) {
        printf("The number is even.");
    }
    else {
        printf("The number is odd.");
    }
}
