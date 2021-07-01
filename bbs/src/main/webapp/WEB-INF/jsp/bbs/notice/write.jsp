<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file ="/WEB-INF/jsp/bbs/inc/header.jsp" %>
</head>
<body>
<script>
<!-- 게시판 정보 등록 -->
function fn_save(){
	var url = "";
	
	if("${flag}" == "write"){
		url = "<c:url value='/notice/insert.do'/>"
	}else{
		url = "<c:url value='/notice/update.do'/>"
	}

	if(!validation()){
		return;
	}
	
	if(!confirm("저장하시겠습니까?")){
		return;
	}
	
	document.noticeWrite.action = url;
	document.noticeWrite.submit();
}

function validation(){
	
	if(document.noticeWrite.bdTitle.value == ""){
		alert("제목을 입력해주세요.");
		document.noticeWrite.bdTitle.focus();
		return;
	}
	
	if(document.noticeWrite.bdWriter.value == ""){
		alert("작성자를 입력해주세요.");
		document.noticeWrite.bdTitle.focus();
		return;
	}
	
	if(document.noticeWrite.bdContents.value == ""){
		alert("내용을 입력해주세요.");
		document.noticeWrite.bdTitle.focus();
		return;
	}
	

	return true;
}

function fn_cancel(){
	if (!confirm("저장되지 않은 데이터는 지워집니다. 계속하시겠습니까?"))
		return;
	var url = "<c:url value='/notice/list.do'/>";	
		
	document.noticeWrite.action = url;
	document.noticeWrite.submit();	
}
function fn_checked(obj){
	var checked = obj.checked;
	if(checked) {
		obj.value = "1";
	} else {
		obj.value = "0";
	}
} 
</script>
<%-- <form:form commandName="noticeWrite" name="noticeWrite" method="post" enctype="multipart/form-data"> --%>
<form commandName="noticeWrite" name="noticeWrite" method="post">

 <!-- s:container -->
        <div class="container">
            <div class="inner">
                <ul class="sub_nav">
                    <li>홈</li>
                    <li>알림마당</li>
                    <li>공지사항</li>
                </ul>
                
                <div class="titleBox"> 
                    <h1>공지사항</h1>
                </div>
                
                <div class="category">
                    <a href="#LINK" class="on">공지사항</a>
                    <a href="#LINK">홍보자료</a>
                    <a href="#LINK">FAQ</a>
                </div>
                <div class="table_wrap">
                    <table class="st02">
                        <caption>협의체 네트워킹을 정렬하였으며 제목, 협의체, 작성자, 첨부파일, 내용을 제공합니다.</caption>
                        <colgroup>
                            <col width="7.81%">
                            <col>
                            <col width="7.81%">
                            <col width="18.25%">
                        </colgroup>
                        
                        <tr>
                            <th>제목</th>
                            <td colspan="3">
                                <input type="text" class="inputW1000" name="bdTitle">
                            </td>
                        </tr>
                        <tr>
                            <th>작성자</th>
                            <td>
                                <input type="text" name="bdWriter">
                            </td>
                            <th>상단고정</th>
                            <td>
                           		<input type="checkbox" name="fixtop" onchange="fn_checked(this)" id="fixtop">
                                <label for="fixtop"></label>
                            </td>
                        </tr>
                        <tr>
                            <th>첨부파일</th>
                            <td colspan="3" class="file">
                                <div>
                                    <input type="text" class="inputW600">
                                    <button type="button" class="btn12 btn_grey">파일선택</button>
                                </div>
                                <div>
                                    <p>협의체 네트워킹 소개.pdf</p>
                                    <button type="button"><img src="${pageContext.request.contextPath}/images/bbs/file_delete.png"></button>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4" class="table_text"><textarea name="bdContents"></textarea></td>
                        </tr>
                    </table>
                    
                    <div class="tableBtn_area">
                        <div class="leftBtn">
                            <button class="btn10 btn_grey_line" onclick="javascript:fn_cancel();">취소</button>
                        </div>
                        <div class="rightBtn">
                            <button class="btn10 btn_blue" onclick="javascript:fn_save();">등록</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%-- </form:form> --%>
        </form>
        <!-- e:container -->
        <%@ include file ="/WEB-INF/jsp/bbs/inc/footer.jsp" %>
</body>
</html>