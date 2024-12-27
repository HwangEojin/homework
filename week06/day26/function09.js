function factorial (n){
  if(n===0){
    return 1;
  }
  //재귀호출
  return n* factorial(n-1);
}

console.log(factorial(5));


function reverseStr(str, index=0){
  if(index == str.length){
    return '';
  }
  return reverseStr(str,index+1) + str[index];
}


function reverseStr(str){
  if(str === "" || str.length ===1){
    return str;
  }
  return reverseStr(str.slice(1)) + str[0];
}


function reverseStr(str){
  if(str === "" || str.length ===1){
    return str;
  }
  return reverseStr(str.substr(1)) + str[0];
}