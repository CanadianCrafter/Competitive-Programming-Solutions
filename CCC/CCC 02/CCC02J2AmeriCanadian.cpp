#include <iostream> 
#include <vector> 
#include <stdio.h>
#include <math.h> 

using namespace std;
int main(){
    string word;
    do{
        cin>>word;
        if(word=="quit!")return 0;

        if(word.length()>4 && word.substr(word.length()-2,2)=="or" 
            && word[word.length()-3]!='a'
            && word[word.length()-3]!='e'
            && word[word.length()-3]!='i'
            && word[word.length()-3]!='o'
            && word[word.length()-3]!='u'
            && word[word.length()-3]!='y'){
            cout<<word.substr(0,word.size()-2)+"our\n";
        }
        else{
            cout<<word + "\n";
        }

        
    }while(word!="quit!");
    return 0;
}