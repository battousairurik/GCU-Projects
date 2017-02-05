using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Week5AccountDatabase
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
           // checking_account_balance.Text = BankAccounts/Account Type Checking/Account Balance;
           // savings_account_balance.Text = BankAccounts/Account Type Savings/Account Balance;
           // I currently cannot figure out how to set up the queries for the Database to pull informaiton
        }


        private void process_click(object sender, EventArgs e)
        {
            int amount = Convert.ToInt32(textBox1.Text);
            Amount = amount;
            processing_amount.Text = Convert.ToString(amount);
        }
        public int Amount;

        private void help_click(object sender, EventArgs e)
        {
            MessageBox.Show("First Enter the amount to be processed."
                + "\nThen choose whether to transfer the amount"
                + "\nto Checking or to Savings."
                );
        }

        private void to_savings_click(object sender, EventArgs e)
        {
            //subtract Amount from Checking Balance
            //add Amount to Savings Balance
            //update savings_account_balance.Text
        }

        private void to_checking_click(object sender, EventArgs e)
        {
            //subtract Amount from Savings Balance
            //add Amount to Checking Balance
            //update checking_account_balance.Text
        }
    }
}
