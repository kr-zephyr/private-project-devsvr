<%--
  Created by IntelliJ IDEA.
  User: zephyr
  Date: 15. 8. 19.
  Time: 오전 1:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
<div class="collapse navbar-collapse navbar-ex1-collapse">
  <ul class="nav navbar-nav side-nav">
    <li>
      <a href="${pageContext.request.contextPath}/flightlogger/logger"><i class="fa fa-fw fa-plane"></i> Flight Log</a>
    </li>
    <li>
      <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-cogs"></i> Settings <i class="fa fa-fw fa-caret-down"></i></a>
      <ul id="demo" class="collapse">
        <li>
          <a href="${pageContext.request.contextPath}/flightlogger/manage/store">Manage Store</a>
        </li>
        <li>
          <a href="${pageContext.request.contextPath}/flightlogger/manage/aircraft">Manage Aircraft</a>
        </li>
        <li>
          <a href="#">Manage Scenery</a>
        </li>
        <li>
          <a href="#">Manage Utility</a>
        </li>
      </ul>
    </li>
  </ul>
</div>
<!-- /.navbar-collapse -->
