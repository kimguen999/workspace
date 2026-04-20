import { Image, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import face_02 from '../assets/images/face-02.jpg'
import { colors } from '../constants/colorConstant'
import FontAwesome5 from '@expo/vector-icons/FontAwesome5';

const Profile = () => {
  return (
    <View style={styles.container}>
      <View style={styles.profileContainer}>
        <Image
          style={styles.img}
          source={face_02}
        />
        <View>
          <Text style={styles.writer}>작성자</Text>
          <Text style={styles.createDate}>작성일</Text>
        </View>
      </View>
      <FontAwesome5 name="ellipsis-v" size={24} color="black" />
    </View>
  )
}

export default Profile

const styles = StyleSheet.create({
  container : {
    flexDirection : 'row',
    justifyContent : 'space-between',
    alignItems : 'center',
    paddingRight : 15,
    marginBottom : 30,
  },

  profileContainer : {
    flexDirection : 'row',
    alignItems : 'center',
    gap : 10,
  },

  img : {
    width : 50,
    height : 50,
    borderRadius : 50,
    borderWidth : StyleSheet.hairlineWidth,
    borderColor : colors.GRAY_300,
  },

  writer : {
    fontSize : 14,
    fontWeight : 'bold',
  },

  createDate : {
    fontSize : 13,
    color : colors.GRAY_500,
  },

})