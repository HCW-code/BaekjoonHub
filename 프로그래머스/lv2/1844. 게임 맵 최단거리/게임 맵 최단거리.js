function solution(maps) {
    var answer = 1;
    let N = maps.length; // 첫번째 배열 세로
    let M = maps[0].length; //두번째 배열 가로
    let visited = maps;
    let dx = [1, -1, 0, 0];
    let dy = [0, 0, 1, -1];
    visited[0][0] = 0;
    let queue = [[0,0]];
    
    
    while(queue.length != 0){
        let size = queue.length;
        
        for(let i = 0; i < size;i++){
            let [x, y] = queue.shift()
            
            for(let j = 0; j < 4; j++){
                let nx = x + dx[j];
                let ny = y + dy[j];
                
                if(nx < M && ny < N && nx>=0 && ny >= 0 && maps[ny][nx] == 1 && visited[ny][nx] != 0){
                    if(nx == M-1 && ny == N-1){
                        return answer +1;
                    }
                    queue.push([nx, ny]);
                    visited[ny][nx] = 0;
                }
            }
        }
        answer++;
        
    }
    
    return -1;
}

