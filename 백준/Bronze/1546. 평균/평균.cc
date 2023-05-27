#include <iostream>
#include <algorithm>





// 3
// 40 80 60

using namespace std;

int main()
{
    int n;
    cin >> n;
    double arr[n];
    double max = 0;
    double sum = 0;

    for(int i = 0; i< n; i++){
        cin >> arr[i];
        if(max < arr[i]) max = arr[i];
    }
    for(int i = 0; i< n; i++){
        arr[i] = arr[i] / max * 100;
        sum += arr[i];
    }
    cout << sum/n;

}