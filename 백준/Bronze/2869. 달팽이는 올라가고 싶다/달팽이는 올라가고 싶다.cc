#include <iostream>
#include <algorithm>


using namespace std;
int main()
{
    int arr[3];

    for(int i = 0; i < 3;i++){
        cin >> arr[i];
    }

    int one_day = arr[0] - arr[1];
    int result;
    if((arr[2]-arr[0])%one_day != 0){
        result = (arr[2]-arr[0])/one_day+2;
    }else{
        result = (arr[2]-arr[0])/one_day+1;
    }
    
    cout << result;

    
    
}