import { Pressable, StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import FontAwesome from '@expo/vector-icons/FontAwesome';
import AntDesign from '@expo/vector-icons/AntDesign';
import Fontisto from '@expo/vector-icons/Fontisto';
import Profile from './Profile';
import { colors } from '../constants/colorConstant';

const FeedItem = ({item}) => {

  // 좋아요 상태 변수
  const [isLike, setIsLike] = useState(false);

  return (
    <View style={styles.feedContatiner}>
      {/* 작성자 정보 */}
      <Profile />
      <Text style={styles.title}>{item.title}</Text>
      <Text style={styles.content}>{item.content}</Text>

      <View style={styles.iconContainer}>
        {/* 좋아요 */}
        <Pressable style={styles.menu}>
          <FontAwesome name={isLike ? "heart" : "heart-o"} size={24} color="red" />
          <Text>3</Text>
        </Pressable>

        {/* 댓글수 */}
        <Pressable style={styles.menu}>
          <AntDesign name="comment" size={24} color="black" />
          <Text>3</Text>
        </Pressable>

        {/* 조회수 */}
        <Pressable style={styles.menu}>
          <Fontisto name="eye" size={24} color="black" />
          <Text>3</Text>
        </Pressable>
      </View>

    </View>
  )
}

export default FeedItem

const styles = StyleSheet.create({
  feedContatiner : {
    backgroundColor : 'white',
    padding : 16
  },

  title : {
    fontSize : 16,
    marginBottom : 12,
  },

  content : {
    fontSize : 14,
    color : colors.GRAY_600,
    marginBottom : 10,
  },

  iconContainer : {
    flexDirection : 'row',
    justifyContent : 'space-around',
    alignItems : 'center',
    borderTopWidth : StyleSheet.hairlineWidth,
    borderTopColor : colors.GRAY_300,
    paddingTop : 16,
  },

  menu : {
    // borderWidth : 4,
    flexDirection : 'row',
    justifyContent : 'center',
    alignItems : 'center',
    gap : 5,

  },
})