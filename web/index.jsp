<%-- 
    Document   : index
    Created on : 29/05/2014, 23:59:09
    Author     : Jeferson Amorim <amorimjj@gmail.com>
--%>
<%@page import="pintura.Classificador"%>
<%@page import="pintura.RequestHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pintura - Inteligência Artificial</title>
        <link rel="stylesheet" href="css/bootstrap.css"/>
    </head>
    <body>
        <h1>Classificador de pintura</h1>
        <form class="form-inline" role="form" method="GET">
        <div class="form-group">
          <label for="reparo">Reparo (m2)</label>
          <input type="number" step="any" class="form-control" name="reparo" placeholder="Digite reparo"  required />
        </div>
        <div class="form-group">
          <label for="espessura">Espessura (µm)</label>
          <input type="number" class="form-control" name="espessura" placeholder="Digite espessura" required />
        </div>
            <div class="form-group">
          <label for="adesao">Adesão (un.)</label>
          <input type="number" step="any" class="form-control" name="adesao" placeholder="Digite adesão" required />
        </div>
        <button type="submit" class="btn btn-default">Classificar</button>
      </form>
        <%
            double reparo = RequestHelper.getParameterFromRequest(request, "reparo");
            int espessura = (int) RequestHelper.getParameterFromRequest(request, "espessura");
            double adesao = RequestHelper.getParameterFromRequest(request, "adesao");
            if ( reparo > -1 && espessura > -1 && adesao > -1 )
                out.println("<h4>Classificação para <em>reparo " + reparo + "</em>, <em>espessura "+ espessura +"</em> e <em>adesao "+ adesao + "</em> é <strong>" + Classificador.classificar(reparo,espessura,adesao) + "</strong></h4>");
        %>
    </body>
</html>
