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
                <p><input type="text" name="departure-time" placeholder="YYYY.MM.DD HH:MM" class="form-control"/></p>
                <p><input type="text" name="departure-icao" placeholder="ICAO CODE" class="form-control"/></p>
                <p><input type="text" name="departure-airport" placeholder="Airport Name" class="form-control"/> </p>
                <p><input type="text" name="departure-scenery-name" placeholder="Use scenery name" class="form-control"/> </p>
                <p><input type="text" name="departure-scenery-url" placeholder="Use scenery url" class="form-control"/> </p>
                <p>
                  <div class="form-group">
                    <div class="radio"><label><input type="radio" name="departure-scenery" value="DEFAULT"/> DEFAULT SCENERY</label></div>
                    <div class="radio"><label><input type="radio" name="departure-scenery" value="FREEWARE"/> FREEWARE SCENERY</label></div>
                    <div class="radio"><label><input type="radio" name="departure-scenery" value="OVERLAND-INCHEON"/> RKSI - [OVERLAND] INCHEON INTERNATIONAL AIRPORT (Simmarket)</label></div>
                    <div class="radio"><label><input type="radio" name="departure-scenery" value="PIS-manila"/> RPLL - PIS MANILA NINOY AQUINO INTL. (Simmarket)</label></div>
                    <div class="radio"><label><input type="radio" name="departure-scenery" value="PIS-TAOYUAN"/> RPLL - PIS TAIWAN TAOYUAN INT AIRPORT (Simmarket)</label></div>
                    <div class="radio"><label><input type="radio" name="departure-scenery" value="PIS-JEJU"/> RKPC - PIS Jeju International (FSPilotShop)</label></div>
                    <div class="radio"><label><input type="radio" name="departure-scenery" value="TAXI2GATE-HAMAD"/> RPLL - TAXI2GATE HAMAD INTL AIRPORT (Simmarket)</label></div>
                    <div class="radio"><label><input type="radio" name="departure-scenery" value="TAXI2GATE-HONGKONG"/> VHHH - TAXI2GATE HONG KONG INTERNATIONAL AIRPORT (Simmarket)</label></div>
                    <div class="radio"><label><input type="radio" name="departure-scenery" value="WINGCREATION-NARITA"/> RJAA - [WING CREATION INC] NARITA INTERNATIONAL AIRPORT (Simmarket)</label></div>
                    <div class="radio"><label><input type="radio" name="departure-scenery" value="WINGCREATION-NAGASAKI"/> RJFU - [WING CREATION INC] NAGASAKI (Simmarket)</label></div>
                    <div class="radio"><label><input type="radio" name="departure-scenery" value="THAICREATION-DONMUEANG"/> RJFU - [THAI CREATION] SAWASDEE BANGKOK : DON MUEANG INTERNATIONAL AIRP (Simmarket)</label></div>
                    <div class="radio"><label><input type="radio" name="departure-scenery" value="THAICREATION-CHHATRAPATISHIVAJI"/> RJFU - [THAI CREATION] NAMASTE MUMBAI : CHHATRAPATI SHIVAJI INTERNATION (Simmarket)</label></div>
                    <div class="radio"><label><input type="radio" name="departure-scenery" value="THAICREATION-MACAU"/> RJFU - [THAI CREATION] NI HAO MACAU: MACAU INTERNATIONAL AIRPORT (Simmarket)</label></div>
                    <div class="radio"><label><input type="radio" name="departure-scenery" value="THAICREATION-TRIBHUVAN"/> RJFU - [THAI CREATION] NAMASTE NEPAL: TRIBHUVAN INTL AIRPORT (Simmarket)</label></div>
                    <div class="radio"><label><input type="radio" name="departure-scenery" value="IMAGINESIM-SINGAPORE"/> WSSS - [imaginesim] WSSS SINGAPORE (imaginesim)</label></div>
                    <div class="radio"><label><input type="radio" name="departure-scenery" value="IMAGINESIM-SHANGHAI"/> ZSPD - [imaginesim] ZSPD SHANGHAI PUDONG (imaginesim)</label></div>
                  </div>
                </p>
              </td>
            </tr>
            <tr>
              <th>Arrival</th>
              <td>
                <p><input type="text" name="arrival-time" placeholder="YYYY.MM.DD HH:MM" class="form-control"/></p>
                <p><input type="text" name="arrival-icao" placeholder="ICAO CODE" class="form-control"/></p>
                <p><input type="text" name="arrival-airport" placeholder="Airport Name" class="form-control"/> </p>
                <p><input type="text" name="arrival-scenery-name" placeholder="Use scenery name" class="form-control"/> </p>
                <p><input type="text" name="arrival-scenery-url" placeholder="Use scenery url" class="form-control"/> </p>
                <p>
                <div class="form-group">
                  <div class="radio"><label><input type="radio" name="arrival-scenery" value="DEFAULT"/> DEFAULT SCENERY</label></div>
                  <div class="radio"><label><input type="radio" name="arrival-scenery" value="FREEWARE"/> FREEWARE SCENERY</label></div>
                  <div class="radio"><label><input type="radio" name="arrival-scenery" value="OVERLAND-INCHEON"/> RKSI - [OVERLAND] INCHEON INTERNATIONAL AIRPORT (Simmarket)</label></div>
                  <div class="radio"><label><input type="radio" name="arrival-scenery" value="PIS-manila"/> RPLL - PIS MANILA NINOY AQUINO INTL. (Simmarket)</label></div>
                  <div class="radio"><label><input type="radio" name="arrival-scenery" value="PIS-TAOYUAN"/> RPLL - PIS TAIWAN TAOYUAN INT AIRPORT (Simmarket)</label></div>
                  <div class="radio"><label><input type="radio" name="arrival-scenery" value="PIS-JEJU"/> RKPC - PIS Jeju International (FSPilotShop)</label></div>
                  <div class="radio"><label><input type="radio" name="arrival-scenery" value="TAXI2GATE-HAMAD"/> RPLL - TAXI2GATE HAMAD INTL AIRPORT (Simmarket)</label></div>
                  <div class="radio"><label><input type="radio" name="arrival-scenery" value="TAXI2GATE-HONGKONG"/> VHHH - TAXI2GATE HONG KONG INTERNATIONAL AIRPORT (Simmarket)</label></div>
                  <div class="radio"><label><input type="radio" name="arrival-scenery" value="WINGCREATION-NARITA"/> RJAA - [WING CREATION INC] NARITA INTERNATIONAL AIRPORT (Simmarket)</label></div>
                  <div class="radio"><label><input type="radio" name="arrival-scenery" value="WINGCREATION-NAGASAKI"/> RJFU - [WING CREATION INC] NAGASAKI (Simmarket)</label></div>
                  <div class="radio"><label><input type="radio" name="arrival-scenery" value="THAICREATION-DONMUEANG"/> RJFU - [THAI CREATION] SAWASDEE BANGKOK : DON MUEANG INTERNATIONAL AIRP (Simmarket)</label></div>
                  <div class="radio"><label><input type="radio" name="arrival-scenery" value="THAICREATION-CHHATRAPATISHIVAJI"/> RJFU - [THAI CREATION] NAMASTE MUMBAI : CHHATRAPATI SHIVAJI INTERNATION (Simmarket)</label></div>
                  <div class="radio"><label><input type="radio" name="arrival-scenery" value="THAICREATION-MACAU"/> RJFU - [THAI CREATION] NI HAO MACAU: MACAU INTERNATIONAL AIRPORT (Simmarket)</label></div>
                  <div class="radio"><label><input type="radio" name="arrival-scenery" value="THAICREATION-TRIBHUVAN"/> RJFU - [THAI CREATION] NAMASTE NEPAL: TRIBHUVAN INTL AIRPORT (Simmarket)</label></div>
                  <div class="radio"><label><input type="radio" name="arrival-scenery" value="IMAGINESIM-SINGAPORE"/> WSSS - [imaginesim] WSSS SINGAPORE (imaginesim)</label></div>
                  <div class="radio"><label><input type="radio" name="arrival-scenery" value="IMAGINESIM-SHANGHAI"/> ZSPD - [imaginesim] ZSPD SHANGHAI PUDONG (imaginesim)</label></div>
                </div>
                </p>
              </td>
            </tr>
            <tr>
              <th>Aircraft</th>
              <td>
                <p><input type="text" placeholder="input used livery or airline company" class="form-control"/></p>
                <p>
                <div class="form-group">
                  <div class="radio"><label><input type="radio" name="aircraft" value="PMDG-777"/> [PMDG] B777-200/300 (PMDG)</label></div>
                  <div class="radio"><label><input type="radio" name="aircraft" value="PMDG-737NG"/> [PMDG] 737NG (PMDG)</label></div>
                  <div class="radio"><label><input type="radio" name="aircraft" value="PMDG-747"/> [PMDG] Queen of skies B747-400 (PMDG)</label></div>
                  <div class="radio"><label><input type="radio" name="aircraft" value="FLIGHT1-146"/> [Flight1] QualityWings Ultimate 146 Collection (FSPilotShop)</label></div>
                  <div class="radio"><label><input type="radio" name="aircraft" value="REALAIR-LEGACY"/> [RealAir] LANCAIR LEGACY (RealAir)</label></div>
                </div>
                </p>
              </td>
            </tr>
            <tr>
              <th>etc Scenery</th>
              <td>
                <div class="form-group">
                  <div class="radio"><label><input type="checkbox" name="etc-scenery" value="DCMAN-KOREASRTM"/> [DCMAN] Korea SRTM</label></div>
                  <div class="radio"><label><input type="checkbox" name="etc-scenery" value="ORBX-FTXGLOBALBASE"/> [ORBX] FTX: Global Base (Flight Sim Store)</label></div>
                  <div class="radio"><label><input type="checkbox" name="etc-scenery" value="ORBX-FTXGLOBALVECTOR"/> [ORBX] FTX: Global VECTOR (Flight Sim Store)</label></div>
                  <div class="radio"><label><input type="checkbox" name="etc-scenery" value="FREEMESHX-ASIS"/> [FreemeshX] FreemeshX Global - Asia mesh</label></div>
                </div>
              </td>
            </tr>
            <th>Utility</th>
            <td>
              <div class="form-group">
                <div class="radio"><label><input type="checkbox" name="utility" value="REX-REX4"/> [REX] REX4 TEXTURE DIRECT HD (Simmarket)</label></div>
                <div class="radio"><label><input type="checkbox" name="utility" value="REX-SOFTCLOUDS"/> [REX] Soft Clouds (FSPilotShop)</label></div>
                <div class="radio"><label><input type="checkbox" name="utility" value="HIFITECH-ASN"/> [HIFI TECH] ACTIVE SKY NEXT SP2 (Simmarket)</label></div>
                <div class="radio"><label><input type="checkbox" name="utility" value="EZDOK-CAMERA"/> [EzDok] Camera (EzDok)</label></div>
              </div>
            </td>
            </tr>
            <th>AI Traffic</th>
            <td>
              <div class="form-group">
                <div class="radio"><label><input type="checkbox" name="ai-traffic" value="SKYAI"/> SKY AI</label></div>
                <div class="radio"><label><input type="checkbox" name="ai-traffic" value="ATPK"/> AIR TRAFFIC PROJECT KOREA</label></div>
                <div class="radio"><label><input type="checkbox" name="ai-traffic" value="ATP"/> ADOBE TRAFFIC PACK</label></div>
              </div>
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