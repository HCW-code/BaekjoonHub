#include <iostream>

using namespace std;
int main(){
    int a;
    cin >> a;
    for(int i = a; i > 0; i--){
        
        for(int j = i-2; j>= 0; j--){
            cout << ' ';
        }
        for(int k = i; k <= a; k++){
            cout << '*';
        }
        cout<< endl;    
    }

}