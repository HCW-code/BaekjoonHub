function solution(progresses, speeds) {
    var answer = [];
    let i = 0;
    
    while(progresses.length != 0){
        
        for(let i = 0; i < progresses.length;i++){
            progresses[i] += speeds[i];
        }

       if(progresses[0] >= 100){
            answer.push(0);
           while(progresses[0] >= 100){
                progresses.shift();
                speeds.shift();
                answer[answer.length-1]++;
           }
        }
    }
    return answer;
}