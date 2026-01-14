
// 이름, 나이, 점수를 갖는 학생 객체를 생성
// {} : 객체, [] : 배열
// key와 value로 이루어진 다수의 데이터를 저장하는 변수
const student = {
  name : 'kim', 
  age : 20, 
  score : 90
}
// == class Student(){
    //   String name = "kim";
    //   int age = 20;
    //   int score = 90; 
    // }

// 객체 정보 출력 문법    
console.log(student.name);
console.log(student);

// 객체 데이터 변경 및 추가
student.age = 30;
student.addr = '울산';
// 존재하는 key에 접근하면 데이터 변경
// 존재하지 않는 key에 점근하면 데이터 추가
console.log(student);

//////////////////////

// 배열 안에 배열, 객체 추가 가능
const arr = [
  1, 
  5.5, 
  'abc', 
  [6, 7, 8], 
  {name : 'kim',age : 20}
]

// 배열 안에 배열 요소 출력
console.log(arr[3][2]);  // 8
// 배열 안에 객체 출력
console.log(arr[4].name);  // kim

///////////////////////////////
// 자바스크립트는 배열이 곧 리스트다.
// List<student> list = new ArrayList<>();
const studentList = [
  {stuNum : 1, name : 'Kim', score : 100}, 
  {stuNum : 2, name : 'Park', score : 91}, 
  {stuNum : 3, name : 'Lee', score : 93} 
];
console.log(studentList);
console.log(studentList[1].name);

// studentList에 저장된 모든 학생의 점수 총합을 출력
let sum = 0;
for(let i = 0; i<studentList.length; i++){
  sum = sum + studentList[i].score;
}
console.log(sum);


// 학번이 짝수인 학생의 이름을 출력
for(const e of studentList){
  if (e.stuNum % 2 == 0) {
    console.log(e.name);
  }
}

studentList.filter(e=>e.stuNum%2==0)
           .forEach(e=>console.log(e.name))





