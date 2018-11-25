//write a program to check weather entered character is vowel or consonant
#include<stdio.h>
int main() {
    char c;
    printf("Enter a letter to check if its vowel or not: ");
    scanf("%c",& c);
    if(c=='a'||c=='A'||c=='E'||c=='e'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
        printf("The letter is a vowel.");
    }
    else {
        printf("The letter is a consonant.");
    }
}
