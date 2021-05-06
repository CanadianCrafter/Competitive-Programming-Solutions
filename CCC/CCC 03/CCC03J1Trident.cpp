#include <iostream> 
#include <vector> 
#include <stdio.h>
#include <math.h> 

using namespace std;
int main(){
    int t,s,h;
    cin>>t;
    cin>>s;
    cin>>h;
    string temp1 ="*";
    for(int i =0;i<2;i++){
        for(int j=0;j<s;j++)temp1+=" ";
        temp1+="*";
    }
    for(int i =0;i<t;i++)cout<<temp1+"\n";
    for(int i =0;i<3+2*s;i++)cout<<"*";
    cout<<"\n";
    string temp2=" ";
    for(int i=0;i<s;i++)temp2+=" ";
    temp2+="*";
    for(int i=0;i<h;i++)cout<< temp2+"\n";

}