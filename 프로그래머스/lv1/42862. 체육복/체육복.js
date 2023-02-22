function solution(n, lost, reserve) {
    
    var answer = 0;
    let count = 0;
    lost.sort((a, b)=>a-b);
    reserve.sort((a,b)=> a-b);
    let real_lost= lost.filter(el => !reserve.includes(el));
    let real_reserve = reserve.filter(el => !lost.includes(el))
    for(let i = 0; i< real_lost.length; i++){
        for(let j = 0; j < real_reserve.length; j++){
            if(real_lost[i] - 1 == real_reserve[j] || real_lost[i] + 1 == real_reserve[j]){
                if(real_lost.indexOf(real_reserve[j]) == -1){
                    real_reserve[j] = -1;
                    count++;
                    break;
                }
                
            }
        }
        console.log(real_lost)
        console.log(real_reserve)
    }
    return n - real_lost.length + count;
}


// 1 2 3 4 5