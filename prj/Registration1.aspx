<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Registration1.aspx.cs" Inherits="Registration" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>Untitled Page</title>
    <script type="text/javascript">
        function validateUserId()
        {
            alert("hello");
            var userid=document.getElementById("TextBox2").value;
            alert(userid);
            if(userid=="abcdef")
            {
                alert("invalid userid");
            }
        
        }
        
    </script>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <table style="width: 570px">
            <tr>
                <td>
                    UserName</td>
                <td>
                    <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox></td>
                <td>
                    <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="TextBox1"
                        ErrorMessage="User Name can't be left blank">*</asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td>
                    User ID</td>
                <td>
                    <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox></td>
                <td>
                    <asp:CustomValidator ID="CustomValidator1" runat="server" ClientValidationFunction="validateUserId"
                        ControlToValidate="TextBox2" ErrorMessage="User Id Length improper" ValidateEmptyText="True">check userid</asp:CustomValidator></td>
            </tr>
            <tr>
                <td>
                    Password</td>
                <td>
                    <asp:TextBox ID="TextBox3" runat="server" TextMode="Password" Width="149px"></asp:TextBox></td>
                <td>
                </td>
            </tr>
            <tr>
                <td>
                    Retype Password</td>
                <td>
                    <asp:TextBox ID="TextBox5" runat="server" TextMode="Password"></asp:TextBox></td>
                <td>
                    <asp:CompareValidator ID="CompareValidator1" runat="server" ControlToCompare="TextBox3"
                        ControlToValidate="TextBox5" ErrorMessage="Password Mismatch">Retype Password</asp:CompareValidator></td>
            </tr>
            <tr>
                <td>
                    Age</td>
                <td>
                    <asp:TextBox ID="TextBox6" runat="server"></asp:TextBox></td>
                <td>
                    <asp:RangeValidator ID="RangeValidator1" runat="server" ControlToValidate="TextBox6"
                        ErrorMessage="Age Out of Range" MaximumValue="30" MinimumValue="1" Type="Integer">Check Age</asp:RangeValidator></td>
            </tr>
            <tr>
                <td>
                    Address</td>
                <td>
                    <asp:TextBox ID="TextBox4" runat="server" Height="91px" TextMode="MultiLine" Width="150px"></asp:TextBox></td>
                <td>
                </td>
            </tr>
            <tr>
                <td>
                    City</td>
                <td>
                    <asp:DropDownList ID="DropDownList1" runat="server">
                        <asp:ListItem>Kanpur</asp:ListItem>
                        <asp:ListItem>Lucknow</asp:ListItem>
                        <asp:ListItem>Mumbai</asp:ListItem>
                    </asp:DropDownList></td>
                <td>
                </td>
            </tr>
            <tr>
                <td style="height: 127px">
                    Qualification</td>
                <td style="height: 127px">
                    <asp:ListBox ID="ListBox1" runat="server" Height="34px" Width="121px">
                        <asp:ListItem Value="10">High School</asp:ListItem>
                        <asp:ListItem Value="12">Intermediate</asp:ListItem>
                        <asp:ListItem Value="15">Gradute</asp:ListItem>
                    </asp:ListBox></td>
                <td style="height: 127px">
                </td>
            </tr>
            <tr>
                <td>
                    <br />
                    Gender</td>
                <td>
                    <asp:RadioButtonList ID="RadioButtonList1" runat="server" RepeatDirection="Horizontal">
                        <asp:ListItem Value="m">Male</asp:ListItem>
                        <asp:ListItem Value="f">Female</asp:ListItem>
                    </asp:RadioButtonList></td>
                <td>
                </td>
            </tr>
            <tr>
                <td>
                    Mobile</td>
                <td>
                    <asp:TextBox ID="TextBox8" runat="server"></asp:TextBox></td>
                <td>
                    <asp:RegularExpressionValidator ID="RegularExpressionValidator2" runat="server" ControlToValidate="TextBox8"
                        ErrorMessage="Invalid Mobile" ValidationExpression="\d{10}">check mobile</asp:RegularExpressionValidator>
                </td>
            </tr>
            <tr>
                <td>
                    Email</td>
                <td>
                    <asp:TextBox ID="TextBox7" runat="server"></asp:TextBox></td>
                <td>
                    <asp:RegularExpressionValidator ID="RegularExpressionValidator1" runat="server" ControlToValidate="TextBox7"
                        ErrorMessage="Invalid Email format" ValidationExpression="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*">check email</asp:RegularExpressionValidator></td>
            </tr>
            <tr>
                <td>
                    <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Save" /></td>
                <td>
                    <asp:ImageButton ID="ImageButton1" runat="server" Height="22px" ImageUrl="~/images/logo.jpg"
                        OnClick="ImageButton1_Click" Width="36px" />&nbsp;
                    <asp:LinkButton ID="LinkButton1" runat="server" OnClick="LinkButton1_Click">Delete</asp:LinkButton></td>
                <td>
                </td>
            </tr>
            <tr>
                <td>
                    <asp:FileUpload ID="FileUpload1" runat="server" /></td>
                <td>
                </td>
                <td>
                </td>
            </tr>
        </table>
    
    </div>
        <br />
        <asp:ValidationSummary ID="ValidationSummary1" runat="server" />
    </form>
</body>
</html>
