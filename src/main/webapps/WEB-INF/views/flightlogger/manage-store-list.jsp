<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="import/flightlogger-header.jsp"%>
<%@include file="import/flightlogger-html-topset.jsp"%>

<div id="page-wrapper">

  <div class="container-fluid">

    <!-- Page Heading -->
    <div class="row">
      <div class="col-lg-12">
        <h1 class="page-header">
          Manage Store
        </h1>
        <ol class="breadcrumb">
          <li>
            <i class="fa fa-dashboard"></i>  <a href="#">Home</a>
          </li>
          <li>
            <i class="fa fa-fw fa-plane"></i> Settings
          </li>
          <li class="active">
            <i class="fa fa-fw fa-plane"></i> Manage Store
          </li>
        </ol>
      </div>
    </div>
    <!-- /.row -->

    <div class="row">
      <div class="col-lg-12">
        <h2>Store List</h2>
        <div class="table-responsive">
          <p><a href="${pageContext.request.contextPath}/flightlogger/manage/store/add"><button class="btn btn-sm btn-primary" type="button">Add Store</button></a></p>
          <table class="table table-hover">
            <thead>
            <tr>
              <th>Name</th>
              <th>Site Url</th>
              <th>Registered applications</th>
              <th>Register date</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${storeList}" var="store" varStatus="idx">
              <tr>
                <td><a href="${pageContext.request.contextPath}/flightlogger/manage/store/${store.id}">${store.name}</a></td>
                <td><a href="${store.siteUrl}" target="_blank">${store.siteUrl}</a></td>
                <td></td>
                <td>${store.rowCreateTime}</td>
              </tr>
            </c:forEach>
            </tbody>
          </table>
        </div>
      </div>
    </div>
    <!-- /.row -->

  </div>
  <!-- /.container-fluid -->

</div>
<!-- /#page-wrapper -->

<%@include file="import/flightlogger-tail.jsp"%>