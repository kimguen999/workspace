
// 기본 함수 선언 문법
function fun1(){
  console.log('함수문법1');
}
fun1();

// 함수 표현식 문법
const fun2 = function (){
  console.log('함수문법2(함수표현식)');
}
fun2();

// 화살표 함수 문법
const fun3 = () => {
  console.log('함수문법3(화살표함수)');
}
fun3();

// 화살표 함수 문법에서 매개변수가 하나라면 소괄호 생략 가능
const fun4 = num => {
  console.log(num);
}

// 화살표 함수 문법에서 실행내용이 한줄이라면 중괄호 생략 가능
const fun5 = num => console.log(num);

// 실행내용이 한줄이지만 return문이라면 중괄호 생략과 함께 return 키워드도 생략해야함
const fun6 = num => {return num*2;}
const fun7 = num => num*2;



// 함수 다양하게 사용하기 연습

function intro1(){
  console.log('반가워');
  console.log('또만나');
}
const intro2 = function(){
  console.log('반가워');
  console.log('또만나');
}
const intro3 = ()=>{
  console.log('반가워');
  console.log('또만나');     
}


function printNum1(num){
  console.log(num);
}
const printNum2 = function(num){
  console.log(num);
}
const printNum3 = (num)=>{
  console.log(num);
}




function printSum1(num1, num2){
  console.log(num1+num2);
}
const printSum2 = function(num1, num2){
  console.log(num1+num2);
}
const printSum3 = (num1,num2)=>console.log(num1+num2);


function getDouble1(num){
  return num*2;
}
const getDouble2 = function(num){
  return num*2;
}
const getDouble3 = num => {return num*2;}







