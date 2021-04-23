#include <iostream> 
#include <vector>
#include <bits/stdc++.h>

using namespace std;
int main() {
    int aB, dB, aS, dS;
    cin >> aB >> dB >> aS >> dS;
    if(aB>dS&&dB>aS) cout << "Batman";
    else if(aS>dB&&dS>aB) cout << "Superman";
    else cout << "Inconclusive";
}