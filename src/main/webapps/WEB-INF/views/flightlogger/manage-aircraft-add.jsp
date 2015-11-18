<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="import/flightlogger-header.jsp" %>
<script language="JavaScript">
    $(document).ready(function () {
        $('#aircraft-add-form').submit(function () {
            if ($('#name').val() == '') {
                alert('항공기 이름을 입력해 주세요.');
                $('#name').focus();
                return false;
            }

            if($('#developer').val() == '') {
                alert('항공기 제조사를 입력해 주세요.');
                $('#developer').focus();
                return false;
            }

            if($('#productUrl').val() == '') {
                alert('항공기 홈페이지 URL을 입력해 주세요.');
                $('#productUrl').focus();
                return false;
            }

            if ($('#maxRange').val() == '') {
                alert('순항 거리를 입력해 주세요');
                $('#maxRange').focus();
                return false;
            }

            if($('#maxSpeed').val() == '') {
                alert('순항 속도를 입력해 주세요.');
                $('#maxSpeed').focus();
                return false;
            }

            if($('#maxTakeoffDistance').val() == '') {
                alert('이륙 거리를 입력해 주세요.');
                $('#maxTakeoffDistance').focus();
                return false;
            }

            if($('#maxLandingDistance').val() == '') {
                alert('착륙 거리를 입력해 주세요.');
                $('#maxLandingDistance').focus();
                return false;
            }

            // 유료 기체인 경우
            if($('#commercialFlag').val() == '1') {
                if($('#purchasePrice').val() == '') {
                    alert('가격을 입력해 주세요.');
                    $('#purchasePrice').focus();
                    return false;
                }
            }
        });

        $('#commercialFlag').change(function() {
            console.log("change selected :: " + $(this).val());
            if($(this).val() == '0') {
                $('#commecialInfoForm').css("display", "none");
            } else if($(this).val() == '1') {
                $('#commecialInfoForm').css("display", "");
            }
        });

    });

</script>
<%@include file="import/flightlogger-html-topset.jsp" %>

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
                        <i class="fa fa-dashboard"></i> <a href="#">Home</a>
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
                <h2>Add Aircraft</h2>

                <form id="aircraft-add-form" name="aircraft-add-form" action="${pageContext.request.contextPath}/flightlogger/manage/aircraft/add" method="post" role="form">

                    <div class="form-group">
                        <label>항공기 이름</label>
                        <input class="form-control" placeholder="Enter aircraft name" id="name" name="name"/>
                    </div>

                    <div class="form-group">
                        <label>항공기 제조사</label>
                        <input class="form-control" placeholder="Enter developer name" id="developer" name="developer"/>
                    </div>

                    <div class="form-group">
                        <label>항공기 홈페이지 URL</label>
                        <input class="form-control" placeholder="Enter aircraft product url" id="productUrl" name="productUrl"/>
                    </div>

                    <div class="form-group">
                        <label>유료/무료</label>
                        <select class="form-control" id="commercialFlag" name="commercialFlag">
                            <option value="0">무료</option>
                            <option value="1">유료</option>
                        </select>
                    </div>

                    <!--TODO 유료 시 가격 입력 부분 좀 이쁘게 바꾸자...-->
                    <div class="form-group" id="commecialInfoForm" style="display: none;">
                        <label>가격</label>
                        <select class="form-control" id="purchaseCurrency" name="purchaseCurrency">
                            <option value="USD">USD</option>
                            <option value="EUR">EUR</option>
                        </select>
                        <input type="number" class="form-control" placeholder="Enter purchase price" id="purchasePrice" name="purchasePrice"/>
                        <input class="form-control" placeholder="Enter purchase date" id="purchaseDateTime" name="purchaseDateTime"/>
                        <input type="hidden" id="softwareType" name="softwareType" value="AIRCRAFT"/>
                    </div>

                    <div class="form-group">
                        <label>항공기 유형</label>
                        <select class="form-control" id="type" name="type">
                            <option value="CIVIL">Civil</option>
                            <option value="MIL">Military</option>
                        </select>
                    </div>

                    <div class="form-group">
                        <label>이륙 거리</label>

                        <div class="form-group input-group">
                            <span class="input-group-addon">ft</span>
                            <input type="number" class="form-control" placeholder="Enter take-off distance" id="maxTakeoffDistance" name="maxTakeoffDistance"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>착륙 거리</label>

                        <div class="form-group input-group">
                            <span class="input-group-addon">ft</span>
                            <input type="number" class="form-control" placeholder="Enter landing distance" id="maxLandingDistance" name="maxLandingDistance"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>순항 거리</label>

                        <div class="form-group input-group">
                            <span class="input-group-addon">nm</span>
                            <input type="number" class="form-control" placeholder="Enter cruise range" id="maxRange" name="maxRange"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>순항 속도(knot)</label>

                        <div class="form-group input-group">
                            <span class="input-group-addon">knot</span>
                            <input type="number" min="0" max="1000" class="form-control" placeholder="Enter cruise speed" id="maxSpeed" name="maxSpeed"/>
                        </div>
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

<%@include file="import/flightlogger-tail.jsp" %>