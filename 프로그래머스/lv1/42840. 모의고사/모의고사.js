function solution(answers) {
    let jjik = [
        [1, 2, 3, 4, 5,],
        [2, 1, 2, 3, 2, 4, 2, 5],
        [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    ]
    let result = [0, 0, 0];
    let max = 0;
    for(let i = 0; i< answers.length; i++){
        if(answers[i] == jjik[0][i%5]) result[0]++;
        if(answers[i] == jjik[1][i%8]) result[1]++;
        if(answers[i] == jjik[2][i%10]) result[2]++;
        max = Math.max(result[0], result[1], result[2])
    }

    console.log(max)
        var answer = [];
    for(let i = 0; i< result.length; i++){
        if(max == result[i]){
            answer.push(i+1);
        }
    }

    
    
    
    return answer;
}