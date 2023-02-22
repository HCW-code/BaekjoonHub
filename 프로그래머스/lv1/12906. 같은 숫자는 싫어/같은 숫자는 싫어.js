// function solution(arr)
// {
//     let answer = [];
    
//     while(arr.length != 0){
//         if(answer[answer.length-1] != arr[0]){
//             answer.push(arr.shift())
//         }else{
//             arr.shift()
//         }
//     }
    

//     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//     console.log('Hello Javascript')
    
//     return answer;
// }

function solution(arr)
{
    var answer = [];
    for (let i = 1; i < arr.length ; i++ ) {
            if ( arr[i] !== arr[i-1]) {
               answer.push(arr[i-1]) 
            }
    }
    answer.push(arr[arr.length -1])
    return answer;

}