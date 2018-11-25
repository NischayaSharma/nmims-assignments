//
#include <stdio.h>
int main() {
    int num1;
    printf("Enter a number to check if its divisible by 2 or 3: ");
    scanf("%d",&num1);
    if(num1%2==0&&num1%3==0) {
        printf("%d",num1);
        printf(" is divisible by both 2 and 3.");
    }
    else if(num1%2==0) {
        printf("%d",num1);
        printf(" is divisible by 2.");
    }
    else if(num1%3==0) {
        printf("%d",num1);
        printf(" is divisible by 3.");
    }
    else{
        printf("%d",num1);
        printf(" is not divisible by both 2 and 3.");
    }
}
