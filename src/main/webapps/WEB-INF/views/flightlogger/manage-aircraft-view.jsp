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
        <h2>Aircraft Information</h2>
        <p><a href="${pageContext.request.contextPath}/flightlogger/manage/aircraft/${storeInfo.store.id}/modify"><button class="btn btn-sm btn-primary" type="button">Modify Aircraft</button></a></p>
        <table class="table table-hover">
          <tbody>
          <tr>
            <th>Aircraft Name</th>
            <td>
              <p>B777-300ER</p>
            </td>
          </tr>
          <tr>
            <th>Aircraft 제조사</th>
            <td>
              <p><a href="#">PMDG</a></p>
            </td>
          </tr>
          <tr>
            <th>유료/무료</th>
            <td>
              <p>유료 (29.99 USD)</p>
            </td>
          </tr>
          <tr>
            <th>항공기 유형</th>
            <td>
              <p>Civil</p>
            </td>
          </tr>
          <tr>
            <th>이륙 거리</th>
            <td>
              <p>2,000 ft (2,500 m)</p>
            </td>
          </tr>
          <tr>
            <th>착륙 거리</th>
            <td>
              <p>2,000 ft (2,500 m)</p>
            </td>
          </tr>
          <tr>
            <th>순항거리</th>
            <td>
              <p>3,000 nm (3,600 km)</p>
            </td>
          </tr>
          <tr>
            <th>순항속도</th>
            <td>
              <p>350 knot (500 kph)</p>
            </td>
          </tr>
          <tr>
            <th>Add date</th>
            <td>
              <p>2015-10-13</p>
            </td>
          </tr>
          <tr>
            <th>Last modify date</th>
            <td>
              <p>2015-10-13</p>
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