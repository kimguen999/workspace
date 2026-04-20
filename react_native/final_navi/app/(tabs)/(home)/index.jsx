import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native-safe-area-context'
import { useRouter } from 'expo-router'

const HomeScreen = () => {

  const route = useRouter();

  return (
    <SafeAreaView>
      <Text>HomeScreen</Text>

      <Pressable onPress={e=>route.push('/more')}>
        <Text>more.jsx</Text>
      </Pressable>


    </SafeAreaView>
  )
}

export default HomeScreen

const styles = StyleSheet.create({})