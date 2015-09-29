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
        <h2>Store Information</h2>
        <p><a href="${pageContext.request.contextPath}/flightlogger/manage/store/${storeInfo.store.id}/modify"><button class="btn btn-sm btn-primary" type="button">Modify Store</button></a></p>
        <table class="table table-hover">
          <tbody>
          <tr>
            <th>Store Name</th>
            <td>
              <p>${storeInfo.store.name}</p>
            </td>
          </tr>
          <tr>
            <th>Store Url</th>
            <td>
              <p>${storeInfo.store.siteUrl}</p>
            </td>
          </tr>
          </tbody>
        </table>
      </div>
    </div>
    <!-- /.row -->

  </div>
  <!-- /.container-fluid -->

</div>
<!-- /#page-wrapper -->

<%@include file="import/flightlogger-tail.jsp"%>