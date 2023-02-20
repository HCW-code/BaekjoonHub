let fs = require('fs');
//let input = fs.readFileSync(0).toString().split(' ').map(el => parseInt(el));
let input = fs.readFileSync(0).toString().trim().split('\n');
let [total, count] = input.shift().split(' ').map(Number);

input = input[0].split(' ').map(Number);
input.sort((a, b) => a-b)

let temp = []
let result = ""
const dfs = (x, num) => {
    if(num == count){
        result += temp.join(' ') + '\n';
        return
    }else{
        for(let i = 0; i < total; i++){
            temp.push(input[i])
            dfs(i + 1, num+1);
            temp.pop()
    }
    }
}

dfs(0, 0);
console.log(result)