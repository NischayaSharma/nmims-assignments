//write a program to evaluate and display the result
//x^2 + 2y^3 * 2z
//x + y^2 + z^3
#include <stdio.h>
int main(){
    int x=0,y=0,z=0,result1=0,result2=0;
    printf("Enter the value of\n");
    printf("x:");
    scanf("%d",&x);
    printf("y:");
    scanf("%d",&y);
    printf("z:");
    scanf("%d",&z);
    result1=x*x+2*y*y*y*2*z;
    result2=x+y*y+z*z*z;
    printf("The result1 is: %d",result1);
    printf("\nThe result2 is: %d",result2);
    return 0;
}
