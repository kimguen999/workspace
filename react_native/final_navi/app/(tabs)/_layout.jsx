import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { Tabs } from 'expo-router'

const Tablayout = () => {
  return (
    <Tabs screenOptions={{headerShown : false}}>

      {/* 탭간 이동은 뒤로가기 적용 안됨. */}
      
      <Tabs.Screen 
        // 탭 터치시 열릴 파일명 (폴더명 입력시 해당 폴다 안의 index 파일)
        name='(home)' // /(home)/index.jsx
        options={{
          title : '홈'  // 탭 이름
        }}
      />
      <Tabs.Screen 
        name='profile' 
        options={{
          title : '프로필'
        }}
      />
      <Tabs.Screen 
        name='setting' 
        options={{
          title : '설정'
          // , href : null
        }}
      />
    </Tabs>
  )
}

export default Tablayout

const styles = StyleSheet.create({})