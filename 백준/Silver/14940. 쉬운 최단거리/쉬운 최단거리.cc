#include<iostream>
#include<queue>

using namespace std;

// 15 15
// 2 1 1 1 1 1 1 1 1 1 1 1 1 1 1
// 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
// 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
// 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
// 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
// 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
// 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
// 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
// 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
// 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
// 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
// 1 1 1 1 1 1 1 1 1 1 0 0 0 0 1
// 1 1 1 1 1 1 1 1 1 1 0 1 1 1 1
// 1 1 1 1 1 1 1 1 1 1 0 1 0 0 0
// 1 1 1 1 1 1 1 1 1 1 0 1 1 1 1

int main(){
    int n, m;
    cin >> n >> m;

    int arr[n][m];
    int visited[n][m];
    fill_n(&visited[0][0], n*m, 0);

    int dx[4] = {1, -1, 0, 0};
    int dy[4] = {0, 0, 1, -1};
    int start_x, start_y;

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            cin >> arr[i][j];
            if(arr[i][j] == 2){
                start_x = i;
                start_y = j;
            }
        }
    }

    queue<pair<int, int> > q;

    q.push(make_pair(start_x, start_y));
    arr[start_x][start_y] = 0;

    while(q.size() != 0){
        int x = q.front().first;
        int y = q.front().second;
        visited[x][y] = 1;
        q.pop();
        for(int i = 0; i< 4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx >=0 && nx < n && ny>=0 && ny < m){
                if(arr[nx][ny] == 1 && visited[nx][ny] == 0){
                    visited[nx][ny] = 1;
                    arr[nx][ny] = arr[x][y]+1;
                    q.push(make_pair(nx, ny));
                }
            }
        }
    }

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if(visited[i][j] == 0 && arr[i][j] == 1){
                cout << -1 << ' ';
            }else{
                cout << arr[i][j]<<' ';
            }
        }
        cout << endl;
    }



}