<html>
<head>
    <title>Random Quote</title>
</head>
<body>
${allnews}
<g:each in="${allnews}">
    <li>${it.title}</li>
</g:each>
</body>
</html>