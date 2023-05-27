#include <iostream>

using namespace std;
int main(){
    int a, b;
    cin >> a >> b;
    if(b - 45 < 0){
        if(a-1 < 0){
            a = 24;
        }
        a--;
        b = b-45+60;
    }else{
        b-=45;
    }
    cout << a << ' '<<  b;
}