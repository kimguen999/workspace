import { FlatList, Pressable, StyleSheet, View } from 'react-native'
import React, { useCallback } from 'react'
import FeedItem from '../../../components/FeedItem'
import { dummyData } from '../../../api/dummyData'
import { colors } from '../../../constants/colorConstant'
import Entypo from '@expo/vector-icons/Entypo';
import { useFocusEffect, useRouter } from 'expo-router'
import axios from 'axios'

// 피드 목록
const HomeScreen = () => {

  // 조회한 피드 목록 데이터
  const feedList = dummyData

  const router = useRouter();

 // 마운트시 데이터 조회
 // push 했다가 뒤로 오면 마운트 되지 않는다는 문제점 있음
  // useEffect(()=>{
  //   getData();
  // },[]);

  // 앱에서 페이지 전환 될때마다 실행
  useFocusEffect(useCallback(()=>{
    getData()
  }, []));

  const getData = ()=>{
    axios.get(`http://192.168.30.109:8080/members/t1`)
    .then(response => {
      console.log(response.data);
    })
    .catch(e=>console.log(e));
  }


  return (
    <View style={styles.container}>
      {/* <FeedItem /> */}
      <FlatList 
        // data : 반복할 데이터
        data={feedList}

        // renderItem :  무엇을 반복으로 그릴건지
        // 매개변수 item : 데이터 하나하나
        renderItem={({item})=><FeedItem item={item}/>}

        // keyExtractor : map함수의 키와 동일, 고유키
        keyExtractor={(item)=>item.id}

        // contentContainerStyle : 디자인
        contentContainerStyle={styles.listContainer}
      />
      <Pressable 
        // style={styles.writeBtn}
        // style={()=>{return styles.writeBtn}}

        // style={(param)=>{
        //   console.log(param);
        //   return styles.writeBtn
        // }}

        // 구조분해할당과 단락평가
        style={({pressed})=>[styles.writeBtn, pressed && styles.pressed]}
        onPress={e=>router.push('/reg-feed')}
      >
        <Entypo name="pencil" size={24} color="white" />
      </Pressable>
    </View>
  )
}

export default HomeScreen



const styles = StyleSheet.create({
  container:{
    flex : 1
  },
  writeBtn:{
    position : 'absolute',
    width : 50,
    height : 50,
    bottom : 40,
    right : 40,
    backgroundColor : colors.ORANGE_600,
    borderRadius : 50,
    justifyContent : 'center',
    alignItems : 'center',

  },
  pressed : {
    opacity : 0.8
  },

  listContainer : {
    paddingVertical : 8,
    paddingHorizontal : 8,
    gap : 10,
    backgroundColor : colors.GRAY_200,

  },
})