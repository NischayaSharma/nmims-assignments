#include<stdio.h>
int main() {
    int x=0, y=0, z=0;
    printf("Enter the values of the sides of the triangle:\n");
    scanf("%d%d%d",&x,&y,&z);
    if (x+y>z&&y+z>x&&x+z>y) {
        printf("The Triangle exists.\n");
        if(x==y&&y==z) {
            printf("The triangle is equilateral.");
        }
        else if(x==y||y==z||z==x) {
            printf("The triangle is isosceles.");
        }
        else {
            printf("The triangle is scalene.");
        }
    }
    else {
        printf("The triangle does not exist.");
    }
}
