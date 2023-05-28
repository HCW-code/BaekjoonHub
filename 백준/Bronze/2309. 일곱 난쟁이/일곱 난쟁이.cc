#include <iostream>
#include <algorithm>
#include <numeric>
#include <vector>


// 2143
using namespace std;

int visited[] ={0,0,0,0,0,0,0,0,0};
vector<int> result;
int arr[9];


void dfs(int count, vector<int> vec){
    if(vec.size() == 7){
        if(accumulate(vec.begin(), vec.end(), 0) == 100){
            result = vec;
        }
        return;
    }
    else{
        for(int i= 0; i< 9; i++){
            if(visited[i] == 0){
                visited[i] = 1;
                vec.push_back(arr[i]);
                dfs(count+1, vec);
                vec.pop_back();
                visited[i] = 0;
            }
        }
    }
}
int main()
{
    for(int i =0; i< 9; i++){
        cin >> arr[i];
    }
    vector<int> vec;

    dfs(0, vec);
    sort(result.begin(), result.end());
    for(int i = 0; i < 7; i++){
        cout << result[i] << endl;
    }
}