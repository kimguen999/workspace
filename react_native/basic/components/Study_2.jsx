import { Pressable, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'


const Study_2 = () => {

  // 입력한 input 데이터 저장할 stste 변수
  const [loginData, setloginData] = useState({
    id : '',
    pw : '',
  });

  // id/pw input 변할때마다 반영
  const handleloginData = (name, text) =>{
    setloginData({
      ...loginData,
      [name]:text
    })
  }

  //
  const [isShow, setIsShow] = useState(false)

  return (
    <>
      {/* ID / PW Input */}
      <View>
        <Text>ID/PW</Text>
        <TextInput 
          style={styles.input}
          value={loginData.id}
          placeholder='Input Your Id'
          onChangeText={text=>handleloginData('id',text)}
        />
        <TextInput 
          style={styles.input}
          value={loginData.pw}
          placeholder='Input Your Password'
          onChangeText={text=>handleloginData('pw',text)}
          secureTextEntry={true}
        />
      </View>

      {/* 로그인버튼 */}
      <View style={styles.logContainer}>
        <Pressable
          style={styles.logBtn}
          onPress={e=>{setIsShow(true)}}
        >
          <Text
            style={styles.logText}
          >로그인</Text>
        </Pressable>
      </View>

      {/* 버튼 누르면 ID/PW 정보 보이게끔 */}
      {
        isShow && 
        <View>
          <Text>id : {loginData.id}</Text>
          <Text>pw : {loginData.pw}</Text>
        </View>
      }
    </>
  )
}

export default Study_2

const styles = StyleSheet.create({

  input : {
    borderWidth : 1,
    marginBottom : 10,
    width : '80%',
    margin : 'auto'
  },

  logContainer:{
    alignItems : 'center'
    
  },

  logBtn:{
    backgroundColor : '#E36A6A',
    width : '40%',
    height : 35,
    justifyContent : 'center',
    alignItems : 'center',
    borderRadius : 10
  },

  logText:{
    color : 'white',
    fontSize : 23
  }

})