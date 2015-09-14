<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="import/flightlogger-header.jsp"%>
<%@include file="import/flightlogger-html-topset.jsp"%>

<div id="page-wrapper">

  <div class="container-fluid">

    <!-- Page Heading -->
    <div class="row">
      <div class="col-lg-12">
        <h1 class="page-header">
          Manage Aircraft
        </h1>
        <ol class="breadcrumb">
          <li>
            <i class="fa fa-dashboard"></i>  <a href="#">Home</a>
          </li>
          <li>
            <i class="fa fa-fw fa-plane"></i> Settings
          </li>
          <li class="active">
            <i class="fa fa-fw fa-plane"></i> Manage Aircraft
          </li>
        </ol>
      </div>
    </div>
    <!-- /.row -->

    <div class="row">
      <div class="col-lg-12">
        <h2>Registered Aircraft Statistics</h2>
        <p>Total Aircraft : 3</p>
      </div>
    </div>

    <div class="row">
      <div class="col-lg-12">
        <h2>Aircraft List</h2>
        <div class="table-responsive">
          <p><a href="${pageContext.request.contextPath}/flightlogger/manage/aircraft/add"><button class="btn btn-sm btn-primary" type="button">Add Aircraft</button></a></p>
          <table class="table table-hover">
            <thead>
            <tr>
              <th>Name</th>
              <th>Type</th>
              <th>Register date</th>
            </tr>
            </thead>
            <tbody>
            <tr>
              <td><a href="${pageContext.request.contextPath}/flightlogger/manage/aircraft/1">B777-200</a></td>
              <td>Civil</td>
              <td>2015-09-15</td>
            </tr>
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