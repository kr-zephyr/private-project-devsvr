<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="import/flightlogger-header.jsp"%>
<%@include file="import/flightlogger-html-topset.jsp"%>

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        Flight Log
                    </h1>
                    <ol class="breadcrumb">
                        <li>
                            <i class="fa fa-dashboard"></i>  <a href="#">Home</a>
                        </li>
                        <li class="active">
                            <i class="fa fa-fw fa-plane"></i> Flight Log
                        </li>
                    </ol>
                </div>
            </div>
            <!-- /.row -->

            <div class="row">
                <div class="col-lg-12">
                    <h2>Flight Statistics</h2>
                    <p>Total Flight Time : 10:12</p>
                    <p>Total Flight Count : 4 sorties</p>
                    <p>Visited Airport Count : 4 visited</p>
                    <p>Visited Country : 3 countries</p>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-12">
                    <h2>Flight Log</h2>
                    <div class="table-responsive">
                        <p><a href="${pageContext.request.contextPath}/flightlogger/logger/add"><button class="btn btn-sm btn-primary" type="button">Add Flight Log</button></a></p>
                        <table class="table table-hover">
                            <thead>
                            <tr>
                                <th>Flight Date</th>
                                <th>Simulator</th>
                                <th>Aircraft</th>
                                <th>Departure(Time of UTC)</th>
                                <th>Arrival(Time of UTC)</th>
                                <th>Flight Time</th>
                                <th>Operation</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td><a href="${pageContext.request.contextPath}/flightlogger/logger/1">2015.08.11</a></td>
                                <td>FSX:SE</td>
                                <td>B777-300ER All Nippon Airways</td>
                                <td>일본 나리타 (05:00)</td>
                                <td>일본 나리타 (05:30)</td>
                                <td>00:30</td>
                                <td>Scenery Check</td>
                            </tr>
                            <tr>
                                <td>2015.08.10</td>
                                <td>FSX:SE</td>
                                <td>B777-300ER Singapore Air</td>
                                <td>한국 인천 (01:00)</td>
                                <td>싱가포르 창이 (07:42)</td>
                                <td>06:42</td>
                                <td>Scheduled</td>
                            </tr>
                            <tr>
                                <td>2015.07.13</td>
                                <td>FSX:SE</td>
                                <td>B777-200LR Jin Air</td>
                                <td>한국 제주 (00:35)</td>
                                <td>한국 인천 (01:35)</td>
                                <td>01:00</td>
                                <td>Scheduled</td>
                            </tr>
                            <tr>
                                <td>2015.07.06</td>
                                <td>FSX:SE</td>
                                <td>B777-200LR Asiana Air</td>
                                <td>한국 인천 (01:20)</td>
                                <td>한국 제주 (02:20)</td>
                                <td>01:00</td>
                                <td>Scheduled</td>
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