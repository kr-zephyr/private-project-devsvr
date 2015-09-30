<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="import/flightlogger-header.jsp"%>
<script language="JavaScript">
  $(document).ready(function() {
    $('#store-modify-form').submit(function(){
      if($('#name').val() == '') {
        alert('Please input store name.');
        $('#name').focus();
        return false
      }
    });
  });
</script>
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
        <form id="store-modify-form" name="store-modify-form" action="${pageContext.request.contextPath}/flightlogger/manage/store/${storeInfo.store.id}/modify" method="put" role="form">
          <h2>Store Information</h2>
          <table class="table table-hover">
            <tbody>
            <tr>
              <th>Store Name</th>
              <td>
                <input type="text" value="${storeInfo.store.name}" id="name" name="name"/>
              </td>
            </tr>
            <tr>
              <th>Store Url</th>
              <td>
                <input type="text" value="${storeInfo.store.siteUrl}" name="siteUrl"/>
              </td>
            </tr>
            <tr>
              <th>Add date</th>
              <td>
                <p>${storeInfo.addedDateString}</p>
              </td>
            </tr>
            <tr>
              <th>Last modify date</th>
              <td>
                <p>${storeInfo.modifiedDateString}</p>
              </td>
            </tr>
            </tbody>
          </table>
          <button type="submit" class="btn btn-default">Modify</button>
        </form>
      </div>
    </div>
    <!-- /.row -->

  </div>
  <!-- /.container-fluid -->

</div>
<!-- /#page-wrapper -->

<%@include file="import/flightlogger-tail.jsp"%>