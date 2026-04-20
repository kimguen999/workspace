import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native-safe-area-context'
import { useRouter } from 'expo-router'

const MoreScreen = () => {

  const route = useRouter();

  return (
    <SafeAreaView>
      <Pressable onPress={e=>route.push('/profile')}>
        <Text>profile</Text>
      </Pressable>

      <Pressable onPress={e=>route.push('/profile/second')}>
        <Text>second</Text>
      </Pressable>

    </SafeAreaView>
  )
}

export default MoreScreen

const styles = StyleSheet.create({})