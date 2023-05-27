#include <iostream>
#include <algorithm>





// 5 4
// 1 2 3
// 3 4 4
// 1 4 1
// 2 2 2

using namespace std;

int main()
{
    int n, m;
    cin >> n>>m;
    int arr[n];
    fill_n(arr, n, 0);
    int q, j, p;
    for(int i =0; i < m; i++){
        cin >> q >> j >> p;
        for(int k = q-1; k <= j-1; k++){
            arr[k] = p;
        }
    }

    for(int i = 0; i < n; i++){
        cout << arr[i]<< ' ';
    }
}