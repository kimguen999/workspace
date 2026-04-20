import { Keyboard, KeyboardAvoidingView, StyleSheet, Text, TouchableWithoutFeedback, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import axios from 'axios';
import Custominput from '../../../components/common/Custominput';

// 피드 등록 화면
const RegFeedScreen = () => {

  




  return (
    <TouchableWithoutFeedback onPress={()=>Keyboard.dismiss()}>
      <KeyboardAvoidingView 
        style={styles.container}
        behavior='padding'
      >
        <Custominput label='아이디' isPw={true}/>
        <Custominput />
        <Custominput />
  
      </KeyboardAvoidingView>
    </TouchableWithoutFeedback>
  )
}

export default RegFeedScreen

const styles = StyleSheet.create({
  container : {
    flex : 1,
    backgroundColor : 'white',
    justifyContent : 'flex-end',
    paddingHorizontal : 12,
    gap : 12
  }
})