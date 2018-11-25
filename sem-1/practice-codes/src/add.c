#include<stdio.h>
int main()
{
    int a,b,c,d;
    printf("Area to be calculated\n1.Circle\n2.Triangle\n3.square\n4.Rectangle :");
    scanf("%d",&d);
    switch(d)
    {case 1: printf("\nYou have choose Circle");
            printf("\nEnter radius:");
            scanf("%d",&a,);
            c=3.14*a;
            printf("\nArea is:%d",c);
            break;

     case 2: printf("\nYou have choose Triangle");
            printf("\nEnter base and radius:");
            scanf("%d%d",&a&b,);
            c=0.5*a*b;
            printf("\nArea is:%d",c);
            break;
     case 3: printf("\nYou have choose Square");
            printf("\nEnter sides:");
            scanf("%d",&a);
            c=a*a;
            printf("\nArea is:%d",c);
            break;
    default : printf("\nTHANK YOU");}
return 0;
}
