#include <iostream>
#include <algorithm>


// 2143
using namespace std;
int main()
{
    string arr;

    cin >> arr;

    sort(arr.begin(), arr.end(), greater<int>());
    cout << arr;
    
    
}