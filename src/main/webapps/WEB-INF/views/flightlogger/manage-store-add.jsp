<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="import/flightlogger-header.jsp"%>
<script language="JavaScript">
    $(document).ready(function() {
        $('#store-add-form').submit(function(){
            console.log('name :: ' + $('name').val());
            if(!$('#name').attr('value')) {
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
          Add Store
        </h1>
        <ol class="breadcrumb">
          <li>
            <i class="fa fa-dashboard"></i>  <a href="#">Home</a>
          </li>
          <li>
            <i class="fa fa-fw fa-plane"></i> Settings
          </li>
          <li class="active">
            <i class="fa fa-fw fa-plane"></i> Add Store
          </li>
        </ol>
      </div>
    </div>
    <!-- /.row -->

    <div class="row">
      <div class="col-lg-12">

        <form name="store-add-form" action="${pageContext.request.contextPath}/flightlogger/manage/store/add" method="post" role="form">

          <div class="form-group">
            <label>Store Name</label>
            <input class="form-control" placeholder="Enter Store Name" name="name">
          </div>

            <button type="submit" class="btn btn-default">Add</button>
        </form>

      </div>
    </div>
    <!-- /.row -->

  </div>
  <!-- /.container-fluid -->

</div>
<!-- /#page-wrapper -->

<%@include file="import/flightlogger-tail.jsp"%>