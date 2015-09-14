<%--
  Created by IntelliJ IDEA.
  User: zephyr
  Date: 15. 8. 19.
  Time: 오전 1:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
                            <i class="fa fa-fw fa-plane"></i> <a href="#">Flight Log</a>
                        </li>
                        <li class="active">
                            <i class="fa fa-table"></i> Flight Log Detail
                        </li>
                    </ol>
                </div>
            </div>
            <!-- /.row -->

            <div class="row">
                <div class="col-lg-12">
                    <h2>Debrief of Flight</h2>
                    <table class="table table-hover">
                        <tbody>
                        <tr>
                            <th>Departure</th>
                            <td>
                                <p>2015.08.11 05:00</p>
                                <p>일본 나리타 (Wings Creation Narita - Payware)</p>
                            </td>
                        </tr>
                        <tr>
                            <th>Arrival</th>
                            <td>
                                <p>2015.08.11 05:30</p>
                                <p>일본 나리타 (Wings Creation Narita - Payware)</p>
                            </td>
                        </tr>
                        <tr>
                            <th>Flight Time</th>
                            <td></td>
                        </tr>
                        <tr>
                            <th>Aircraft</th>
                            <td></td>
                        </tr>
                        <tr>
                            <th>etc Scenery</th>
                            <td></td>
                        </tr>
                        <th>Utility</th>
                        <td></td>
                        </tr>
                        <th>Route</th>
                        <td></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-12">
                    <h2>Flight Map</h2>
                </div>
            </div>

        </div>
        <!-- /.container-fluid -->

    </div>
    <!-- /#page-wrapper -->

<%@include file="import/flightlogger-tail.jsp"%>