#include <iostream> 
#include <vector> 

using namespace std;
bool arr [3];
int main(){
    for(int i =0;i<2;i++){
        string str;
        cin >> str;
        if(str == "RED")arr[0]=true;
        else if(str=="BLUE")arr[1]=true;
        else if(str == "WHITE")arr[2]=true;
    }
    if(!arr[0])cout << "RED";
    else if(!arr[1])cout << "BLUE";
    else if(!arr[2])cout << "WHITE";

    return 0;
}