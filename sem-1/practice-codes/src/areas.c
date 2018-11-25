//write a program to calculate area of circle, triangle, rectangle
#include<stdio.h>
int main() {
    int ch;
    double ar,a,b;
    printf("Enter the choice to find the area of \n1)Circle\n2)Triangle\n3)Rectangle\n");
    scanf("%d",&ch);
    if(ch==1) {
        printf("Enter the radius:");
        printf("\n");
        scanf("%lf",&a);
        ar=3.14*a*a;
    }
    else if(ch==2) {
        printf("Enter the Base and the Height:");
        printf("\n");
        scanf("%lf%lf",&a,&b);
        ar=0.5*a*b;
    }
    else if(ch==3) {
        printf("Enter the Length and breadth:");
        printf("\n");
        scanf("%lf%lf",&a,&b);
        ar=a*b;
    }
    else {
        printf("Wrong Choice!!!");
    }
    printf("The area is %lf",ar);
}
