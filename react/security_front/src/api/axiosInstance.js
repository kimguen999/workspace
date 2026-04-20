import axios from "axios";

// axios 객체 생성 -> 앞으로 모든 통신은 해당 객체로 진행
export const axiosInstance = axios.create({
  baseURL : 'http://localhost:8080/',  // 톤신할 서버의 기본 url
  withCredentials : 'true'  // 쿠키 인증 데이터도 통신하기 위한 세팅
});

// 요청 인터셉터 -> 토큰을 요청 헤더에 싣는다.
// 첫번째 매개변수 : 요청시 작업할 내용, ()=>{}
// 두번째 매개변수 : 요청중 오류 발생시 내용, ()=>{}
axiosInstance.interceptors.request.use(
  (config)=>{
    const token = localStorage.getItem('token');
    if(token){
      config.headers.Authorization = token;
    }
    return config;
  } 
  , (error)=>{
    console.error('axios 요청 오류 : ', error)
    return Promise.reject(error)
  }
);


// 응답 인터셉터
// 첫번째 매개변수 : 응답시 작업할 내용, ()=>{}
// 두번째 매개변수 : 응답중 오류 발생시 내용, ()=>{}
axiosInstance.interceptors.response.use(
  (response)=>{
    return response
  } 
  , (error)=>{
    console.error('axios 응답 오류 : ', error.response?.status, error.config?.url);
    // ? 붙이면 undefined일때 거기까지만 해석하고 뒤에는 해석하지 않음.
    // error.conf -> 오류x, undefined
    // error.conf.url -> 오류o, undefined에서 객체를 찾기때문에 오류
    // error.conf?.url -> 오류x
    return Promise.reject(error);
  }
);






