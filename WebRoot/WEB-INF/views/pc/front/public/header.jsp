<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="header">
	<div class="header_top">
		<div class="top_info clearfix">
			<div class="logo_style l_f">
				<a href="/front/homePage.fjsp"><img src="/views/front/images/logo.jpg" /></a>
			</div>
			<div class="Search_style l_f">
				<div class="select">
<!-- 					<select id="homePage_search"> -->
						<h3 style="height:35px; line-height:35px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品&nbsp;&nbsp;&nbsp;</h3>
<!-- 					</select> -->
				</div>
				<input type="text" class="add_Search" /> 
				<input type="button" class="submit_Search" onclick="header_toSearch(0)"/>
			</div>
			<div class="Cart_user r_f">
				<a href="javascript:window.location.href='/front/shoppingCart.fjsp';" class="Cart_Quantity" >
					<span class="digital number">0</span>
				</a>
				<div class="header_operating l_f">
					<span class="header_touxiang">
						<img src="/views/front/images/touxiang_03.png" />
					</span> 
					<a href="/front/login.fjsp">登录</a>
					<a href="/front/register.fjsp">注册</a>
				</div>
			</div>
		</div>
		<div class="header_menu">
			<!--菜单导航栏-->
			<ul class="menu" id="nav">
				<li class="nLi"><a href="/front/homePage.fjsp">网站首页</a></li>
				<li class="nLi"><a href="/front/type.fjsp">分类搜索</a></li>
<!-- 				<li class="nLi"><a href="/front/merchantList.fjsp">商店列表</a></li> -->
			</ul>
		</div>
	</div>
</div>