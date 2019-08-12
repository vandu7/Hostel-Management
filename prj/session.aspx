

<%@ Page Language="C#" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<script runat="server">
    public void bt(object o, EventArgs e)
    {

     
        Session["a"] = "RESUME";
        Session["b"] = "Name :";
        Session["c"] = f1.Text;
        Session["d"] = "Father's Name :";
        Session["e"] = f2.Text;
        Session["f"] = "Mother's Name :";
        Session["g"] = f3.Text;
        Session["h"] = "Sex :";
        if (f4.Checked == true)
            Session["i"] = f4.Text;
        else
            Session["i"] = f5.Text;
        Session["k"] = "Date of birth :";
        Session["l"] = f6.SelectedDate.ToString();
        Session["m"] = "Address :";
        Session["n"] = f7.SelectedValue;
        Session["o"] = "Hobby :";
        if (c1.Checked == true)  
            Session["p"] = c1.Text ;
        if (c2.Checked == true)
            Session["q"] = c2.Text;
        if (c3.Checked == true)
            Session["r"] = c3.Text;
        if (c4.Checked == true)
            Session["s"] = c4.Text;
        if (c5.Checked == true)
            Session["t"] = c5.Text;


        Session["u"] = "Higher Education :";
        Session["v"] = q1.Text;
        Session["w"] = "Percentage of :";
        Session["x"] = "10th :";
        Session["y"] = p1.Text;
        Session["z"] = "12th :";
        Session["1"] = p2.Text;
        Session["2"] = "Graduate :";
        Session["3"] = p3.Text;
        Session["4"] = "Undergraduate :";
        Session["5"] = p4.Text;
        Response.Redirect("session1.aspx");

    }

</script>

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1" runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div
     <h1>ENTER YOUR DETAILS</h1>
   <b> Name</b> &nbsp;&nbsp;&nbsp; <asp:TextBox id=f1 runat="server"></asp:TextBox><br />
    <b>Father's Name</b> <asp:TextBox id=f2 runat="server"></asp:TextBox><br />
   <b>Mother's Name</b>  <asp:TextBox id=f3 runat="server"></asp:TextBox><br />

    <b>Sex</b> <asp:RadioButton ID=f4 runat="server" text="Male" GroupName="a" />
    <asp:RadioButton ID=f5 runat="server" Text="Female" GroupName="a" /><br />

    <b>Date of birth</b> <asp:Calendar ID=f6 runat="server"></asp:Calendar><br />

    <b>Address:</b> State<asp:DropDownList ID=f7 runat="server">
    <asp:ListItem >Select</asp:ListItem>
    <asp:ListItem >Bihar</asp:ListItem>
    <asp:ListItem >MadhyaPradesh</asp:ListItem>
    <asp:ListItem >Rajasthan</asp:ListItem>
    <asp:ListItem >UttarPradesh</asp:ListItem>
    </asp:DropDownList><br />

   <b>Hobby</b> <asp:CheckBox ID=c1 runat="server" text="Singing"/>
    <asp:CheckBox ID=c2 runat="server" text="Dancing"/>
    <asp:CheckBox ID=c3 runat="server" text="Painting"/>
    <asp:CheckBox ID=c4 runat="server" text="Acting"/>
    <asp:CheckBox ID=c5 runat="server" text="Other"/><br />

   <b>Higher Qualification</b><asp:DropDownList ID=q1 runat="server" >
     <asp:ListItem>Select</asp:ListItem>
    <asp:ListItem>Undergraduate</asp:ListItem>
     <asp:ListItem>Graduate</asp:ListItem>
      <asp:ListItem>Postgraduate</asp:ListItem>
       <asp:ListItem>P.hd</asp:ListItem>
    </asp:DropDownList><br />

    <b>Percentage of:</b><br />
     10th<asp:TextBox ID=p1 runat="server"></asp:TextBox><br />
    12th<asp:TextBox ID=p2 runat="server"></asp:TextBox><br />
    Graduation<asp:TextBox ID=p3 runat="server"></asp:TextBox><br />
    PostGraduation<asp:TextBox ID=p4 runat="server"></asp:TextBox><br />

    <asp:Button ID=b1 runat="server" OnClick="bt" text="submit"/><br />


    
    </div>
    </form>
</body>
</html>
