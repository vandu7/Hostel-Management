<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage2.master" %>

<script runat="server">

</script>

<asp:Content ID="Content1" ContentPlaceHolderID="cp" Runat="Server">
<html>
<head>
<style type="text/css">
    div.gallery
    {
        margin:5px;
        border: px solid #ccc;
        float:left;
        width:auto;
    }
    div.gallery: hover
    {
        border: 1px solid #777;
    }
    div.gallery img
    {
        width:100%;
        height:auto;
    }
    div.desc
    {
        padding:15px;
        text-align:center;
       
</style>
</head>
<body>
<h1><center><b>Photo Gallery</b></center></h1>
<div class="gallery">
<a target="_blank" href="images/logo1.png">
<img src="images/logo1.png" alt="logo" /></a>

</div>
<img src="images/1.jpg"  />
<img src="images/d2.jpg" />
<img src="images/d1.jpg" />
<img src="images/2.jpg" />
<img src="images/3.jpg" />
<img src="images/hostel1.jpg" />
<img src="images/4.jpg" />
<img src="images/hostel.jpg" />
</body>
</html>
</asp:Content>

