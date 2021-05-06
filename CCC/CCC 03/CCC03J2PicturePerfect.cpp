#include <iostream> 
#include <vector> 
#include <stdio.h>
#include <math.h> 

using namespace std;
int main(){
    int C=0;
   
    while(true){
        cin>>C;
        if(C==0) return 0;
        for(int i = (int) sqrt(C);i>0;i--){
            if(C%i==0){
                int b = C/i;
                printf("Minimum perimeter is %d with dimensions %d x %d\n",2*(b+i),i,b);
                break;
            }
        }  

    }

}