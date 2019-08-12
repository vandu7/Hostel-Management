using System;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;
using System.Collections;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;

public partial class Registration : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void LinkButton1_Click(object sender, EventArgs e)
    {

    }
    protected void ImageButton1_Click(object sender, ImageClickEventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        try
        {
            SqlConnection con = new SqlConnection();
            String constr = "Data Source=USER\\SQLEXPRESS;Integrated Security=True";
            con.ConnectionString = constr;
            con.Open();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = con;
            string sql = "insert into users values(@userid,@username,@password)";
            cmd.CommandText = sql;
            cmd.Parameters.Add(new SqlParameter("userid", TextBox2.Text));
            cmd.Parameters.Add(new SqlParameter("username", TextBox1.Text));
            cmd.Parameters.Add(new SqlParameter("password", TextBox3.Text));
            cmd.ExecuteNonQuery();
            Response.Write("sucess");
            Response.Write("<a href=Login.aspx>Click Here To Login</a>");
        }
        catch(Exception ex)
        {
            Response.Write(ex.ToString());
        }


    }
    protected void Button2_Click(object sender, EventArgs e)
    {

    }
}
