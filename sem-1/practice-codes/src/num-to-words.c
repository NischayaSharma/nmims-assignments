#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <math.h>
int numOfDigits(unsigned long long int num1) {
	int numOfDig=0;
	while(num1!=0) {
        num1=num1/10;
        numOfDig++;
    }
    return numOfDig;
}
void tensDigit(unsigned long long int num){
    switch(num){
        case 1:
            printf(" Ten");
            break;
        case 2:
            printf(" Twenty");
            break;
        case 3:
            printf(" Thirty");
            break;
        case 4:
            printf(" Forty");
            break;
        case 5:
            printf(" Fifty");
            break;
        case 6:
            printf(" Sixty");
            break;
        case 7:
            printf(" Seventy");
            break;
        case 8:
            printf(" Eighty");
            break;
        case 9:
            printf(" Ninety");
            break;
    }
}
void singleDigit(unsigned long long int num){
    switch(num){
        case 1:
            printf(" One");
            break;
        case 2:
            printf(" Two");
            break;
        case 3:
            printf(" Three");
            break;
        case 4:
            printf(" Four");
            break;
        case 5:
            printf(" Five");
            break;
        case 6:
            printf(" Six");
            break;
        case 7:
            printf(" Seven");
            break;
        case 8:
            printf(" Eight");
            break;
        case 9:
            printf(" Nine");
            break;
    }
}
void teenDigit(unsigned long long int num){
    switch(num){
        case 11:
            printf(" Eleven");
            break;
        case 12:
            printf(" Twelve");
            break;
        case 13:
            printf(" Thirteen");
            break;
        case 14:
            printf(" Fourteen");
            break;
        case 15:
            printf(" Fifteen");
            break;
        case 16:
            printf(" Sixteen");
            break;
        case 17:
            printf(" Seventeen");
            break;
        case 18:
            printf(" Eightteen");
            break;
        case 19:
            printf(" Nineteen");
            break;
    }
}
void coreDigits(unsigned long long int num){
   	int numOfDig = 0;
    bool isTeen = false;
    char str[100];
    numOfDig=numOfDigits(num);
    if(numOfDig>=2)
        if((num%100) < 20 && (num%100) > 10)
            isTeen=true;
    switch(numOfDig){
        case 1:
            singleDigit(num%10);
            break;
        case 2:
            if(!isTeen){
                tensDigit(num/10);
                singleDigit(num%10);
            }
            else
                teenDigit(num%100);
            break;
        case 3:
            singleDigit(num/100);
            printf(" Hundred");
            if(!isTeen){
                tensDigit((num/10)%10);
                singleDigit(num%10);
            }
            else
                teenDigit(num%100);
            break;
    }
}
void coreFunction(unsigned long long int num, int numOfDig){
    if(numOfDig>15){
        coreFunction(num/pow(10,15),numOfDigits(num/pow(10,15)));
        printf(" Trillion");
        coreFunction(num%(unsigned long long int)pow(10,15),numOfDigits(num%(unsigned long long int)pow(10,15)));
    }
    else if(numOfDig>12){
        coreDigits(num/pow(10,12));
        printf(" Trillion");
        coreFunction(num%(unsigned long long int)pow(10,12),numOfDigits(num%(unsigned long long int)pow(10,12)));
    }
    else if(numOfDig>9){
        coreDigits(num/pow(10,9));
        printf(" Billion");
        coreFunction(num%(unsigned long long int)pow(10,9),numOfDigits(num%(unsigned long long int)pow(10,9)));
    }
    else if(numOfDig>6){
        coreDigits(num/pow(10,6));
        printf(" Million");
        coreFunction(num%(unsigned long long int)pow(10,6),numOfDigits(num%(unsigned long long int)pow(10,6)));
    }
    else if(numOfDig>3){
        coreDigits(num/pow(10,3));
        printf(" Thousand");
        coreDigits(num%(unsigned long long int)pow(10,3));
    }
    else
    	coreDigits(num);
}

int main(){
    unsigned long long int num;
    int numOfDig;
    printf("Enter a number: ");
    scanf("%llu", &num);
    numOfDig=numOfDigits(num);
    printf("Number: %llu Number of digit: %d\n",num,numOfDig);
    coreFunction(num,numOfDig);
    printf("\n");
}
