<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="<%=request.getContextPath() %>"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${ctx}/easyui1.5/jquery.min.js"></script>
<script type="text/javascript"
	src="${ctx}/easyui1.5/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${ctx }/easyui1.5/locale/easyui-lang-zh_CN.js"></script>
<link href="${ctx}/easyui1.5/themes/icon.css" type="text/css"
	rel="stylesheet">
<link href="${ctx}/easyui1.5/themes/default/easyui.css" type="text/css"
	rel="stylesheet">
</head>
<body class="easyui-layout">
	<div data-options="region:'north',title:'North Title',split:true"
		style="height: 100px;"></div>
	<div data-options="region:'south',title:'South Title',split:true"
		style="height: 100px;"></div>
	<div
		data-options="region:'east',iconCls:'icon-reload',title:'East',split:true"
		style="width: 100px;"></div>
	<div data-options="region:'west',title:'West',split:true"
		style="width: 100px;"></div>
	<div data-options="region:'center',title:'center title'"
		style="padding: 5px; background: #eee;"></div>
</body>
</html>