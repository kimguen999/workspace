
// 함수 선언 -> 함수 호출

// 함수 선언     function 자료형(){}
function hello(){
  console.log('hello~');
  alert(111);
}

// 함수 호출     자료형();
// hello();


// 매개변수로 정수 2개 전달
function printSum(a, b){
  console.log(a+b);
}
printSum(10,5);

// 매개변수로 전달된 두 수의 합을 리턴
function getSum(num1,num2){
  return num1+num2;
}
// 리턴
// getSum(312,23);

// 리턴값 출력
console.log(getSum(25,76));




