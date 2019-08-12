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
    public partial class WebForm1 : System.Web.UI.Page
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

        protected void TextBox1_TextChanged(object sender, System.EventArgs e)
        {

        }

        protected void Button1_Click(object sender, System.EventArgs e)
        {
            try
            {
                string connectionString = "SERVER=" + server + ";" + "DATABASE=" + database + ";" + "PORT=" + port + ";" + "UID=" + uid + ";default command timeout=0;" + "PASSWORD=" + password + ";";
                connection = new MySqlConnection(connectionString);
                connection.Open();
                string sql = "insert into new_student(Name,Address,Gender,Year,Contact,RoomType)values(@Name,@Adress,@Gender,@Year,@Contact,@RoomType)";
                MySqlCommand cmd = new MySqlCommand(sql, connection);
                cmd.Parameters.Add("Name", TextBox1.Text);
                cmd.Parameters.Add("Adress", TextBox2.Text);
                cmd.Parameters.Add("Contact", TextBox4.Text);
                cmd.Parameters.Add("Year", TextBox5.Text);
                if (rbmale.Checked == true)
                {
                    cmd.Parameters.Add("Gender", rbmale.Text);
                }
                else
                {
                    cmd.Parameters.Add("Gender", rbfemale.Text);
                }

                if (rbac.Checked == true)
                {
                    cmd.Parameters.Add("RoomType", rbac.Text);
                }
                else if (rbcooler.Checked == true)
                {
                    cmd.Parameters.Add("RoomType", rbcooler.Text);
                }
                else {
                    cmd.Parameters.Add("RoomType", rbfan.Text);
                }
                cmd.ExecuteNonQuery();
                Response.Write("sucess");
                connection.Close();
              }
            catch(Exception ex)
            {
                Response.Write(ex.ToString());
            }
        }
}
}