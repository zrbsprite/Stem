<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="initial-scale=1, width=device-width,user-scalable=no">
    <title>${bean.title?default("")}</title>
	<#include "commons/tiglib.ftl"/>
</head>
<body>
	${bean.content?default("")}
</body>
</html>