function solution(n, computers) {
    var answer = 0;
    let linked = Array.from(Array(n), () => []);

    for(let i = 0; i< n; i++){
        for(let j = 0; j< n; j++){
            if(computers[i][j] != 0){
                linked[i].push(j)
            }        
        }
    }
    let visited = Array(n).fill(false)
    const dfs = (x) => {
        if(visited[x] == true){
            return
        }else{
            visited[x] = true;
            for(let i = 0; i < linked[x].length; i++){
                dfs(linked[x][i])
            }
        }
        
    }
    
    for(let i = 0; i< n ; i++){
        if(visited[i] ==false){
            dfs(i)
            answer++;
        }
    }
    
    console.log(linked)
    
    return answer;
}