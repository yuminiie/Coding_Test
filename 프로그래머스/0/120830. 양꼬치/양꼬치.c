#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    int answer = 0;
    if(n >= 10){
            answer = (12000*n) + (2000*(k-n/10));
        }
        else
            answer = n * 12000 + k * 2000;
    return answer;
}