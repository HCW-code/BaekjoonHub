let fs = require('fs');
//let input = fs.readFileSync(0).toString().split(' ').map(el => parseInt(el));
let input = fs.readFileSync(0).toString().trim().split('\n');

let count = parseInt(input.shift())
let arr = input[0].split(' ').map(Number);

let flag = false;

for(let i = count -1; i > 0; i--){
    if(arr[i] > arr[i-1]){
        let arr1 = arr.splice(i)
        let min = arr1[0];

        for(let j =0; j < arr1.length; j++){
            if(arr[arr.length-1] < arr1[j] && min > arr1[j]){
                min = arr1[j]
            }
        }
        let temp_index = arr1.indexOf(min);
        arr1[temp_index] = arr[arr.length-1];

        arr[arr.length-1] = min;

        arr1.sort((a,b) => a- b)

        
        flag = true

        console.log(arr.concat(arr1).join(' '))
        break;
    }
}

if(!flag){
    console.log(-1)
}