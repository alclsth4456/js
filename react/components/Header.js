// Header.js
import React, { useContext } from 'react';
import { Link } from 'react-router-dom';
import { AuthContext } from './AuthContext';

const Header = () => {
  const { user, logout } = useContext(AuthContext);

  return (
    <header id="header">
      <div className="container">
        <div className="row">
          <div className="header clearfix">
            <div className="logo">
              <h2><Link to="/">Lover Dogs</Link></h2>
            </div>
            <nav className="gnb">
              <ul className="clearfix">
                <li><Link to="/intro">소개</Link>
                  <ul className="submenu">
                    <li><Link to="/intro">카페 소개</Link></li>
                  </ul>
                </li>
                <li><Link to="#">봉사활동</Link>
                  <ul className="submenu">
                    <li><Link to="/volunteer">봉사 신청서</Link></li>
                  </ul>
                </li>
                <li><Link to="#">입양</Link>
                  <ul className="submenu">
                    <li><Link to="#">입소 신청</Link></li>
                    <li><Link to="/adopt">입양 신청서</Link></li>
                  </ul>
                </li>
                <li><Link to="#">게시판</Link>
                  <ul className="submenu">
                    <li><Link to="/board/support">후원</Link></li>
                    <li><Link to="/board/journal">임보 일지</Link></li>
                    <li><Link to="/board/review">입양 후기</Link></li>
                  </ul>
                </li>
                {user ? (
                  <li><button onClick={logout}>로그아웃</button></li>
                ) : (
                  <li><Link to="/login">로그인</Link></li>
                )}
              </ul>
            </nav>
            <div id="barMenu">
              <div className="bar"></div>
            </div>
          </div>
        </div>
      </div>
      <div id="gnbBg"></div>
    </header>
  );
};

export default Header;