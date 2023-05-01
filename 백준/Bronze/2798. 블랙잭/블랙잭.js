let input = require('fs').readFileSync(0).toString().split('\n');


let [count, blackjack] = input[0].split(' ').map(Number);
let card = input[1].split(' ').map(Number);
let result = []


for(let i = 0; i < count; i ++){
    for(let j = i+1; j < count; j++){
        for(let k = j+1; k < count; k++){
            if(card[i] + card[j] + card[k] <= blackjack)
            result.push(card[i] + card[j] + card[k]);
        }
    }
}

console.log(Math.max(...result));