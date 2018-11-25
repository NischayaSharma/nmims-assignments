//wap to
//read number of students in pps class
//read quiz 1 one marks of all students
//print their sum,avg,max and minimum marks
#include<stdio.h>
int main() {
    int marks=0, sum=0, max=0, min=0, n=0, maxPoss=0;
    float avg=0.00;
    printf("Enter the number of students in class :\n");
    scanf("%d",&n);
    printf("Enter the maximum number of marks :\n");
    scanf("%d",&min);
    maxPoss=min;
    for(int i=1 ; i<=n ; i++) {
        printf("Enter the marks of student %d out of %d: ", i, maxPoss);
        scanf("%d",&marks);
        if(marks>maxPoss) {
            i--;
            printf("Cannot score %d out of %d.\nPlease enter again.\n",marks,maxPoss);
            continue;
        }
        sum += marks;
        max = (max>marks)? max:marks;
        min = (min<marks)? min:marks;
    }
    avg = sum/n;
    printf("Sum = %d\nMax = %d\nMin = %d\nAvg = %f",sum,max,min,avg);
    return 0;
}
