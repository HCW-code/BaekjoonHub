let fs = require('fs');
let input = fs.readFileSync(0).toString().split(' ').map(el => parseInt(el));
const N = input[0];
const M = input[1];

let result = "";
//const [N, M] = [4, 3];
const visited = Array(N + 1).fill(0);
const output = [];


const dfs = (cnt) => {
  if (cnt === M) {
        result += `${output.join(" ")}\n`;
        return;
    }

  for (let i = 1; i <= N; i++) {
    if (visited[i] === 1) continue;
 
    visited[i] = 1;
    output.push(i);
    dfs(cnt + 1);
 
    output.pop();
    visited[i] = 0;
  }
}

dfs(0);

console.log(result.trim())
