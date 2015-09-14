<%--
  Created by IntelliJ IDEA.
  User: zephyr
  Date: 15. 8. 19.
  Time: 오전 1:43
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
          <h2>Add Flight Log</h2>
          <table class="table table-hover">
            <tbody>
            <tr>
              <th>Departure</th>
              <td>
                <p><input type="text" name="departure_time" placeholder="input departure time" class="form-control"/></p>
                <p>
                  <select name="departure_airport" class="form-control">
                    <option id="rksi">한국 인천 RKSI</option>
                  </select>
                </p>
              </td>
            </tr>
            <tr>
              <th>Arrival</th>
              <td>
                <p><input type="text" name="arrival_time" placeholder="input arrival time" class="form-control"/></p>
                <p>
                  <select name="arrival_airport" class="form-control">
                    <option id="rksi">한국 인천 RKSI</option>
                  </select>
                </p>
              </td>
            </tr>
            <tr>
              <th>Aircraft</th>
              <td>
                <p>
                  <select name="aircraft" class="form-control">
                    <option id="pmdg777300">PMDG 777-300ER</option>
                  </select>
                </p>
                <p><input type="text" placeholder="input used livery or airline company" class="form-control"/></p>
              </td>
            </tr>
            <tr>
              <th>etc Scenery</th>
              <td>
                <p><input type="checkbox"/> Korea SRTM</p>
              </td>
            </tr>
            <th>Utility</th>
            <td>
              <p><input type="checkbox"/> Active Sky Next SP2</p>
            </td>
            </tr>
            <th>Route</th>
            <td><textarea class="form-control" row="3"></textarea></td>
            </tr>
            </tbody>
          </table>
        </div>
      </div>

    </div>
    <!-- /.container-fluid -->

  </div>
  <!-- /#page-wrapper -->

<%@include file="import/flightlogger-tail.jsp"%>