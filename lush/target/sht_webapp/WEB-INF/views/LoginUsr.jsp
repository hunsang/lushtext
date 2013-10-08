<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="content-language" content="ko">
<script type="text/javascript">
<!--
	function actionLogin() {

		if (document.loginForm.id.value == "") {
			alert("아이디를 입력하세요");
			return false;
		} else if (document.loginForm.password.value == "") {
			alert("비밀번호를 입력하세요");
			return false;
		} else {
			document.loginForm.action = "<c:url value='/uat/uia/actionLogin.do'/>";
			//document.loginForm.j_username.value = document.loginForm.userSe.value + document.loginForm.username.value;
			//document.loginForm.action="<c:url value='/j_spring_security_check'/>";
			document.loginForm.submit();
		}
	}

	function setCookie(name, value, expires) {
		document.cookie = name + "=" + escape(value) + "; path=/; expires="
				+ expires.toGMTString();
	}

	function getCookie(Name) {
		var search = Name + "="
		if (document.cookie.length > 0) { // 쿠키가 설정되어 있다면
			offset = document.cookie.indexOf(search)
			if (offset != -1) { // 쿠키가 존재하면
				offset += search.length
				// set index of beginning of value
				end = document.cookie.indexOf(";", offset)
				// 쿠키 값의 마지막 위치 인덱스 번호 설정
				if (end == -1)
					end = document.cookie.length
				return unescape(document.cookie.substring(offset, end))
			}
		}
		return "";
	}

	function saveid(form) {
		var expdate = new Date();
		// 기본적으로 30일동안 기억하게 함. 일수를 조절하려면 * 30에서 숫자를 조절하면 됨
		if (form.checkId.checked)
			expdate.setTime(expdate.getTime() + 1000 * 3600 * 24 * 30); // 30일
		else
			expdate.setTime(expdate.getTime() - 1); // 쿠키 삭제조건
		setCookie("saveid", form.id.value, expdate);
	}

	function getid(form) {
		form.checkId.checked = ((form.id.value = getCookie("saveid")) != "");
	}
//-->
</script>
</head>
<body>
	<form:form name="loginForm" method="post" action="#LINK">
			<ul>
				<li><label for="id"><img alt="login"
						src="<c:url value='/'/>images/login/img_idtext.gif" /></label> <input
					type="text" class="input_style" title="아이디를 입력하세요." id="id"
					name="id" maxlength="10" /></li>
				<li><label for="password"><img alt="password"
						src="<c:url value='/'/>images/login/img_pwtext.gif" /></label> <input
					type="password" class="input_style" maxlength="25"
					title="비밀번호를 입력하세요." id="password" name="password"
					onkeydown="javascript:if (event.keyCode == 13) { actionLogin(); }" />
				</li>
				<li><input type="checkbox" name="checkId"
					onclick="javascript:saveid(this.form);" id="checkId" /><label
					for="checkId">ID저장</label></li>
			</ul>
			<input type="image" alt="로그인 버튼" class="btn_style"
				onclick="javascript:actionLogin()"
				src="<c:url value='/'/>images/login/btn_login.gif" />
</body>
</html>
