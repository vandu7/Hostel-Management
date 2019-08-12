<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="complain.aspx.cs" Inherits="WebApplication1.WebForm2"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>

    <style type="text/css">
        .newStyle1
        {
            font-family: "Arial Rounded MT Bold";
        }
        .newStyle2
        {
            font-family: "Arial Rounded MT Bold";
        }
        .newStyle3
        {
            border-style: hidden hidden dotted hidden;
        }
        .newStyle4
        {
            font-family: "Arial Black";
        }
        .newStyle5
        {
            font-family: "Arial Black";
        }
        .newStyle6
        {
            font-family: Algerian;
        }
        .newStyle7
        {
            font-family: Algerian;
        }
        .newStyle8
        {
            border-bottom-style: dashed;
        }
        .newStyle9
        {
            font-family: Algerian;
            border-bottom-style: dashed;
        }
        .newStyle10
        {
            font-family: Algerian;
        }
        .newStyle11
        {
            font-family: Algerian;
            background-color: #3399FF;
        }
        .newStyle12
        {
            font-family: Algerian;
            background-color: #FF3399;
        }
        .newStyle13
        {
            font-family: Algerian;
            background-color: #99CCFF;
        }
        .newStyle14
        {
            font-family: Algerian;
            background-color: #FFCCFF;
        }
        .newStyle15
        {
            font-family: Algerian;
            background-color: #FFFFFF;
        }
        .newStyle16
        {
            font-family: Algerian;
            background-color: #FFFFFF;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div class="newStyle15">
    <center><b>COMPLAIN<br />
        <br />
        </b></center>
         &nbsp;&nbsp;&nbsp;&nbsp; Complain Type&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <asp:CheckBox ID="Fooding" runat="server" Text="Fooding" />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;
        <asp:CheckBox ID="Logging" runat="server" Text="Logging" />
        <br />
        <br />
        
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <asp:Label ID="Label1" runat="server" Text="Comments"></asp:Label>
        
        
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox1" runat="server" Height="35px" Width="186px" 
            TextMode="MultiLine"></asp:TextBox>
        <br />
        <br />
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Button ID="Button2" runat="server" onclick="Button2_Click" Text="Submit" />
        </div>
        <div class="newStyle16">
        <center><b>FEEDBACK</b></center><br /> 
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        For Further Improvment Kindly Give Your Feedback According To Your Experience.....<br />
&nbsp;<br />
        
            <br />
            &nbsp; Please Write Here&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox2" runat="server" Height="28px" Width="221px" 
                TextMode="MultiLine"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <br />
            <br />
            <br />
           
            &nbsp;&nbsp;&nbsp;&nbsp;
           
            <asp:Button ID="Button1" runat="server" onclick="Button1_Click" Text="Submit" />
            <br />
    </div>
    </form>
    <p>
        *Appering in first year student is not applicable to give feedback
    </p>
    <p>
        *Any hostler give complain any time its responsiblity of hostel warden to 
        solve problem ; if any condition problem is not solved then hostler can complain 
        their college to hostel incharge with copy of online complain</p>
    <p>
        &nbsp;</p>
    <p>
        &nbsp;</p>
</body>
</html>
