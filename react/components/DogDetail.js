import React from 'react';


const DogDetail = ({ dog }) => {
  // const { id } = useParams();
  // const dog = dogsData.find(d => d.id === parseInt(id));

//   if (!dog) {
//     return <h2>강아지를 찾을 수 없습니다</h2>;
//   }

//   return (
//     <div>
//       <h2>{dog.name}</h2>
//       <img src={dog.img} alt={dog.name} />
//       <p>{dog.description}</p>
//     </div>
//   );
<div>
  <div id='i1'>
    <div className='t1' style={{backgroundImage: `url(${dog.images[0]})`,backgroundSize: 'cover',backgroundRepeat: 'no-repeat',height: '400px',width: '550px',margin: '0, auto', marginBottom: '30px'}}></div>
    <div className='t2' style={{backgroundImage: `url(${dog.images[1]})`,backgroundSize: 'cover',backgroundRepeat: 'no-repeat',height: '400px',width: '550px',margin: '0, auto', marginBottom: '30px'}}></div>
  </div>
  <table>
    <tr>
          <th>견종</th>
          <th>나이</th>
          <th>성별</th>
          <th>특이사항</th>
          <th>접종유무</th>
    </tr>
    <tr>
          <td>{dog.name}</td>
          <td>{dog.age}</td>
          <td>{dog.gender}</td>
          <td>{dog.special}</td>
          <td>{dog.vaccination}</td>
    </tr>
    <tr>
          <th>중성화 유무</th>
          <th>오게된 이유</th>
          <th>공고 번호</th>
          <th>좋아하는 것</th>
          <th>싫어하는 것</th>
        </tr>
        <th>
          <td>{dog.neutered}</td>
          <td>{dog.reason}</td>
          <td>{dog.noticeNumber}</td>
          <td>{dog.likes}</td>
          <td>{dog.dislikes}</td>
        </th>
  </table>
</div>

};

export default DogDetail;