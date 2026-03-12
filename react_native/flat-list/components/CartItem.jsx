import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import MaterialIcons from '@expo/vector-icons/MaterialIcons';
import Feather from '@expo/vector-icons/Feather';
import AntDesign from '@expo/vector-icons/AntDesign';



const CartItem = ({item}) => {
  return (
    <View style={styles.itemContainer}>
      <Text
        style={styles.title}
        
      >{item.item}</Text>
      <AntDesign 
        name="form" 
        size={30} 
        color="#41431B" 
        style={styles.icon}
      />
      <Feather 
        name="x" 
        size={30} 
        color="#8E977D" 
        style={styles.icon}
      />
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
  icon : {
    width : '10%'
  }
})