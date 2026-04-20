import { useState } from 'react'
import { Keyboard, StyleSheet, Text, TextInput, TouchableWithoutFeedback } from 'react-native'
import { SafeAreaView } from 'react-native-safe-area-context'
import CartList from '../components/CartList'
import { dummy_data } from '../data/dummy'

const HomeScreen = () => {

  // 새롭게 입력한 장 볼 물품을 저장할 state
  const [newItem, setNewItem] = useState('')

  // HomeScreen에 쓰기 위해 dummy.js에 있던 state를 가져왔으며, dummy.js에 props를 준다
  // HomeScreen이 부모태그이므로.
  const [cartList, setCartList] = useState(dummy_data);

  dummy_data;

  // 목록 수정
  const handleUpdate = (id, updatedItem) => {
  setCartList(
    cartList.map(item =>
      item.id === id ? { ...item, item: updatedItem } : item
    )
  )
}


  // 장 목록 추가
  const addCart=()=>{
    // 추가할 id
    // id에 있는 숫자들만 따로 모아서 List로 만들기
    // map : 배열의 데이터 수만큼 반복하면서 return 되는 데이터를 배열로 반환
    const idList = cartList.map((item, i)=>{return item.id})
    // 추가할 데이터
    const newData = {
      // Math.max([1,2,3]) ===> 3
      // 리스트가 아무것도 없을때 id를 0으로 주기
      // 그렇지 않을땐 가장 큰 id + 1
      id : cartList.length===0 ? 1 : Math.max(...idList) + 1
      , item : newItem
    }
    
    // 추가할 데이터를 cartList에 저장
    setCartList([...cartList, newData])

    // 추가 후 textInput 초기화
    setNewItem('')
  }

  // 목록 삭제 함수
  const handleDelete = (id)=>{
    setCartList(cartList.filter(item=>item.id !==id))
  }
  
  return (
    // 빈곳 터치시 키보드 숨김 기능
    <TouchableWithoutFeedback
      onPress={Keyboard.dismiss}
      // 아이폰은 accessible 추가해야함
      accessible={false}
    >
      <SafeAreaView
        
        style={styles.container}
      >
        <Text 
          style={styles.headText}
        >To do List</Text>
        <TextInput 
          style={styles.input}
          placeholder=' + Add a Task'
          value={newItem}
          onChangeText={text=>setNewItem(text)}
          // 터치 키보드의 확인 버튼 눌렀을때 실행 이벤트
          onSubmitEditing={()=>{
            // 새롭게 입력 데이터를 카트리스트에 추가
            addCart();
          }}
        />
        <CartList 
          cartList={cartList} 
          onUpdate={handleUpdate}
          onDelete={handleDelete}
        />
      </SafeAreaView>
    </TouchableWithoutFeedback>
  )
}

export default HomeScreen

const styles = StyleSheet.create({
  container : {
    flex : 1,
    borderWidth : 1
  },
  headText : {
    width : '90%',
    // borderWidth : 1,
    marginHorizontal : 'auto',
    fontSize : 30,
    fontWeight : 'bold',
    marginTop : 20
  },
  input : {
    borderWidth : 1,
    width : '90%',
    marginHorizontal : 'auto',
    marginTop : 30,
    marginBottom : 30
    
  }
})