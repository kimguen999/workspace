
import { StyleSheet, Text, View } from 'react-native'
import { TextInput } from 'react-native'
import { Pressable } from 'react-native'

import React from 'react'

const Study_1 = () => {



  return (
    <View>
      <View>
        <Text>리액트네이티브</Text>
        <Text>아이디</Text>
        {/* 인풋-텍스트 */}
        <TextInput 
          style={styles.input}
          // TextInput의 onChangeText 함수의 매개변수는 입력한 데이터를 의미
          // ==> setId(e.target.value) 할필요없음
          // TextInput의 onChange 함수를 사용하고 e.nativeEvent.text를
          // 사용해도 되지만 편의를 위해 onChangeText가 있는거임
          onChangeText={text=>{
            setId(text)
          }}
          onChange={e=>{
            console.log(1)
            console.log(e.nativeEvent.text)
          }}
        />



        {/* 버튼 */}
        <Pressable
          onPress={e=>{alert(1)}}
          style={styles.btnContainer}
        >
        <Text
          style={styles.btn}
        >버튼</Text>
        </Pressable>



      </View>
    </View>
  )
}

export default Study_1

const styles = StyleSheet.create({
  input:{
    borderWidth : 1, 
    borderColor : 'blue',
    borderRadius : 4
  },
  btnContainer:{
    backgroundColor : 'blue',
    width : '30%',    
    height : 34,
    justifyContent : 'center',
    alignItems : 'center',
    
  },
  btn:{
    color : 'white'
  }
})