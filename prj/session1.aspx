<%@ Page Language="C#" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<script runat="server">
    
    public void page_load(object o, EventArgs e)
    {
        string abc = "";
        
        l1.Text = Session["a"].ToString();
        l2.Text = Session["b"].ToString();
        l3.Text = Session["c"].ToString();
        l4.Text = Session["d"].ToString();
        l5.Text = Session["e"].ToString();
        l6.Text = Session["f"].ToString();
        l7.Text = Session["g"].ToString();
        l8.Text = Session["h"].ToString();
        l9.Text = Session["i"].ToString();
     
        l11.Text = Session["k"].ToString();
        l12.Text = Session["l"].ToString();
        l13.Text = Session["m"].ToString();
        l14.Text = Session["n"].ToString();
        l15.Text = Session["o"].ToString();


        if (Session["p"] != null)
        {
            abc = Session["p"].ToString();
        }
        if (Session["q"] != null)
        {
            abc += Session["q"].ToString();
        }
        if (Session["r"] != null)
        {
            abc = Session["r"].ToString();
        }
        if (Session["s"] != null)
        {
            abc += Session["s"].ToString();
        }
        if (Session["t"] != null)
        {
            abc += Session["t"].ToString();
        }

        l16.Text = abc;
      
        l21.Text = Session["u"].ToString();
        l22.Text = Session["v"].ToString();
        l23.Text = Session["w"].ToString();
        l24.Text = Session["x"].ToString();
        l25.Text = Session["y"].ToString();
        l26.Text = Session["z"].ToString();
        l27.Text = Session["1"].ToString();
        l28.Text = Session["2"].ToString();
        l29.Text = Session["3"].ToString();
        l30.Text = Session["4"].ToString();
        l31.Text = Session["5"].ToString();
    }

</script>

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1" runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    <h1>RESUME</h1>
    <asp:Label ID=l1 runat=server></asp:Label>
    <br />
     <asp:Label ID=l2 runat=server></asp:Label>
     <asp:Label ID=l3 runat=server></asp:Label><br />
     <asp:Label ID=l4 runat=server></asp:Label>
      <asp:Label ID=l5 runat=server></asp:Label><br />
 <asp:Label ID=l6 runat=server></asp:Label>
 <asp:Label ID=l7 runat=server></asp:Label><br />
 <asp:Label ID=l8 runat=server></asp:Label>
 <asp:Label ID=l9 runat=server></asp:Label><br />
 <asp:Label ID=l11 runat=server></asp:Label>
 <asp:Label ID=l12 runat=server></asp:Label><br />
 <asp:Label ID=l13 runat=server></asp:Label>
 <asp:Label ID=l14 runat=server></asp:Label><br />
       <asp:Label ID=l15 runat=server></asp:Label>
        <asp:Label ID=l16 runat=server></asp:Label>
         <asp:Label ID=l17 runat=server></asp:Label>
          <asp:Label ID=l18 runat=server></asp:Label>
      <asp:Label ID=l19 runat=server></asp:Label><br />
        <asp:Label ID=l20 runat=server></asp:Label>

<asp:Label ID=l21 runat=server></asp:Label>
<asp:Label ID=l22 runat=server></asp:Label>
<asp:Label ID=l23 runat=server></asp:Label>
<asp:Label ID=l24 runat=server></asp:Label>
<asp:Label ID=l25 runat=server></asp:Label>
<asp:Label ID=l26 runat=server></asp:Label>
<asp:Label ID=l27 runat=server></asp:Label>
<asp:Label ID=l28 runat=server></asp:Label>
<asp:Label ID=l29 runat=server></asp:Label>
<asp:Label ID=l30 runat=server></asp:Label>
<asp:Label ID=l31 runat=server></asp:Label>

        <asp:Label ID=Label1 runat=server></asp:Label>
    </div>
    </form>
</body>
</html>
