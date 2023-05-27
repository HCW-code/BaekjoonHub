#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int n, m;
    cin >> n >> m;
    int arr[n][m], arr1[n][m];
    for(int i = 0; i < n; i++){
        for(int j =0; j< m; j++){
            cin >> arr[i][j];
        }
    }

    for(int i = 0; i < n; i++){
        for(int j =0; j< m; j++){
            cin >> arr1[i][j];
        }
    }

    for(int i = 0; i < n; i++){
        for(int j =0; j< m; j++){
            cout << arr[i][j] + arr1[i][j] << ' ';
        }
        cout << endl;
    }
    
}