import { FlatList, StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import CartItem from './CartItem';

const CartList = ({cartList, onUpdate, onDelete}) => {

  

  



  return (
    <View style={styles.listContainer}>
      <FlatList
        // data : 반복할 데이터
        data={cartList}

        // renderItem : 반복해서 그릴 그림
        // renderItem={({item})=>{return <CartItem CartItem = {}/>}}
                        // r-> 중괄호 이유 : 여러개라서
        renderItem = {({item})=>{
          return (<CartItem 
            key={item.id.toString()}
            item = {item}
            onUpdate={onUpdate}
            onDelete={onDelete}
          />)
        }}


        // keyExtractor : map함수의 key 속성과 동일
        // keyExtractor={(item)=>{return item.id.toString()}}
        // item : 데이터 하나하나

        // 반복적으로 그려지는 컴포넌트를 감싸는 전체 영역 디자인
        contentContainerStyle={{
          gap : 10
        }}

      />


    </View>
  )
}

export default CartList

const styles = StyleSheet.create({
  listContainer : {
    width : '90%',
    marginHorizontal : 'auto',
    padding : 12,
    backgroundColor : '#dddddd'
  }
})