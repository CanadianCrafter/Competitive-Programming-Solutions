#include <iostream> 
#include <vector> 
#include <stdio.h>
#include <math.h> 

using namespace std;
int main(){
    
    int M,N;
    cin >> M;
    cin >> N;
    int ans=0;
    for(int i = M;i<N;i++){
        string original = to_string(i);
        string flipped = "";
        for(int j =original.length()-1;j>=0;j--){
            if(original[j]=='6') flipped.push_back('9');
            else if(original[j]=='9') flipped.push_back('6');
            else if(original[j]=='0') flipped.push_back('0');
            else if(original[j]=='1') flipped.push_back('1');
            else if(original[j]=='8') flipped.push_back('8');
            else break;
        }
        if(original==flipped)ans++;

    }
    cout<<ans;
}