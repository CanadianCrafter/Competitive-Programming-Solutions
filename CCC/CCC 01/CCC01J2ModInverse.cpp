#include <iostream> 
#include <vector> 
#include <stdio.h>
#include <math.h> 

using namespace std;
int main(){
    
    int X,M;
    cin >> X;
    cin >> M;
    int ans=0;
    for(int n = 1;n<M;n++){
       if((X*n)%M==1) {
           cout<<n;
           return 0;
       }

    }
    cout<<"No such integer exists.";
}