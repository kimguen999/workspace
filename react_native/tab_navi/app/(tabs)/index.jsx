import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { useRouter } from 'expo-router'
import { SafeAreaView } from 'react-native-safe-area-context';

const HomeScreen = () => {

  const router = useRouter();


  return (
    <SafeAreaView>
      <Text>index</Text>

      <Pressable onPress={e=>router.push('/settings')}>
        <Text>세팅하러가기</Text>
      </Pressable>


    </SafeAreaView>
  )
}

export default HomeScreen

const styles = StyleSheet.create({})