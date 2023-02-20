let fs = require('fs');
//let input = fs.readFileSync(0).toString().split(' ').map(el => parseInt(el));
let input = fs.readFileSync(0).toString().trim().split('\n');

let [total, count] = input.shift().split(' ').map(Number);

input = input[0].split(' ').map(Number);
input.sort((a, b) => a-b)

let temp = []
let result = ""
const dfs = (x, num) => {
    temp.push(input[x]);
    if(num == count-1){
        result += temp.join(' ') + '\n';
        return
    }
    for(let i = x + 1; i< total; i++){
            dfs(i, num+1);
            temp.pop()
    }
}
for(let i = 0; i< total; i++){
    dfs(i, 0);
    temp.pop()
}
console.log(result.slice(0,-1))