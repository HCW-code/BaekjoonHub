#include<iostream>
#include<vector>
#include<algorithm>

// 5 21
// 5 6 7 8 9


using namespace std;
int max_to_sum = 0;

void dfs(int count, int sum, int m,int n, int visited[], int arr[], int index){
    if(count == 3){
        if(sum <= m && max_to_sum < sum){
            max_to_sum = sum;
        }
        return;
    }else{
        for(int i = index; i < n; i++){
            if(visited[i] == 0){
                visited[i] = 1;
                sum+= arr[i];
                dfs(count+1, sum, m, n, visited, arr, i+1);
                sum-= arr[i];
                visited[i] = 0;
            }
        }
    }
}


int main() {
	int n, m;
    cin >> n >> m;
    int arr[n];
    int visited[n];
    fill_n(visited, n, 0);
    
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    dfs(0, 0, m, n, visited, arr, 0);
    

    cout << max_to_sum;
}