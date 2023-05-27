#include <iostream>

using namespace std;

int main()
{
    int n, find_num, ans = 0;
    cin >> n;
    int arr[n];
    for(int i = 0; i < n;i++){
        cin >> arr[i];
    }
    cin >> find_num;
    for(int i =0; i < n;i++){
        if(arr[i] == find_num) ans++;
    }

    cout << ans;

}