<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Registration.aspx.cs" Inherits="WebApplication1.WebForm1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .style1
        {
            width: 67%;
            height: 71px;
            margin-bottom: 4px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <table class="style1">
        <tr>
            <td>
                <asp:Label ID="Label1" runat="server" Text="Name"></asp:Label>
            </td>
            <td>
                <asp:TextBox ID="TextBox1" runat="server" ontextchanged="TextBox1_TextChanged"></asp:TextBox>
            </td>
            <td>
                <asp:RequiredFieldValidator runat="server" ControlToValidate="TextBox1" 
                    ErrorMessage="Entry can't be blank"></asp:RequiredFieldValidator>
            </td>
        </tr>
        <tr>
            <td>
                &nbsp;</td>
            <td>
                &nbsp;</td>
            <td>
                &nbsp;</td>
        </tr>
        <tr>
            <td>
                <asp:Label ID="Label2" runat="server" Text="Address"></asp:Label>
            </td>
            <td>
                <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
            </td>
            <td>
                <asp:RequiredFieldValidator runat="server" ControlToValidate="TextBox2" 
                    ErrorMessage="Required field"></asp:RequiredFieldValidator>
            </td>
        </tr>
        <tr>
            <td>
                &nbsp;</td>
            <td>
                &nbsp;</td>
            <td>
                &nbsp;</td>
        </tr>
        <tr>
            <td>
                <asp:Label ID="Label3" runat="server" Text="Gender"></asp:Label>
            </td>
            <td>
                <asp:RadioButton ID="rbfemale" runat="server" GroupName="gender" 
                    Text="Female" />
                &nbsp;&nbsp;&nbsp;&nbsp;<asp:RadioButton ID="rbmale" runat="server" 
                    GroupName="gender" Text="Male" />
            </td>
            <td>
                &nbsp;</td>
        </tr>
        <tr>
            <td>
                &nbsp;</td>
            <td>
                &nbsp;</td>
            <td>
                &nbsp;</td>
        </tr>
        <tr>
            <td>
                <asp:Label ID="Label6" runat="server" Text="Contact"></asp:Label>
            </td>
            <td>
                <asp:TextBox ID="TextBox4" runat="server"></asp:TextBox>
            </td>
            <td>
                <asp:RegularExpressionValidator ID="RegularExpressionValidator1" runat="server" 
                    ControlToValidate="TextBox4" ErrorMessage="Invalid contact" 
                    ValidationExpression="\d{10}"></asp:RegularExpressionValidator>
            </td>
        </tr>
        <tr>
            <td>
                &nbsp;</td>
            <td>
                &nbsp;</td>
            <td>
                &nbsp;</td>
        </tr>
        <tr>
            <td>
                <asp:Label ID="Label5" runat="server" Text="Year"></asp:Label>
            </td>
            <td>
                <asp:TextBox ID="TextBox5" runat="server"></asp:TextBox>
            </td>
            <td>
                <asp:RangeValidator ID="RangeValidator1" runat="server" 
                    ControlToValidate="TextBox5" ErrorMessage="Studing year is invalid" 
                    MaximumValue="4" MinimumValue="1"></asp:RangeValidator>
            </td>
        </tr>
        <tr>
            <td>
                &nbsp;</td>
            <td>
                &nbsp;</td>
            <td>
                &nbsp;</td>
        </tr>
        <tr>
            <td>
                <asp:Label ID="Label7" runat="server" Text="Room Type"></asp:Label>
            </td>
            <td>
                <asp:RadioButton ID="rbac" runat="server" GroupName="rt" Text="AC" />
               &nbsp;&nbsp;&nbsp;&nbsp; <asp:RadioButton ID="rbcooler" runat="server" 
                    GroupName="rt" Text="Cooler" />
                &nbsp;&nbsp;&nbsp;&nbsp;<asp:RadioButton ID="rbfan" runat="server" 
                    GroupName="rt" Text="Fan" />
            </td>
            <td>
                &nbsp;</td>
        </tr>
        <tr>
            <td>
                &nbsp;</td>
            <td>
                &nbsp;</td>
            <td>
                &nbsp;</td>
        </tr>
    </table>
    <div>
    
        <asp:Button ID="Button1" runat="server" onclick="Button1_Click" Text="Save" />
    
    </div>
    </form>
</body>
</html>
