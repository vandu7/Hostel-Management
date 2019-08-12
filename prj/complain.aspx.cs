using System.Data;
using System.Data.SqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Configuration;
using System.Collections;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using MySql.Data.MySqlClient;

namespace WebApplication1
{
    public partial class WebForm2 : System.Web.UI.Page
    {
        private MySqlConnection connection;
        private string server = "mysql8.db4free.net";
        private string database = "vyas";
        private string uid = "amisium098";
        private string password = "tomato02";
        private string port = "3307";
        protected void Page_Load(object sender, EventArgs e)
        {
            
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            try
            {
                string connectionString = "SERVER=" + server + ";" + "DATABASE=" + database + ";" + "PORT=" + port + ";" + "UID=" + uid + ";default command timeout=0;" + "PASSWORD=" + password + ";";
                connection = new MySqlConnection(connectionString);
                connection.Open();
                string sql = "insert into fed values(@feed)";
                MySqlCommand cmd = new MySqlCommand(sql, connection);
                cmd.Parameters.Add("feed", TextBox2.Text);
                cmd.ExecuteNonQuery();
                connection.Close();
                Response.Write("sucess");
              }
            catch(Exception ex)
            {
                Response.Write(ex.ToString());
            }
        }

        



        protected void Button2_Click(object sender, EventArgs e)
        {
            DateTime time = DateTime.Now;
            string msg = "user you complain  " + TextBox1.Text + " report at" + time;
            System.Text.StringBuilder sb = new System.Text.StringBuilder();
            sb.Append("<script type = 'text/javascript'>");
            sb.Append("window.onload=function(){");
            sb.Append("alert('");
            sb.Append(msg);
            sb.Append("')};");
            sb.Append("</script>");
            ClientScript.RegisterClientScriptBlock(this.GetType(), "alert", sb.ToString());
            
            try
            {
                string connectionString = "SERVER=" + server + ";" + "DATABASE=" + database + ";" + "PORT=" + port + ";" + "UID=" + uid + ";default command timeout=0;" + "PASSWORD=" + password + ";";
                connection = new MySqlConnection(connectionString);
                connection.Open();
                string sql = "insert into com values(@comp)";
                MySqlCommand cmd = new MySqlCommand(sql, connection);
                cmd.Parameters.Add("comp", TextBox1.Text);
                cmd.ExecuteNonQuery();
                connection.Close();
              }
            catch(Exception ex)
            {
                Response.Write(ex.ToString());
            }
        }
           
        }
    }