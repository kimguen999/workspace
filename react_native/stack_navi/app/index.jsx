import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { useRouter } from 'expo-router'
import { SafeAreaView } from 'react-native-safe-area-context';

// 앱 실행시 최초 보이는 컴포넌트
const HomeScreen = () => {

  const router = useRouter();
  // react-native에서 페이지 이동시 사용하는 객체




  return (
    <SafeAreaView>
      <Text>index</Text>


      <Pressable onPress={e=>{router.push("/detail")}}>
        {/* push : 위에 얹기, 뒤로가기 누르면 바로 전으로 감 */}
        <Text>상세페이지</Text>
      </Pressable>


      <Pressable onPress={e=>{router.push({
        pathname : "/detail"
        // params : 가져갈 데이터
        , params : { 
          id : 'abc'
          , age : 20
        }
      })}}>
        {/* push : 위에 얹기, 뒤로가기 누르면 바로 전으로 감 */}
        <Text>상세페이지</Text>
      </Pressable>


      <Pressable onPress={e=>{router.replace("/my-page")}}>
        {/* replace : 교체, 뒤로가기 누르면 바로 전으로 안가고 push 없었다면 종료됨 */}
        <Text>마이페이지</Text>
      </Pressable>



    </SafeAreaView>
  )
}

export default HomeScreen

const styles = StyleSheet.create({})