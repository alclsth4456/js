import React from 'react';
import ImageChange from './ImageChange.js';
// import './components/css/Footer.css'; // 필요한 스타일을 추가하세요

const imgSrcList = [
  './img/dog1.jpg',
  './img/dog2.jpg',
  './img/dog3.jpg',
  './img/dog4.jpg',
  './img/dog5.jpg',
];

const Footer=()=>{
    return (
        <footer>
            <ImageChange imgSrcList= {imgSrcList}/>
            <ul id='image-slider' className='main-img'>
                <a href='dogs.html'></a>
            </ul>
        </footer>
    )
}

export default Footer;