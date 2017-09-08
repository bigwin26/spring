<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<header id="header">
      <div class="content-container">
      
      <h1 id="logo">
         <a href="">            
            <img src="../images/logo.png" alt="뉴렉처사이트" />
         </a>
      </h1>
      <section>
         <h2 class="hidden">머릿말</h2>   

         <nav id="main-menu">
            <h1 class="hidden">
               메인메뉴
            </h1>
            <ul class="">
               <li><a href="">학습가이드</a></li>
               <li><a href="">뉴렉과정</a></li>
               <li><a href="">강좌선택</a></li>
            </ul>
         </nav>
         
         <section id="search-form">
            <h1 class="hidden">강좌검색 폼</h1>
            <form>
               <label>과정검색</label>
               <input type="text" />
               <input class="btn-img btn-search" type="submit" value="검색" />
            </form>
         </section>
         
         <nav id="member-menu" class="hr-list member-menu">   
            <h1 class="hidden">회원메뉴</h1>
            <ul>
               <li><a href="${path}/index">HOME</a></li>
               
               <li>
               <c:if test="${empty sessionScope.id}">
               <a href="${path}/member/login">로그인</a>
                </c:if>
                 <c:if test="${not empty sessionScope.id}">
               <a href="${path}/member/logout">로그아웃</a>
               </c:if>
               </li>
              
               <li><a href="${path}/member/agree">회원가입</a></li>
            </ul> 
         </nav>
            
         <nav id="custom-menu" class="hr-list">
            <h1 class="hidden">고객메뉴</h1>
            <ul>
               <li><a href="${path}/member/home"><img src="${path}/images/txt-mypage.png"  alt="마이페이지" /></a></li>
               <li><a href="${path}/customer/notice-list"><img src="../images/txt-customer.png"  alt="고객센터" /></a></li>
            </ul>
         </nav>
      </section>
      </div>
   </header>