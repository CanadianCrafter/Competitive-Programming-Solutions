#include <iostream> 
#include <vector> 
#include <stdio.h>
#include <math.h> 

using namespace std;
int main(){
    
    int N;
    cin >> N;
    for(int i =0;i<N;i++){
        int num;
       if(i<=N/2) num = i*2+1;
       else num = (N-i-1)*2+1;
       for(int j=0;j<num;j++)cout<<"*";
       for(int j=0;j<2*N-2*num;j++)cout<<" ";
       for(int j=0;j<num;j++)cout<<"*";
       cout<<"\n";
    }
        
}