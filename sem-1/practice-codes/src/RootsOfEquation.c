#include <stdio.h>
#include <math.h>
int main() {
    double a=0,b=0,c=0,root1=0,root2=0;
    printf("Enter \n");
    printf("a:");
    scanf("%d",&a);
    printf("b:");
    scanf("%d",&b);
    printf("c:");
    scanf("%d",&c);
    root1=(-b + sqrt((b*b)-(4*a*c)))/(2*a);
    root2=(-b - sqrt((b*b)-(4*a*c)))/(2*a);
    printf("The 1st root is %lf",root1);
    printf("\nThe 2nd root is %lf",root2);
}
