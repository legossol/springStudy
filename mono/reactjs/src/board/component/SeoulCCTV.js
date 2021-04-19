import React, { useState} from 'react'
import 'article/style/ArticleList.css'
const SeoulCCTV = () => {
  const[items, setItems] = useState([])//const setItems는 사실 const[items, setItems:setItems()] 뒤에가 제이슨구조 string,"string"같아서
  
  const list = () =>{
  axios.get(`/data/SeoulCCTV.json`)
  .then((res)=>{
    setItems(res.data)
  })//크루저 형식이라 함수안에 함수
  .catch(err =>{})//크루저 형식이라 함수안에 함수
}

  const a = () => {return ''}
    return (
        <>
<h1>seoul CCTV</h1>
<table>
  <tr>
    <th>No.</th>
    <th>기준날짜</th>
    <th>카메라코드</th>
    <th>카메라명칭</th>
    <th>설명</th>
    <th>상세</th>
  
  </tr>
  (items.map((j,i)=>{
    return(<tr key{i}>
      <td>{i+1}</td>
      <td>{j.deviceid}</td>
      <td>{j.devicename}</td>
      <td>{j.description</td>
      </tr>)
  }))
  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  
</table>
        </>
    )
}
export default SeoulCCTV