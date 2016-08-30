<html>
<head>
    <title>Latest News</title>
</head>
<body>
<g:if test="${currentnews}">
    <h1>${currentnews.title}</h1>
    <p>
        ${currentnews.fulltxt}
    </p>
</g:if>
<g:link action="home"> RETURN TO LIST OF ALL NEWS... </g:link>
</body>
</html>