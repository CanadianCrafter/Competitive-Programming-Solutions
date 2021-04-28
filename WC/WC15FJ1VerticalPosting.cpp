#include <iostream> 
#include <vector>
#include <bits/stdc++.h>

using namespace std;
int main() {
    string str;
    cin>>str;
    for(int i = 0; i<str.size();i++){
        cout << str.at(i) << " ";
    }
    cout << '\n';
    for(int i = 1; i<str.size();i++) cout << str.at(i) << '\n';
}