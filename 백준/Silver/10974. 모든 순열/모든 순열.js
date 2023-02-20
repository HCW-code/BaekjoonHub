let fs = require('fs');
//let input = fs.readFileSync(0).toString().split(' ').map(el => parseInt(el));
let input = fs.readFileSync(0).toString().trim();

let count = parseInt(input)
// let arr = input[0].split(' ').map(Number);
// arr.sort((a, b) => a-b);

let visited = new Array(count+1).fill(false);
let temp = []
let result = [];
const dfs = (x, num) => {
    if(num == count){
        result.push(temp.join(' '));
        return
    }else{
        for(let i = 1; i <= count; i++){
            if(!visited[i]){
                visited[i] = true;
                temp.push(i)
                dfs(i, num+1);
                visited[i] = false;
                temp.pop()
            }
    }
    }
}

dfs(0, 0);
console.log(result.join('\n'))