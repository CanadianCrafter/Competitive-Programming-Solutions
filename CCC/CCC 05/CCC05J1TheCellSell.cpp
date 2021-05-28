#include <iostream> 
#include <vector> 
#include <stdio.h>
#include <math.h> 

using namespace std;
int main(){
    
    int d,e,w;
    cin >> d;
    cin >> e;
    cin >> w;
    double a = e*15+20*w;
    double b = 35*e+25*w;
    if(d>100){
        a+=25*(d-100);
    }
    if(d>250){
        b+=45*(d-250);
    }
    printf("Plan A costs %.2f\n",a/100); 
    printf("Plan B costs %.2f\n",b/100);  
    if(a<b){
        cout<<"Plan A is cheapest.";
    }
    else if(b<a){
        cout<<"Plan B is cheapest.";
    }
    else{
        cout<<"Plan A and B are the same price.";
    }
    
        
}