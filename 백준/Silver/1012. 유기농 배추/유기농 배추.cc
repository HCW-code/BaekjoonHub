#include<iostream>
#include<vector>
#include<queue>
#include<algorithm>
#include<cstring>




using namespace std;

int main() {
    int testcase;
    cin >> testcase;
    for(int test = 0; test < testcase; test++){
        int m, n, k;
        cin >> m >> n >>k;
        int arr[n][m];
        int i, j;
        memset(arr, 0, sizeof(arr));
        for(i = 0; i < k; i++){
            int x, y;
            cin >> x >> y;
            arr[y][x] = 1;
        }
        int dx[4] = {-1, 1, 0, 0};
        int dy[4] = {0, 0, -1,1};
        int count = 0;
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                if(arr[i][j] == 1){
                    queue<pair<int,int>>q;
                    q.push(make_pair(i, j));
                    arr[i][j] = 0;
                    count++;
                    while(q.size() != 0){
                        
                        int x = q.front().first;
                        int y = q.front().second;
                        q.pop();
                        for(int v = 0; v < 4; v++){
                            int new_x = x+dx[v];
                            int new_y = y+dy[v];
                            if(0 <= new_x && new_x < n && 0 <= new_y && new_y < m){
                                if(arr[new_x][new_y] == 1){
                                    arr[new_x][new_y] = 0;
                                    q.push(make_pair(new_x, new_y));
                                }
                            }
                        }

                    }
                }
            }
        }
        cout << count << endl;
    }
}