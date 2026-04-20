import { Alert, Pressable, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import MaterialIcons from '@expo/vector-icons/MaterialIcons';
import Feather from '@expo/vector-icons/Feather';
import AntDesign from '@expo/vector-icons/AntDesign';



const CartItem = ({item, onUpdate, onDelete}) => {

  // 현재 수정중인지 상태를 파악하기 위한 state
  const [isEditing, setIsEditing] = useState(false)

  // 수정 입력 저장 state
  const [editingInput, setEditingInput] = useState(item.item)

  // 수정 반영 state
  const [displayItem, setDisplayItem] = useState(item.item)

  // 수정 완료 함수
  const handleSave = ()=>{
    onUpdate(item.id, editingInput)
    setDisplayItem(editingInput)
    setIsEditing(false)
  }

  // 추가한 목록 수정 시점
  useEffect(()=>{
    setDisplayItem(item.item)
    setEditingInput(item.item)
  },[item.item])

  // 삭제 버튼 함수
  const handleDelete = ()=>{
    Alert.alert(
      '삭제 확인',
      '정말 삭제하시겠습니까?',
      [
        {
          text : '삭제',
          style : 'destructive',
          onPress : ()=>{onDelete(item.id)}
          
        },
        {
          text:'취소',
          style:'cancle',
        },
      ]
    )
    
  }


  return (
    <View style={styles.itemContainer}>

      {/*  */}
      {
        isEditing 
        ?
        <>
          <TextInput 
            style={styles.input}
            value={editingInput}
            // 수정 누르자마자 자동으로 커서
            autoFocus={true}
            // 포커스를 잃어버릴때 실행 이벤트
            onBlur={()=>{setIsEditing(false)}}
            onChangeText={text=>setEditingInput(text)}
            onSubmitEditing={()=>{handleSave()}}
          />

          
        </>  
        : 
        <>
  
          <Text
            style={styles.title}
          >{displayItem}</Text>

          {/* 수정버튼 */}
          <Pressable
            onPress={()=>{setIsEditing(true)}}
            style={styles.iconContainer1}
          >
            <AntDesign
              name="form"
              size={30}
              color="#41431B"
              style={styles.icon}
            />
          </Pressable>

          {/* 삭제버튼 */}
          <Pressable
            onPress={()=>{handleDelete()}}
            style={styles.iconContainer1}
          >
          <Feather
            name="x"
            size={30}
            color="#8E977D"
            style={styles.icon}
          />
          </Pressable>

        </>
      }
    </View>
  )
}

export default CartItem

const styles = StyleSheet.create({
  itemContainer : {
    backgroundColor : '#eeeeee',
    flexDirection : 'row',
    paddingVertical : 10,
    paddingHorizontal : 12,
    alignItems : 'center',
    // marginBottom : 10
    
  },
  title : {
    width : '83%',
    fontSize : 20,
  },
  iconContainer1 : {
    width : '10%',
    justifyContent : 'center',
    alignItems : 'center'
  },
  icon : {
    width : '100%'
  },
  input : {
    borderWidth : 1,
    width : '100%'
  }

})