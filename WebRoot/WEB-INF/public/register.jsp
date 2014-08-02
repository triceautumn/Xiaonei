<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head> 
    <title>校内用户注册</title>
    <link rel="stylesheet" type="text/css" href="/xiaoneinew/css/common.css"/>
	<link rel="stylesheet" type="text/css" href="/xiaoneinew/css/register.css"/>
 	<script type="text/javascript" src="/xiaoneinew/js/jquery-1.3.1.js"></script>
 	<script type="text/javascript" src="/xiaoneinew/js/publicJs.js"></script>
 	<script type="text/javascript" src="/xiaoneinew/myAJAX/ajax_uni.js"></script>
 	
 
 
  </head>
  <body>
   <jsp:include page="head.jsp"/>
   
   <div class="reg_main_frame">
   <!-- 加入校内后，可以选择... -->
   <div class="play_item">
   <img src="/xiaoneinew/images/front/jiaru.jpg" />
   </div>
   <!-- 注册用的表格 -->
   <div class="reg_table1">
   <span class="font6">简单一步，快速注册</span><br/>
   <form action="/xiaoneinew/register.do?flag=regUser"  method="post">
   <table>
   <tr>
   <td class="tab_td1">真实姓名:</td>
   <td class="tab_td2"><input type="text" name="name"/></td>
   <td><span class="spanVal">请输入真实姓名　　　　　</span></td>
   </tr>
   <tr>
   <td class="tab_td1">性别:</td>
   <td><input type="radio" name="sex" />男<input type="radio" name="sex"/>女</td>
   <td></td>
   </tr>
   <tr>
   <td class="tab_td1">身份:</td>
   <td>
   <select size="4"  onchange="changeStatus(this);">
   <option value="worker">已工作</option>
   <option value="graduate">大学生</option>
   <option value="midstu">中学生/中专技校</option>
   <option value="nothing">以上都不是</option>
   </select>
   </td>
   <td></td>
   </tr>
   <!-- 考虑已经工作的情况 start -->
   <tr class="worker_sep">
   <td class="tab_td1">居住地:</td>
   <td>
   <select>
    <option>----省份----</option>
   	<option>四川省</option>
   	<option>山东省</option>
   	<option>重庆市</option>
   </select>
   </td>
   <td></td>
   </tr>
   <tr class="worker_sep">
   <td></td>
   <td>
   <select>
   <option>--选择城市--</option>
   <option>成都市</option>
   <option>广元市</option>
   <option>自贡市</option>
   </select>
   </td>
   <td></td>
   </tr>
   <tr class="worker_sep">
   <td class="tab_td1">公司:</td>
   <td><input type="input" name="??" /></td>
   <td></td>
   </tr>
    <!-- 考虑已经工作的情况 end -->
    <!-- 考虑大学生要输入的特别信息 start -->
   <tr class="gra_spe" >
   <td class="tab_td1">类型:</td>
   <td>
   <select name="userType">
   <option value="graduate">大学生</option>
   <option value="master">硕士</option>
   <option value="doctor">博士</option>
   </select>
   </td>
   <td></td>
   </tr>
   <tr class="gra_spe">
   <td class="tab_td1">大学:</td>
   <td>
   <!-- 隐藏一个大学的id,注册一个用户，应当以大学编号为准，而不能以大学的名称为准 -->
   <input type="hidden" name="universityId" id="uuniversity" />
   <input id="university" onclick="showUniTbl();" type="text" name="" />
   </td>
   <td></td>
   </tr>
   <!-- 考虑大学生要输入的特别信息 end -->
   <tr>
   <td class="tab_td1">电子邮箱:<br/>&nbsp;</td>
   <td>
   <input type="text" name="email" /><br/>
   <img src="/xiaoneinew/images/front/tanhao.png" />如果没有邮箱，请注册<a href="#">Hotmail</a>邮箱。
   </td>
   <td></td>
   </tr>
   <tr>
   <td class="tab_td1">设置密码: </td>
   <td><input type="password" name="pwd"/></td>
   <td></td>
   </tr>
   <tr>
   <td class="tab_td1">确认密码: </td>
   <td><input type="password" name="pwd2"/></td>
   <td></td>
   </tr>
   <tr>
   <td class="tab_td1">验证码: </td>
   <td>请输入以下验证码，看不清换一张? </td>
   <td>[1234]</td>
   </tr>
    <tr>
   <td></td>
   <td><input name="submit" type="submit" value="" class="button1" /></td>
   <td></td>
   </tr>
    <tr>
   <td></td>
   <td><input type="checkbox" name="??" /><span class="font3">&nbsp;我已阅读并同意遵守</span> <a href="#">校内网服务条款</a> </td>
   <td></td>
   </tr>
   </table>
   </form>	
   </div>	
   </div>
   <jsp:include page="foot.jsp"/>
<!-- 准备显示的大学表格 start -->
<div class="divSch" id="uniDiv"
	style="display: none; position: absolute; top: 50px; left: 750px">
	<table border="1" align="center" height="380px" width="500px"
		bordercolor="#3B5888">
		<!-- 显示所有国家 -->
		<tr>
			<td bordercolor="#C3C3C3" width="500px">
			<c:forEach  var="country" items="${countrylist}">
			<a id="${country.id }" onclick="setCoUnis(this)" class="xh"
			href="javascript:void(0);">${country.name }</a> |
			</c:forEach>
			</td>
		</tr>
		<!-- 显示当前国家的所有直辖市和省份 -->
		<tr>
		<td bordercolor="#C3C3C3">
			<div id="proTbl">
				<table width="100%">
					<tr>
						
							<td>
							<c:forEach var="province" items="${provincelist}">
							<a onclick='setProUnis(this)' href="javascript:void(0);"
							class="xh" id="${province.id}" coId="${province.country.id }">
							${province.name } </a>
							</c:forEach>
							</td>
							
					</tr>
				</table>
			</div>
		</tr>
		<!-- 显示当前省或者直辖市的大学 -->
		<tr>
		<td valign="top" bordercolor="#C3C3C3">
			<div style="width: 550px; height: 280px; overflow: auto"
				id="uniTbl">
				<table width="100%">
					<tr>
					<c:forEach var="university" items="${unilist}" varStatus="vs">
					<td><li>
					<a onclick='showMyUni(this)' href="javascript:void(0);"
					class="xh"  id="${university.id }">${university.name }</a></li></td>
					<c:if test="${vs.count%3==0}"></tr><tr></c:if>
					</c:forEach>
					</tr>
					
				</table>
			</div>
			</td>
			</tr>
			<tr>
			<td align="right" bordercolor="#FFFFFF">
				<input type="button" value="关闭窗口" onclick="closeUniTbl()"
					style="color: white; background-color: #3B5888; padding: 3px;" />
				<br />
				<br />
				<br />
				<br />
			</td>
			</tr>
	</table>
</div>
<!-- 准备显示的大学表格 end -->
  </body>
</html>
