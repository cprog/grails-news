<%--
  Created by IntelliJ IDEA.
  User: omdv
  Date: 8/25/16
  Time: 11:22 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Breaking News</title>
</head>

<body>
<h1>Breaking News</h1>

<div class="container-fluid">
    <div class="row">
        <div class="col-lg-12 col-md-12">
            <ul>
                <g:each in="${allnews}">
                    <li><h6 class="tit">${it.title}</h6>

                        <p>${it.newsabstract}</p>
                        <g:link action="random" params="[tid:it.id]"> READ MORE... </g:link>

                    </li>
                </g:each>
            </ul></div>
    </div>
</div>
</body>
</html>