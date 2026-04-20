import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { Tabs } from 'expo-router'
import FontAwesome5 from '@expo/vector-icons/FontAwesome5';


// (tabs) 폴더 내의 파일들을 tab 내비로 이동할 수 있도록 설정하는 파일
const TabLayout = () => {
  return (
    <Tabs screenOptions={{headerShown : false}}>

      {/* <Tabs.Screen />  하나가 하나의 탭을 의미 */}

      <Tabs.Screen 
        name='index' // 탭에 연결될 파일명
        options={{
          title : 'Home'  // 탭의 이름
          , tabBarIcon : ()=> <FontAwesome5 name="home" size={30} color="black" />
          
        }}
      />
      <Tabs.Screen 
        name='my-page'
        options={{
          title : 'MyPage'  
          , tabBarIcon : ()=> <FontAwesome5 name="anchor" size={24} color="red" />
        }}
      />
      <Tabs.Screen 
        name='settings'
        options={{
          title : 'Setting'  
          , tabBarIcon : ()=> <FontAwesome5 name="bacterium" size={24} color="green" />
        }}
      />
    </Tabs>
  )
}

export default TabLayout

const styles = StyleSheet.create({})