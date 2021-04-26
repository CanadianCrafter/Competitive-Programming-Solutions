#include <iostream> 
#include <vector>
#include <bits/stdc++.h>

using namespace std;
int main() {
    int N, G;
    cin >> N >> G;
    int ans = 0;
    for(int i =0;i<N;i++) {
        int input;
        cin >> input;
        if(input%G==0) ans++;
    }
    cout << ans;
}