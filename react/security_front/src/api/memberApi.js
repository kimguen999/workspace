import axios from "axios"
import { axiosInstance } from "./axiosInstance";

export const goLogin = async (loginData)=>{
  const response = await axiosInstance.post('/member/login', loginData);
  return response;
  // axiosInstance 처럼 만들어놓으면 인터셉터에서 알아서 하기때문에
  // http://localhost:8080 적을 필요 없고
  // 오류 나면 알려주기 때문에 try, catch 사용할 필요 없다.
}