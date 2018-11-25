//WAP to find the sum and product of
//all the digits of a user entered number
#include<stdio.h>
int main(){
    int num, sum=0, prod=1, i=1;
    printf("Enter a number :");
    scanf("%d",&num);
    while(i==1){
        sum = sum + (num%10);
        prod = prod * (num%10);
        num = num/10;
        if (num==0)
            break;
    }
    printf("Sum = %d\nProduct = %d\n",sum,prod);
}
o.i,mnt
