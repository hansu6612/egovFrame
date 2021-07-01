<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8">
        <meta name="description" content="OOO 홈페이지 입니다.">
        <meta property="og:type" content="website">
        <meta property="og:title" content="OOO">
        <meta property="og:description" content="OOO 홈페이지 입니다.">
        <meta property="og:image" content="">
        <meta property="og:url" content="">
        <!-- <meta http-equiv="imagetoolbar" content="no"> -->
        <meta http-equiv="X-UA-Compatible" content="IE=Edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title></title>

         <!-- css -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bbs/global.css">

        
        <!-- js :: lib -->
        <script src="${pageContext.request.contextPath}/js/bbs/lib/jquery-1.11.3.min.js"></script>


        <!-- js -->
        <script src="${pageContext.request.contextPath}/js/bbs/gnb.js"></script>
        <script src="${pageContext.request.contextPath}/js/bbs/design.js"></script>
        
    </head>
<body>
  <!-- s:header -->
        <header class="header">
            <div class="skip">
       <a href="#LINK">본문 바로가기</a> 
   </div>
            
            <div class="inner">
                <a href="#LINK" class="logo"><img src="${pageContext.request.contextPath}/images/bbs/logo.png" alt="구미전자정보기술원 구미형 소재·부품 융합얼라이언스 로고"></a>
                <div class="gnb_area">
                    <ul class="submenu">
                        <li><a href="#LINK">회원가입</a></li>
                        <li><a href="#LINK">로그인</a></li>
                    </ul>
                    <div class="gnb_box">
                        <ul class="gnb">
                            <li><a href="#LINK">융합얼라이언스</a>
                                <ul class="lnb">
                                    <li><a href="#LINK">미래유망산업소개</a></li>
                                    <li><a href="#LINK">시험분석 코디네이팅</a></li>
                                </ul>
                            </li>
                            <li><a href="#LINK">협의체</a>
                                <ul class="lnb">
                                    <li><a href="#LINK">협의체소개</a></li>
                                    <li><a href="#LINK">협의체 네트워킹</a></li>
                                </ul>
                            </li>
                            <li><a href="#LINK">기업지원</a>
                                <ul class="lnb">
                                    <li><a href="#LINK">사업공고</a></li>
                                    <li><a href="#LINK">행사안내</a></li>
                                    <li><a href="#LINK">기술이전</a></li>
                                    <li><a href="#LINK">개방형 혁신랩</a></li>
                                </ul>
                            </li>
                            <li><a href="#LINK">공동활용장비</a>
                                <ul class="lnb">
                                    <li><a href="#LINK">장비검색/예약</a></li>
                                    <li><a href="#LINK">장비이용안내</a></li>
                                    <li><a href="#LINK">담당자안내</a></li>
                                    <li><a href="#LINK">성적서 진위여부 확인</a></li>
                                </ul>
                            </li>
                            <li><a href="#LINK">알림마당</a>
                                <ul class="lnb">
                                    <li><a href="#LINK">공지사항</a></li>
                                    <li><a href="#LINK">홍보자료</a></li>
                                    <li><a href="#LINK">FAQ</a></li>
                                </ul>
                            </li>
                            <li><a href="#LINK">마이페이지</a>
                                <ul class="lnb">
                                    <li><a href="#LINK">회원정보</a></li>
                                    <li><a href="#LINK">기관/기업정보</a></li>
                                    <li><a href="#LINK">관심장비</a></li>
                                    <li><a href="#LINK">장비예약정보</a></li>
                                    <li><a href="#LINK">장비결제정보</a></li>
                                    <li><a href="#LINK">행사예약정보</a></li>
                                    <li><a href="#LINK">기술이전상담내역</a></li>
                                    <li><a href="#LINK">혁신랩예약정보</a></li>
                                </ul>
                            </li>
                        </ul>
                        
                        <button type="button" class="ham_sitemap"><img src="${pageContext.request.contextPath}/images/bbs/btn_ham.png" alt="사이트맵버튼"></button>
                    </div>
                </div>
                
                <!----------------------------------------------- 모바일 메뉴 -->
                <div class="m_gnb_area">
                    <button type="button" class="ham_menu"><img src="${pageContext.request.contextPath}/images/bbs/btn_ham.png" alt="메뉴버튼"></button>
                </div>
            </div>
            <div class="m_menu_wrap">
                <div class="m_menu_bg"></div>
                <div class="m_menu_area">
                    <div class="m_submenu">
                        <div>
                            <a href="#LINK">로그인</a>
                            <a href="#LINK">회원가입</a>
                        </div>
                        <button type="button" class="m_menuclose"><img src="${pageContext.request.contextPath}/images/bbs/m_menuclose.png" alt="메뉴닫기버튼"></button>
                    </div>

                    <ul class="m_gnb">
                        <li>
                            <a href="#LINK">융합 얼라이언스</a>
                            <ul class="m_lnb">
                                <li><a href="#LINK">미래유망산업소개</a></li>
                                <li><a href="#LINK">시험분석 코디네이팅</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#LINK">협의체</a>
                            <ul class="m_lnb">
                                <li><a href="#LINK">협의체 소개</a></li>
                                <li><a href="#LINK">협의체 네트워킹</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#LINK">기업지원</a>
                            <ul class="m_lnb">
                                <li><a href="#LINK">사업공고</a></li>
                                <li><a href="#LINK">행사안내</a></li>
                                <li><a href="#LINK">기술이전</a></li>
                                <li><a href="#LINK">개방형 혁신랩</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#LINK">공동활용장비</a>
                            <ul class="m_lnb">
                                <li><a href="#LINK">장비검색/예약</a></li>
                                <li><a href="#LINK">장비이용안내</a></li>
                                <li><a href="#LINK">담당자안내</a></li>
                                <li><a href="#LINK">성적서 진위여부 확인</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#LINK">알림마당</a>
                            <ul class="m_lnb">
                                <li><a href="#LINK">공지사항</a></li>
                                <li><a href="#LINK">홍보자료</a></li>
                                <li><a href="#LINK">FAQ</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#LINK">마이페이지</a>
                            <ul class="m_lnb">
                                <li><a href="#LINK">회원정보</a></li>
                                <li><a href="#LINK">장비결제정보</a></li>
                                <li><a href="#LINK">기관/기업정보</a></li>
                                <li><a href="#LINK">행사예약정보</a></li>
                                <li><a href="#LINK">관심장비</a></li>
                                <li><a href="#LINK">기술이전상담내역</a></li>
                                <li><a href="#LINK">장비예약정보</a></li>
                                <li><a href="#LINK">혁신랩예약정보</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </header>
        <!-- e:header -->
</body>
</html>