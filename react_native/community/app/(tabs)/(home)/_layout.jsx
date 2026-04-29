import { ActivityIndicator, StyleSheet, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import { Stack, useRouter } from 'expo-router'
import * as SecureStore from "expo-secure-store"

const HomeLayout = () => {

  const router = useRouter();

  // 로딩중 여부를 판단하는 변수
  const [isLoading, setIsLoading] = useState(true);

  // 로그인 여부를 판단하는 변수
  const [isLogin, setIsLogin] = useState(false);

  // useEffect는 여러개 있으면 비동기로 실행됨

  // 로그인 여부 체크
  useEffect(()=>{
    checkLogin();
  },[]);

  // 로그인 여부에 따라 페이지 설정
  useEffect(()=>{
    // 로딩중이면 밑에 진행 하지 않겠다.
    if(isLoading) return;

    // 로그인 안되었을때 로그인 페이지로 이동
    if(!isLogin) {
      router.replace('/auth/login')
    } else{ // 로그인 되면 첫페이지로 이동
      router.replace('/')
    }
  },[isLogin, isLoading]);
  
  const checkLogin = async ()=>{
    // SecureStore에 저장된 토큰 가져오기
    // useEffect에 바로 넣어도 되지만 비동기기 때문에 awit, async 붙여야 되서
    // 함수로 빼서 useEffect에 넣는다
    const result = await SecureStore.getItemAsync('accessToken');
    if(result){
      setIsLogin(true);
    }
    setIsLoading(false);
  }

  // 로딩 중일때는 스피너 그림
  if(isLoading){
    return (
      <View style={styles.indicator}>
        <ActivityIndicator size='large' />
      </View>
    );
  }


  return (
    <Stack screenOptions={{headerShown : false}}/>
  )
}

export default HomeLayout

const styles = StyleSheet.create({
  indicator : {
    flex : 1,
    justifyContent : 'center',
    alignItems : 'center'
  }
})